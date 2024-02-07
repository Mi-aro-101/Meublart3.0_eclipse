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
@Table (name="style_meuble")
public class StyleMeuble {
    @Column (name="id_style_meuble")
    @Pk(generation = GenerationType.AUTO)
    Integer idStyleMeuble;
    @Column (name="designation")
    String designation;

    public StyleMeuble() {
    }

    public StyleMeuble(Integer idStyleMeuble, String designation) {
        this.idStyleMeuble = idStyleMeuble;
        this.designation = designation;
    }
    
    public Integer getIdStyleMeuble() {
        return idStyleMeuble;
    }

    public void setIdStyleMeuble(Integer idStyleMeuble) {
        this.idStyleMeuble = idStyleMeuble;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    
    
    
}
