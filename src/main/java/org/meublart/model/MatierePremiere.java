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
@Table (name="matiere_premiere")
public class MatierePremiere {
    @Column (name="id_matiere_premiere")
    @Pk(generation = GenerationType.AUTO)
    Integer idMatierePremiere;
    @Column (name="designation")
    String designation;
    @Column (name="prix_unitaire")
    double prixUnitaire;

    
    public MatierePremiere() {
    }

    public MatierePremiere(Integer idMatierePremiere, String designation, double prixUnitaire) {
        this.idMatierePremiere = idMatierePremiere;
        this.designation = designation;
        this.prixUnitaire = prixUnitaire;
    }
    
    public Integer getIdMatierePremiere() {
        return idMatierePremiere;
    }

    public void setIdMatierePremiere(Integer idMatierePremiere) {
        this.idMatierePremiere = idMatierePremiere;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }
    
    
}

