/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.meublart.controller;

import org.etu2020.ModelView;
import org.etu2020.annotation.WebMethod;
import org.etu2020.annotation.WebService;
import org.meublart.model.StyleMeuble;
import org.meublart.model.TempsConfection;
import org.meublart.view.VBeneficeMeuble;
import org.meublart.model.CategorieMeuble;

import org.miframework.generic.GenericDac;
import org.miframework.generic.GenericDao;
import java.sql.Connection;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author pc
 */
@WebService
public class TempsConfectionController {
	
	/**
	 * Demande 4 sortie
	 * @param min
	 * @param max
	 * @return
	 * @throws Exception
	 */
	@WebMethod(url="/beneficeBetween.do", args = true)
	public ModelView prixConfectionAvecMainDOeuvreEntre(double min, double max)throws Exception{
		ModelView result = null;
		Map<String, Object> datas = new HashMap<>();
		
		try (Connection c = GenericDac.generate()){
			
			VBeneficeMeuble getter = new VBeneficeMeuble();
			VBeneficeMeuble[] benefices = getter.getBeneficeBetween(c, min, max);
			datas.put("benefices", benefices);
			
		} catch (Exception e) {
			throw e;
		}
		
		result = new ModelView("MinMaxBeneficeListe.jsp", datas);
		return result;
	}
	
    @WebMethod(url="/nouveautempsforme.do")
    public ModelView listeStyle() throws Exception{
        List<StyleMeuble> styles = new ArrayList<StyleMeuble>();
        List<CategorieMeuble> categories = new ArrayList<CategorieMeuble>();
        Map<String,Object> hash = new HashMap<>();
        try(Connection c = GenericDac.generate()){
            styles = GenericDao.getAll(c, StyleMeuble.class);
            categories =  GenericDao.getAll(c, CategorieMeuble.class);
            hash.put("styles", styles);
            hash.put("categories", categories);
        }catch(Exception e){
            throw e;
        }
        return new ModelView("NewTemps.jsp",hash );
    }
    @WebMethod(url="/nouveautemps.do", args = true)
    public ModelView insererTempsConfection(LocalTime temps, Integer idStyle, Integer idCategorie )throws Exception{
        Map<String,Object> hash = new HashMap<>();
        try(Connection c = GenericDac.generate()){
            StyleMeuble s = GenericDao.findById(c, StyleMeuble.class, idStyle);
            CategorieMeuble categorie = GenericDao.findById(c, CategorieMeuble.class, idCategorie);
            TempsConfection t = new TempsConfection(null, temps, s, categorie);
            GenericDao.insert(c, t );
        }catch(Exception e){
            throw e;
        }
        return listeStyle();
    }
}
