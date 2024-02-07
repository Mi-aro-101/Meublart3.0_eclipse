/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.meublart.model;

import java.time.LocalDate;
import java.time.LocalTime;
import org.miframework.annotation.Column;
import org.miframework.annotation.Fk;
import org.miframework.annotation.GenerationType;
import org.miframework.annotation.Pk;
import org.miframework.annotation.Table;

/**
 *
 * @author miaro
 */
@Table(name="vente")
public class Vente {
    @Column(name = "id_vente")
    @Pk(generation = GenerationType.AUTO)
    Integer idVente;
    @Fk(join="id_client")
    Client idClient;
    @Fk(join="id_meuble_param")
    MeubleParam idMeubleParam;
    @Column(name = "date_vente")
    LocalDate dateVente;
    @Fk(join="id_taille")
    Taille idTaille;
    
    public Vente(){}
    public Vente(Integer idVente, Client c, MeubleParam m, LocalDate dt, Taille t){
        this.idVente = idVente;
        this.idClient = c;
        this.idMeubleParam = m;
        this.dateVente = dt;
        this.idTaille = t;
    }
     public Integer getIdVente() {
        return idVente;
    }

    public void setIdVente(Integer id) {
        this.idVente = id;
    }

    public LocalDate getDateVente() {
        return dateVente;
    }

    public void setDateVente(LocalDate date) {
        this.dateVente = date;
    }

    public MeubleParam getIdMeubleParam() {
        return idMeubleParam;
    }

    public void setIdMeubleParam(MeubleParam idMeubleParam) {
        this.idMeubleParam = idMeubleParam;
    }

    public Client getIdClient() {
        return idClient;
    }

    public void setIdClient(Client idClient) {
        this.idClient = idClient;
    }
    public Taille getIdTaille() {
        return idTaille;
    }

    public void setIdTaille(Taille idTaille) {
        this.idTaille = idTaille;
    }
}
