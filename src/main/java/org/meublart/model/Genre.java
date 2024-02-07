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
@Table(name="genre")
public class Genre {
    @Column(name = "id_genre")
    @Pk(generation = GenerationType.AUTO)
    Integer idGenre;
    @Column(name = "nom_genre")
    String nom;
     public Genre(){}
    public Genre(Integer id, String nom){
        this.idGenre = id;
        this.nom = nom;
    }
    public Integer getIdGenre(){
        return idGenre;
    } 
    public void setIdGenre(Integer id){
        this.idGenre = id;
    }
    public String getNom(){
        return nom;
    } 
    public void setNom(String name){
        this.nom = name;
    }
}
