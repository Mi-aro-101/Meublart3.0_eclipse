package org.meublart.view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.meublart.model.CategorieMeuble;
import org.meublart.model.StyleMeuble;
import org.meublart.model.Taille;
import org.miframework.annotation.Column;
import org.miframework.annotation.Fk;
import org.miframework.annotation.Pk;
import org.miframework.annotation.Table;
import org.miframework.generic.GenericDac;
import org.miframework.helper.DaoHelper;

/**
 * 
 * @author miaro
 *
 */
@Table(name="v_meuble_prix_confection")
public class VMeublePrixConfection {
	
	/**
	 * Get meuble ayant prix de confection entre min et max
	 * @param c
	 * @param min
	 * @param max
	 * @return
	 * @throws Exception
	 */
	public VMeublePrixConfection[] getPrixConfectinBetween(Connection c, double min, double max)throws Exception{
		List<VMeublePrixConfection> results = new ArrayList<>();
		boolean isOpen = c==null;
		if(isOpen) c = GenericDac.generate();
		
		Statement stmt = null;
		ResultSet rs = null;
		
		String query = "SELECT * FROM v_meuble_prix_confection WHERE sum between "+min+" and "+max;
		
		try {
			
			stmt = c.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				VMeublePrixConfection t = new VMeublePrixConfection();
				DaoHelper.select(t, rs, c);
				results.add(t);
			}
			
		} catch (Exception e) {
			if(isOpen) c.close();
			rs.close();
			stmt.close();
		}
		
		return results.toArray(new VMeublePrixConfection[results.size()]);
	}
	
	@Fk(join="id_categorie")
	CategorieMeuble categorieMeuble;
	
	@Fk(join="id_taille")
	Taille taille;
	
	@Fk(join="id_style_meuble")
	StyleMeuble styleMeuble;
	
	@Column(name="sum")
	double prixConfection;
	
	public VMeublePrixConfection() {
		// TODO Auto-generated constructor stub
	}
	
	public CategorieMeuble getCategorieMeuble() {
		return categorieMeuble;
	}
	
	public double getPrixConfection() {
		return prixConfection;
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
	
	public void setPrixConfection(double prixConfection) {
		this.prixConfection = prixConfection;
	}
	
	public void setStyleMeuble(StyleMeuble styleMeuble) {
		this.styleMeuble = styleMeuble;
	}
	
	public void setTaille(Taille taille) {
		this.taille = taille;
	}

}
