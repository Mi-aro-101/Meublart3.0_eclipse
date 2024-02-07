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
 */
@Table (name="meuble")
public class Meuble {
    @Column(name = "id_meuble")
    @Pk(generation = GenerationType.AUTO)
    Integer idMeuble;
    @Fk(join="id_style")
    StyleMeuble idStyle;
    @Fk(join="id_categorie")
    CategorieMeuble idCategorie;
    @Column(name = "prix")
    double prix;
    
    public Meuble(){}
    public Meuble(Integer idMeuble, StyleMeuble idStyle, CategorieMeuble idCategorie, double prix){
        this.idMeuble = idMeuble;
        this.idStyle = idStyle;
        this.idCategorie = idCategorie;
        this.prix = prix;
    }
    public Integer getIdMeuble(){
        return idMeuble;
    }
    public void setIdMeuble(Integer idMeuble){
        this.idMeuble = idMeuble;
    }
    public StyleMeuble getIdStyle(){
        return idStyle;
    }
    public void setIdStyle(StyleMeuble idStyle){
        this.idStyle = idStyle;
    }
    public CategorieMeuble getIdCategorie(){
        return idCategorie;
    }
    public void setIdCategorie(CategorieMeuble idCategorie){
        this.idCategorie = idCategorie;
    }

    public double getPrix() {
        return prix;
    }
    
    public void setPrix(double prix) {
        this.prix = prix;
    }
    
}
