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
import org.meublart.model.Client;
import org.meublart.model.MeubleParam;
import org.meublart.model.Taille;
import org.meublart.model.Vente;

import org.miframework.generic.GenericDac;
import org.miframework.generic.GenericDao;

/**
 *
 * @author miaro
 */
@WebService
public class VenteController {
    @WebMethod(url="/nouveauventeforme.do")
    public ModelView liste() throws Exception{
        List<MeubleParam> liste = new ArrayList<MeubleParam>();
        List<Client> clients = new ArrayList<Client>();
        Map<String,Object> hash = new HashMap<>();
        try(Connection c = GenericDac.generate()){
            liste = GenericDao.getAll(c, MeubleParam.class);
            clients = GenericDao.getAll(c, Client.class);
            hash.put("meubles", liste);
            hash.put("clients", clients);

        }catch(Exception e){
            throw e;
        }
        return new ModelView("NewVente.jsp",hash );
    }
    @WebMethod(url="/nouveauvente.do", args = true)
    public ModelView insererVente(Integer idMeubleParam, Integer idClient, Integer idTaille, LocalDate dateVente)throws Exception{
        try(Connection c = GenericDac.generate()){
            MeubleParam m = GenericDao.findById(c, MeubleParam.class, idMeubleParam);
            Client cl = GenericDao.findById(c, Client.class, idClient);
            Taille t = GenericDao.findById(c, Taille.class, idTaille);
            Vente v = new Vente(null, cl, m, dateVente, t);
            GenericDao.insert(c,v);
        }catch(Exception e){
            throw e;
        }
        return liste();
    }
}
