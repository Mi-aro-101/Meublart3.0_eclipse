/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.meublart.controller;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.etu2020.ModelView;
import org.etu2020.annotation.WebMethod;
import org.etu2020.annotation.WebService;
import org.meublart.model.MeubleParam;
import org.meublart.model.Entree;

import org.miframework.generic.GenericDac;
import org.miframework.generic.GenericDao;

/**
 *
 * @author miaro
 */
@WebService
public class EntreeController {
    @WebMethod(url="/nouveauentreeforme.do")
    public ModelView listeMeubleParam() throws Exception{
        List<MeubleParam> liste = new ArrayList<MeubleParam>();
        Map<String,Object> hash = new HashMap<>();
        try(Connection c = GenericDac.generate()){
            liste = GenericDao.getAll(c, MeubleParam.class);
            hash.put("liste", liste);
        }catch(Exception e){
            throw e;
        }
        return new ModelView("NewEntree.jsp",hash );
    }
    @WebMethod(url="/nouveauentree.do", args = true)
    public ModelView insererEntree(Integer idMeubleParam, double quantite, LocalDate dt)throws Exception{
        try(Connection c = GenericDac.generate()){
            MeubleParam p = GenericDao.findById(c, MeubleParam.class, idMeubleParam);
            Entree entree = new Entree(null, p, quantite, dt);
            GenericDao.insert(c,entree);
        }catch(Exception e){
            throw e;
        }
        return listeMeubleParam();
    }
}
