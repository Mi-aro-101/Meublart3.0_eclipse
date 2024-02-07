/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.meublart.model;

import java.time.LocalDate;
import org.miframework.annotation.Column;
import org.miframework.annotation.Fk;
import org.miframework.annotation.GenerationType;
import org.miframework.annotation.Pk;
import org.miframework.annotation.Table;

/**
 *
 * @author miaro
 */
@Table(name="ouvrier")
public class Ouvrier {
    @Column (name="id_ouvrier")
    @Pk(generation = GenerationType.AUTO)
    Integer idOuvrier;
    @Column (name="nom_ouvrier")
    String nomOuvrier;
    @Fk (join = "id_poste")
    Poste idPoste;
    @Column (name = "date_embauche")
    LocalDate dateEmbauche;

    public Ouvrier() {
    }

    public Ouvrier(Integer idOuvrier, String nomOuvrier, Poste idPoste, LocalDate dateEmbauche) {
        this.idOuvrier = idOuvrier;
        this.nomOuvrier = nomOuvrier;
        this.idPoste = idPoste;
        this.dateEmbauche = dateEmbauche;        
    }

    public Integer getIdOuvrier() {
        return idOuvrier;
    }

    public void setIdOuvrier(Integer idOuvrier) {
        this.idOuvrier = idOuvrier;
    }

    public String getNomOuvrier() {
        return nomOuvrier;
    }

    public void setNomOuvrier(String nomOuvrier) {
        this.nomOuvrier = nomOuvrier;
    }

    public Poste getIdPoste() {
        return idPoste;
    }

    public void setIdPoste(Poste idPoste) {
        this.idPoste = idPoste;
    }
    public LocalDate getDateEmbauche(){
        return dateEmbauche;
    }
    public void setDateEmbauche(LocalDate dateEmbauche){
        this.dateEmbauche = dateEmbauche;
    }
}
