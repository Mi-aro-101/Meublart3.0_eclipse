
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.meublart.model;

import java.time.LocalDate;
import org.miframework.annotation.Column;
import org.miframework.annotation.Fk;
import org.miframework.annotation.GenerationType;
import org.miframework.annotation.Pk;
import org.miframework.annotation.Table;

/**
 *
 * @author miaro
 */@Table(name="entree")
public class Entree {
    @Column(name = "id_entree")
    @Pk(generation = GenerationType.AUTO)
    Integer idEntree;
    @Fk(join="id_meuble_param")
    MeubleParam idMeubleParam;
    @Column(name="qte")
    double quantite;
    @Column(name="date_entree")
    LocalDate dateEntree;
    
    public Entree(){}
    public Entree(Integer id, MeubleParam m, double qte, LocalDate dt){
        this.idEntree = id;
        this.idMeubleParam  = m;
        this.quantite = qte;
        this.dateEntree = dt;
    }

    public Integer getIdEntree() {
        return idEntree;
    }

    public void setIdEntree(Integer idEntree) {
        this.idEntree = idEntree;
    }

    public MeubleParam getIdMeubleParam() {
        return idMeubleParam;
    }

    public void setIdMeubleParam(MeubleParam idMeubleParam) {
        this.idMeubleParam = idMeubleParam;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public LocalDate getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(LocalDate dateEntree) {
        this.dateEntree = dateEntree;
    }
    
 }
