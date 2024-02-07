/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.meublart.model;

import org.miframework.annotation.Column;
import org.miframework.annotation.Fk;
import org.miframework.annotation.Table;

/**
 *
 * @author miaro
 */
@Table(name="v_vente_genre_pourcentage")
public class StatistiqueGenre {
    @Column(name="nombre")
    Integer nombre;
    @Fk(join="id_genre")
    Genre idGenre;
    @Fk(join="id_meuble")
    Meuble idMeuble;
    public StatistiqueGenre(){}
    public StatistiqueGenre(Integer nombre, Genre idGenre, Meuble idMeuble){
        this.nombre = nombre;
        this.idGenre = idGenre;
        this.idMeuble = idMeuble;
    }

    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }

    public Genre getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(Genre idGenre) {
        this.idGenre = idGenre;
    }

    public Meuble getIdMeuble() {
        return idMeuble;
    }

    public void setIdMeuble(Meuble idMeuble) {
        this.idMeuble = idMeuble;
    }
    
}
