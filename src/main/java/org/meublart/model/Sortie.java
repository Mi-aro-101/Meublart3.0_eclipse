
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
 */@Table(name="sortie")
public class Sortie {
    @Column(name = "id_sortie")
    @Pk(generation = GenerationType.AUTO)
    Integer idSortie;
    @Fk(join="id_meuble_param")
    MeubleParam idMeubleParam;
    @Column(name="qte")
    double quantite;
    @Column(name="date_sortie")
    LocalDate dateSortie;

    public Sortie(){}
    public Sortie(Integer id, MeubleParam m, double qte, LocalDate dt){
        this.idSortie = id;
        this.idMeubleParam  = m;
        this.quantite = qte;
        this.dateSortie = dt;
    }
    public MeubleParam getIdMeubleParam() {
        return idMeubleParam;
    }

    public void setIdMeubleParam(MeubleParam idMeubleParam) {
        this.idMeubleParam = idMeubleParam;
    }

    public Integer getIdSortie() {
        return idSortie;
    }

    public void setIdSortie(Integer idSortie) {
        this.idSortie = idSortie;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public LocalDate getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(LocalDate dateSortie) {
        this.dateSortie = dateSortie;
    }
    
    
 }
