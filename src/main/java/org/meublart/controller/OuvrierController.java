/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.meublart.controller;

import org.etu2020.ModelView;
import org.etu2020.annotation.WebMethod;
import org.etu2020.annotation.WebService;
import org.meublart.model.Ouvrier;
import org.meublart.model.OuvrierDetails;
import org.meublart.model.Poste;

import org.miframework.generic.GenericDac;
import org.miframework.generic.GenericDao;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.LocalDate;
/**
 *
 * @author pc
 */
@WebService
public class OuvrierController {
	/**
	 * Demande 5 sortie (No entree)
	 * @return
	 * @throws Exception
	 */
	@WebMethod(url="/etatSalariale.do")
	public ModelView getSalaireEtGrade()throws Exception{
		ModelView result = null;
		Map<String, Object> datas = new HashMap<>();
		
		try (Connection c = GenericDac.generate()){
			
			List<OuvrierDetails> ouvriers = GenericDao.getAll(c, OuvrierDetails.class);
			datas.put("ouvriers", ouvriers);
			
		} catch (Exception e) {
			throw e;
		}
		
		result = new ModelView("EtatSalariale.jsp", datas);
		return result;
	}
	
    @WebMethod(url="/nouveauouvrierforme.do")
    public ModelView listePoste() throws Exception{
        List<Poste> liste = new ArrayList<Poste>();
        Map<String,Object> hash = new HashMap<>();
        try(Connection c = GenericDac.generate()){
            liste = GenericDao.getAll(c, Poste.class);
            hash.put("liste", liste);
        }catch(Exception e){
            throw e;
        }
        return new ModelView("NewOuvrier.jsp",hash );
    }
    @WebMethod(url="/nouveauouvrier.do", args = true)
    public ModelView insererOuvrier(String nomOuvrier, Integer idPoste, LocalDate dateEmbauche)throws Exception{
        Map<String,Object> hash = new HashMap<>();
        try(Connection c = GenericDac.generate()){
            Poste p = GenericDao.findById(c, Poste.class, idPoste);
            Ouvrier ouvrier = new Ouvrier(null, nomOuvrier, p, dateEmbauche);
            GenericDao.insert(c,ouvrier);
        }catch(Exception e){
            throw e;
        }
        return listePoste();
    }
}
