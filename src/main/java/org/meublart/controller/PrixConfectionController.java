/**
 * 
 */
package org.meublart.controller;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

import org.etu2020.ModelView;
import org.etu2020.annotation.WebMethod;
import org.etu2020.annotation.WebService;
import org.meublart.view.VMeublePrixConfection;
import org.miframework.generic.GenericDac;

/**
 * @author miaro
 *
 */
@WebService
public class PrixConfectionController {
	
	/**
	 * Demande 3 sortie
	 * @param min
	 * @param max
	 * @return
	 * @throws Exception
	 */
	@WebMethod(url="/prixConfectionBetween.do", args = true)
	public ModelView getPrixCOnfectionBetween(double min, double max)throws Exception{
		ModelView result = null;
		Map<String, Object> datas = new HashMap<>();
		
		try (Connection c = GenericDac.generate()){
			
			VMeublePrixConfection getter = new VMeublePrixConfection();
			VMeublePrixConfection[] prixConfections = getter.getPrixConfectinBetween(c, min, max);
			datas.put("prixConfection", prixConfections);
			
		} catch (Exception e) {
			throw e;
		}
		
		result = new ModelView("MinMaxPrixListe.jsp", datas);
		return result;
	}

}
