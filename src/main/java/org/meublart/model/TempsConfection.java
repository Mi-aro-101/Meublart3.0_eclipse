/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.meublart.model;

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
@Table(name="temps_confection")
public class TempsConfection {
    @Column (name="id_temps_confection")
    @Pk(generation = GenerationType.AUTO)
    Integer idTempsConfection;
    @Column (name="temps_confection")
    LocalTime tempsConfection; 
    @Fk (join = "id_style")
    StyleMeuble idStyle;
    @Fk (join = "id_categorie")
    CategorieMeuble idCategorie;

    public TempsConfection() {
    }

    public TempsConfection(Integer idTempsConfection, LocalTime tempsConfection, StyleMeuble idStyle, CategorieMeuble idCategorie) {
        this.idTempsConfection = idTempsConfection;
        this.tempsConfection = tempsConfection;
        this.idStyle = idStyle;
        this.idCategorie = idCategorie;
    }

    public Integer getIdTempsConfection() {
        return idTempsConfection;
    }

    public void setIdTempsConfection(Integer idTempsConfection) {
        this.idTempsConfection = idTempsConfection;
    }

    public LocalTime getTempsConfection() {
        return tempsConfection;
    }

    public void setTempsConfection(LocalTime tempsConfection) {
        this.tempsConfection = tempsConfection;
    }

    public StyleMeuble getIdStyle() {
        return idStyle;
    }

    public void setIdStyle(StyleMeuble idStyle) {
        this.idStyle = idStyle;
    }

    public CategorieMeuble getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(CategorieMeuble idCategorie) {
        this.idCategorie = idCategorie;
    }
    
    
}
