/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.meublart.controller;

import org.etu2020.ModelView;
import org.etu2020.annotation.WebMethod;
import org.etu2020.annotation.WebService;
import org.meublart.model.Poste;
import org.miframework.generic.GenericDac;
import org.miframework.generic.GenericDao;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.meublart.model.MatierePremiere;
/**
 *
 * @author pc
 */
@WebService
public class PosteController {
    @WebMethod(url="/nouveauposte.do", args = true)
    public ModelView insererPoste(String designation, double salaire)throws Exception{
        Poste poste = new Poste(null, designation, salaire);
        Map<String,Object> hash = new HashMap<>();
        try(Connection c = GenericDac.generate()){
            GenericDao.insert(c,poste);
        }catch(Exception e){
            throw e;
        }
        return new ModelView("NewPoste.jsp",hash);
    }
    
}
