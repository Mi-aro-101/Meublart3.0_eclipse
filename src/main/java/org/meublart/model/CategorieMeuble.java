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
@Table (name="categorie_meuble")
public class CategorieMeuble {
    @Column (name="id_categorie_meuble")
    @Pk(generation = GenerationType.AUTO)
    Integer idCategorieMeuble;
    @Column (name="designation")
    String designation;

    public CategorieMeuble(Integer idCategorieMeuble, String designation) {
        this.idCategorieMeuble = idCategorieMeuble;
        this.designation = designation;
    }

    public CategorieMeuble() {
    }

    public Integer getIdCategorieMeuble() {
        return idCategorieMeuble;
    }

    public void setIdCategorieMeuble(Integer idCategorieMeuble) {
        this.idCategorieMeuble = idCategorieMeuble;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    

    
}
