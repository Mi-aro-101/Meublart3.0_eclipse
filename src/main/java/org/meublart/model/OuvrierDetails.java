/**
 * 
 */
package org.meublart.model;

import java.time.LocalDate;

import org.miframework.annotation.Column;
import org.miframework.annotation.Fk;
import org.miframework.annotation.Table;

/**
 * @author miaro
 *
 */
@Table(name="v_ouvrier_poste_grade")
public class OuvrierDetails {
	
	@Fk(join="id_ouvrier")
	Ouvrier ouvrier;
	
	@Column(name="anciennete")
	int anciennete;
	
	@Column(name="salaire")
	double salaire;
	
	@Column(name="designation")
	String grade;
	
	@Column(name="date_embauche")
	LocalDate dateEmbauche;
	
	public OuvrierDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public int getAnciennete() {
		return anciennete;
	}
	
	public LocalDate getDateEmbauche() {
		return dateEmbauche;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public Ouvrier getOuvrier() {
		return ouvrier;
	}
	
	public double getSalaire() {
		return salaire;
	}
	
	public void setAnciennete(int anciennete) {
		this.anciennete = anciennete;
	}
	
	public void setDateEmbauche(LocalDate dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void setOuvrier(Ouvrier ouvrier) {
		this.ouvrier = ouvrier;
	}
	
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

}
