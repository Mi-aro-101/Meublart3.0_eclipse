/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.meublart.model;

import org.miframework.annotation.Column;
import org.miframework.annotation.Fk;
import org.miframework.annotation.GenerationType;
import org.miframework.annotation.Pk;
import org.miframework.annotation.Table;

/**
 *
 * @author pc
 */
@Table (name="style_matiere_premiere")
public class StyleMatierePremiere {
    @Column (name="id_style_matiere_premiere")
    @Pk(generation = GenerationType.AUTO)
    Integer idStyleMatierePremiere;
    @Fk (join = "id_matiere_premiere")
    MatierePremiere idMatierePremiere;
    @Fk (join = "id_style_meuble")
    StyleMeuble idStyleMeuble;

    public StyleMatierePremiere() {
    }

    public StyleMatierePremiere(Integer idStyleMatierePremiere, MatierePremiere idMatierePremiere, StyleMeuble idStyleMeuble) {
        this.idStyleMatierePremiere = idStyleMatierePremiere;
        this.idMatierePremiere = idMatierePremiere;
        this.idStyleMeuble = idStyleMeuble;
    }

    public Integer getIdStyleMatierePremiere() {
        return idStyleMatierePremiere;
    }

    public void setIdStyleMatierePremiere(Integer idStyleMatierePremiere) {
        this.idStyleMatierePremiere = idStyleMatierePremiere;
    }

    public MatierePremiere getIdMatierePremiere() {
        return idMatierePremiere;
    }

    public void setIdMatierePremiere(MatierePremiere idMatierePremiere) {
        this.idMatierePremiere = idMatierePremiere;
    }

    public StyleMeuble getIdStyleMeuble() {
        return idStyleMeuble;
    }

    public void setIdStyleMeuble(StyleMeuble idStyleMeuble) {
        this.idStyleMeuble = idStyleMeuble;
    }

}
