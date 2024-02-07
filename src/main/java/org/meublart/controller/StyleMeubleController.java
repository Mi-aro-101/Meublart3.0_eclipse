/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.meublart.controller;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.etu2020.ModelView;
import org.etu2020.annotation.WebMethod;
import org.etu2020.annotation.WebService;
import org.meublart.model.MatierePremiere;
import org.meublart.model.StyleMatierePremiere;
import org.meublart.model.StyleMeuble;
import org.miframework.generic.GenericDac;
import org.miframework.generic.GenericDao;

/**
 *
 * @author pc
 */
@WebService
public class StyleMeubleController {
   
    @WebMethod(url="/nouveaustyle.do")
    public ModelView listeMatierePremiere() throws Exception{
        List<MatierePremiere> liste = new ArrayList<MatierePremiere>();
        Map<String,Object> hash = new HashMap<>();
        try(Connection c = GenericDac.generate()){
            liste = GenericDao.getAll(c, MatierePremiere.class);
            hash.put("liste", liste);
        }catch(Exception e){
            throw e;
        }
        return new ModelView("NewStyle.jsp",hash );
    }
    
    /**
     * Form demande 1
     * @return
     * @throws Exception
     */
    @WebMethod(url="/styles.do")
    public ModelView listeStyle() throws Exception{
        List<StyleMeuble> listeStyle = new ArrayList<StyleMeuble>();
        Map<String,Object> hash = new HashMap<>();
        try(Connection c = GenericDac.generate()){
            listeStyle = GenericDao.getAll(c, StyleMeuble.class);
            hash.put("style", listeStyle);
        }catch(Exception e){
            throw e;
        }
        return new ModelView("styles.jsp",hash );
    }
    
    /**
     * Reponse pour demande 1
     * @param idStyle
     * @return
     * @throws Exception
     */
    @WebMethod(url="/stylematieres.do", args= true)
    public ModelView listeMatieres(Integer idStyle) throws Exception{
        Map<String, String> condition = new HashMap<>();
        Map<String,Object> hash = new HashMap<>();
        try(Connection c = GenericDac.generate()){
            condition.put("id_style_meuble", idStyle.toString());
            List<StyleMatierePremiere> liste = GenericDao.findBy(c, StyleMatierePremiere.class, condition);
            hash.put("listeMatieres", liste);
        }catch(Exception e){
            throw e;
        }
        return new ModelView("listeMatieres.jsp", hash);
    }
}
