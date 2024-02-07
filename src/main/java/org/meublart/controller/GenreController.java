/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.meublart.controller;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import org.etu2020.ModelView;
import org.etu2020.annotation.WebMethod;
import org.etu2020.annotation.WebService;
import org.meublart.model.Genre;
import org.miframework.generic.GenericDac;
import org.miframework.generic.GenericDao;

/**
 *
 * @author miaro
 */
@WebService
public class GenreController {
    @WebMethod(url="/nouveaugenre.do", args = true)
    public ModelView insererGenre(String nom)throws Exception{
        Genre genre = new Genre(null, nom);
        Map<String,Object> hash = new HashMap<>();
        try(Connection c = GenericDac.generate()){
            GenericDao.insert(c,genre);
        }catch(Exception e){
            throw e;
        }
        return new ModelView("NewGenre.jsp",hash);
    }
}
