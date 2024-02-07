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
import org.meublart.model.Genre;
import org.meublart.model.Client;
import org.miframework.generic.GenericDac;
import org.miframework.generic.GenericDao;

/**
 *
 * @author miaro
 */
@WebService
public class ClientController {
    @WebMethod(url="/nouveauclientforme.do")
    public ModelView listeGenre() throws Exception{
        List<Genre> liste = new ArrayList<Genre>();
        Map<String,Object> hash = new HashMap<>();
        try(Connection c = GenericDac.generate()){
            liste = GenericDao.getAll(c, Genre.class);
            hash.put("liste", liste);
        }catch(Exception e){
            throw e;
        }
        return new ModelView("NewClient.jsp",hash );
    }
    @WebMethod(url="/nouveauclient.do", args = true)
    public ModelView insererClient(String nom, Integer idGenre)throws Exception{
        try(Connection c = GenericDac.generate()){
            Genre p = GenericDao.findById(c, Genre.class, idGenre);
            Client client = new Client(null, nom, p);
            GenericDao.insert(c,client);
        }catch(Exception e){
            throw e;
        }
        return listeGenre();
    }
}
