/**
 * 
 */
package org.meublart.view;

import org.meublart.model.CategorieMeuble;
import org.meublart.model.MatierePremiere;
import org.meublart.model.StyleMeuble;
import org.meublart.model.Taille;
import org.miframework.annotation.Column;
import org.miframework.annotation.Fk;
import org.miframework.annotation.GenerationType;
import org.miframework.annotation.Pk;
import org.miframework.annotation.Table;

/**
 * @author miaro
 *
 */
@Table(name="v_meuble_matiere_premiere")
public class VCompositionMeubleMatiere {

	@Pk(generation = GenerationType.AUTO)
	@Column(name="id_composition")
	Integer idComposition;
	
	@Fk(join = "id_style_meuble")
	StyleMeuble styleMeuble;
	
	@Fk(join="id_matiere_premiere")
	MatierePremiere matierePremiere;
	
	@Fk(join = "id_categorie")
	CategorieMeuble categorieMeuble;
	
	@Column(name="quantite")
	double quantite;
	
	@Fk(join="id_taille")
	Taille taille;
	
	@Column(name="prix_unitaire")
	double prixUnitaire;
	
	public VCompositionMeubleMatiere() {
		// TODO Auto-generated constructor stub
	}
	
	public CategorieMeuble getCategorieMeuble() {
		return categorieMeuble;
	}
	
	public Integer getIdComposition() {
		return idComposition;
	}
	
	public MatierePremiere getMatierePremiere() {
		return matierePremiere;
	}
	
	public double getPrixUnitaire() {
		return prixUnitaire;
	}
	
	public double getQuantite() {
		return quantite;
	}
	
	public StyleMeuble getStyleMeuble() {
		return styleMeuble;
	}
	
	public Taille getTaille() {
		return taille;
	}
	
	public void setCategorieMeuble(CategorieMeuble categorieMeuble) {
		this.categorieMeuble = categorieMeuble;
	}
	
	public void setIdComposition(Integer idComposition) {
		this.idComposition = idComposition;
	}
	
	public void setMatierePremiere(MatierePremiere matierePremiere) {
		this.matierePremiere = matierePremiere;
	}
	
	public void setPrixUnitaire(double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	
	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}
	
	public void setStyleMeuble(StyleMeuble styleMeuble) {
		this.styleMeuble = styleMeuble;
	}
	
	public void setTaille(Taille taille) {
		this.taille = taille;
	}
	
}
