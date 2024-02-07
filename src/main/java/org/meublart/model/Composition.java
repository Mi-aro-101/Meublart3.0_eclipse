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
 * @author pc
 */
@Table (name="composition")
public class Composition {
    @Column (name="id_composition")
    Integer idComposition;
    @Column (name="id_style_matiere_premiere")
    @Pk(generation = GenerationType.AUTO)
    StyleMatierePremiere idStyleMatierePremiere;
    @Column (name="id_categorie")
    @Pk(generation = GenerationType.AUTO)
    CategorieMeuble idCategorie;
    @Column (name="id_taille")
    @Pk(generation = GenerationType.AUTO)
    Taille idTaille;
    @Column (name="quantite")
    double quantite;

    public Composition() {
    }

    public Composition(Integer idComposition, StyleMatierePremiere idStyleMatierePremiere, CategorieMeuble idCategorie, Taille idTaille, double quantite) {
        this.idComposition = idComposition;
        this.idStyleMatierePremiere = idStyleMatierePremiere;
        this.idCategorie = idCategorie;
        this.idTaille = idTaille;
        this.quantite = quantite;
    }

    public Integer getIdComposition() {
        return idComposition;
    }

    public void setIdComposition(Integer idComposition) {
        this.idComposition = idComposition;
    }

    public StyleMatierePremiere getIdStyleMatierePremiere() {
        return idStyleMatierePremiere;
    }

    public void setIdStyleMatierePremiere(StyleMatierePremiere idStyleMatierePremiere) {
        this.idStyleMatierePremiere = idStyleMatierePremiere;
    }

    public CategorieMeuble getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(CategorieMeuble idCategorie) {
        this.idCategorie = idCategorie;
    }

    public Taille getIdTaille() {
        return idTaille;
    }

    public void setIdTaille(Taille idTaille) {
        this.idTaille = idTaille;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }
    
}