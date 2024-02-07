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
import org.meublart.model.Client;
import org.meublart.model.Meuble;
import org.meublart.model.StatistiqueGenre;
import org.miframework.generic.GenericDac;
import org.miframework.generic.GenericDao;

/**
 *
 * @author miaro
 */
@WebService
public class StatistiqueGenreController {
    @WebMethod(url="/listeStat.do")
    public ModelView listeStatistique() throws Exception{
        List<StatistiqueGenre> liste = new ArrayList<StatistiqueGenre>();
        Map<String,Object> hash = new HashMap<>();
        try(Connection c = GenericDac.generate()){
            liste = GenericDao.getAll(c, StatistiqueGenre.class);
            hash.put("listeStat", liste);

        }catch(Exception e){
            throw e;
        }
        return new ModelView("NewStatistique.jsp",hash );
    }
}
