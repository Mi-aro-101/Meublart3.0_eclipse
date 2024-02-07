/**
 * 
 */
package org.meublart.controller;

import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.etu2020.ModelView;
import org.etu2020.annotation.WebMethod;
import org.etu2020.annotation.WebService;
import org.meublart.model.CategorieMeuble;
import org.meublart.model.MatierePremiere;
import org.meublart.model.Meuble;
import org.meublart.model.StyleMeuble;
import org.meublart.model.Taille;
import org.meublart.view.VCompositionMeubleMatiere;
import org.miframework.generic.GenericDac;
import org.miframework.generic.GenericDao;

/**
 * @author miaro
 *
 */
@WebService
public class MeubleController {
	
	@WebMethod(url="/NewFormMeuble.do")
	public ModelView newFormMeuble()throws Exception{
		ModelView results = null;
		Map<String, Object> datas = new HashMap<>();
		
		try (Connection c = GenericDac.generate()){
			
			List<StyleMeuble> styles = GenericDao.getAll(c, StyleMeuble.class);
			List<CategorieMeuble> categories = GenericDao.getAll(c, CategorieMeuble.class);
			datas.put("categories", categories);
			datas.put("styles", styles);
			
		} catch (Exception e) {
			throw e;
		}
		
		results = new ModelView("NewMeuble.jsp", datas);
		return results;
	}
	
	@WebMethod(url="/insertMeuble.do", args = true)
	public ModelView insertMeuble(Integer idStyle, Integer idCategorie, double prixDeVente)throws Exception{
		try (Connection c = GenericDac.generate()){
			StyleMeuble style = GenericDao.findById(c, StyleMeuble.class, idStyle);
			CategorieMeuble categorie = GenericDao.findById(c, CategorieMeuble.class, idCategorie);
			
			Meuble meuble  = new Meuble();
			meuble.setIdCategorie(categorie);
			meuble.setIdMeuble(null);
			meuble.setIdStyle(style);
			meuble.setPrix(prixDeVente);
			
			GenericDao.insert(c, meuble);
		} catch (Exception e) {
			throw e;
		}
		
		return newFormMeuble();
	}
	
	@WebMethod(url = "/NewFormMeubleParam.do")
	public ModelView newFormMeubleParam()throws Exception{
		ModelView result = null;
		Map<String, Object> datas = new HashMap<>();
		
		try (Connection c = GenericDac.generate()){
			
			List<Meuble> meubles = GenericDao.getAll(c, Meuble.class);
			List<Taille> tailles = GenericDao.getAll(c, Taille.class);
			
			datas.put("meubles", meubles);
			datas.put("tailles", tailles);
			
		} catch (Exception e) {
			throw e;
		}
		
		result = new ModelView("NewMeubleParam.jsp", datas);
		return result;
	}
	
	/**
	 * Depart form demande 2
	 * @return
	 * @throws Exception
	 */
	@WebMethod(url="/listerMatierePremiere.do")
	public ModelView getMatierePremierePourListerMeuble()throws Exception{
		ModelView result = null;
		Map<String, Object> datas = new HashMap<>();
		
		try (Connection c = GenericDac.generate()){
			
			List<MatierePremiere> matieresPremieres = GenericDao.getAll(c, MatierePremiere.class);
			datas.put("matierePremieres", matieresPremieres);
			
		} catch (Exception e) {
			throw e;
		}
		
		result = new ModelView("ListeMatierePremiereMeuble.jsp", datas);
		return result;
	}
	
	/**
	 * Reponse rendu pour demande 2
	 */
	@WebMethod(url="/listeMeubleMatiere.do", args = true)
	public ModelView getMeubleParMatierePremiere(Integer idMatierePremiere)throws Exception{
		ModelView result = null;
		Map<String, Object> datas = new HashMap<>();
		
		try (Connection c = GenericDac.generate()){
			
			Map<String, String> condition = new HashMap<>();
			condition.put("id_matiere_premiere", idMatierePremiere.toString());
			List<VCompositionMeubleMatiere> compositions = GenericDao.findBy(c, VCompositionMeubleMatiere.class, condition);
			
			datas.put("compositions", compositions);
			
		} catch (Exception e) {
			throw e;
		}
		
		result = new ModelView("ListeMeubleMatiere.jsp", datas);
		return result;
	}

}
