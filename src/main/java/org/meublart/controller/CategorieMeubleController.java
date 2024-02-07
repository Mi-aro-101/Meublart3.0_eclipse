/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.meublart.controller;

import org.etu2020.ModelView;
import org.etu2020.annotation.WebMethod;
import org.etu2020.annotation.WebService;
import org.meublart.model.CategorieMeuble;
import org.miframework.generic.GenericDac;
import org.miframework.generic.GenericDao;
import java.sql.Connection;
import java.util.*;
/**
 *
 * @author pc
 */
@WebService
public class CategorieMeubleController {
    @WebMethod(url="/nouveaucategorie.do", args = true)
    public ModelView insererCategorie(String designation)throws Exception{
        CategorieMeuble categorie = new CategorieMeuble(null, designation);
        Map<String,Object> hash = new HashMap<>();
        try(Connection c = GenericDac.generate()){
            GenericDao.insert(c,categorie);
        }catch(Exception e){
            throw e;
        }
        return new ModelView("Newcategorie.jsp",hash);
    }
}
