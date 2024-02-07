/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.meublart.model;

import org.miframework.annotation.Column;
import org.miframework.annotation.Fk;
import org.miframework.annotation.GenerationType;
import org.miframework.annotation.Pk;
import org.miframework.annotation.Table;

/**
 *
 * @author miaro
 */@Table(name="meuble_param")
public class MeubleParam {
    @Column(name = "id_meuble_param")
    @Pk(generation = GenerationType.AUTO)
    Integer idMeubleParam;
    @Fk(join="id_meuble")
    Meuble idMeuble;
    @Fk(join="id_taille")
    Taille idTaille;
    public MeubleParam(){}
    public MeubleParam(Integer id, Meuble m, Taille t){
        this.idMeubleParam = id;
        this.idMeuble = m;
        this.idTaille = t;
    }

    public Meuble getIdMeuble() {
        return idMeuble;
    }

    public void setIdMeuble(Meuble idMeuble) {
        this.idMeuble = idMeuble;
    }

    public Integer getIdMeubleParam() {
        return idMeubleParam;
    }

    public void setIdMeubleParam(Integer idMeubleParam) {
        this.idMeubleParam = idMeubleParam;
    }

    public Taille getIdTaille() {
        return idTaille;
    }

    public void setIdTaille(Taille idTaille) {
        this.idTaille = idTaille;
    }
    
 }