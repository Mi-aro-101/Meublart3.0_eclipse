/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.meublart.model;

import org.miframework.annotation.Column;
import org.miframework.annotation.GenerationType;
import org.miframework.annotation.Pk;
import org.miframework.annotation.Table;

/**
 *
 * @author miaro
 */
@Table(name="promotion")
public class Promotion {
    @Column(name = "id_promotion")
    @Pk(generation = GenerationType.AUTO)
    Integer idPromotion;
    @Column(name = "debut")
    Integer debut;
    @Column(name = "fin")
    Integer fin;
    @Column(name = "valeur")
    Integer valeur;
    @Column(name = "designation")
    String designation;
    
    public Promotion(){}
    public Promotion(Integer id, Integer debut,Integer fin,Integer valeur, String designation){
        this.idPromotion = id;
        this.debut = debut;
        this.fin = fin;
        this.valeur = valeur;
        this.designation = designation;
    }
    public Integer getIdPromotion(){
        return idPromotion;
    } 
    public void setIdPromotion(Integer id){
        this.idPromotion = id;
    }
    public Integer getDebut(){
        return debut;
    } 
    public void setDebut(Integer d){
        this.debut = d;
    }
    public Integer getFin(){
        return fin;
    }
    public void setFin(Integer f){
        this.fin = f;
    }
    public Integer getValeur(){
        return valeur;
    } 
    public void setValeur(Integer v){
        this.valeur = v;
    }
    public String getDesignation(){
        return designation;
    } 
    public void setDesignation(String des){
        this.designation = des;
    }
}
