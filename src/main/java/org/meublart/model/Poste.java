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
@Table (name="poste")
public class Poste {
    @Column (name="id_poste")
    @Pk(generation = GenerationType.AUTO)
    Integer idPoste;
    @Column (name="designation")
    String designation;
    @Column (name="salaire")
    double salaire;

    public Poste() {
    }

    public Poste(Integer idPoste, String designation, double salaire) {
        this.idPoste = idPoste;
        this.designation = designation;
        this.salaire = salaire;
    }

    public Integer getIdPoste() {
        return idPoste;
    }

    public void setIdPoste(Integer idPoste) {
        this.idPoste = idPoste;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    
    

}
