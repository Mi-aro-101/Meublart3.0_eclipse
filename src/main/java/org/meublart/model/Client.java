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
 * @author miaro
 */
@Table(name="client")
public class Client {
    @Column(name = "id_client")
    @Pk(generation = GenerationType.AUTO)
    Integer idClient;
    @Column(name = "nom_client")
    String nom;
    @Fk(join="id_genre")
    Genre idGenre;
    public Client(){}
    public Client(Integer id, String nom, Genre idGenre){
        this.idClient = id;
        this.nom = nom;
        this.idGenre = idGenre;
    }
    public Integer getIdClient(){
        return idClient;
    } 
    public void setIdClient(Integer id){
        this.idClient = id;
    }
    public String getNom(){
        return nom;
    } 
    public void setNom(String name){
        this.nom = name;
    }
    public Genre getIdGenre(){
        return idGenre;
    }
    public void setIdGenre(Genre idGenre){
        this.idGenre = idGenre;
    }
}
