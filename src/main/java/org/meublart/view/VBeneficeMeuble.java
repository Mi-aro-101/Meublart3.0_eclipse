package org.meublart.view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.meublart.model.Meuble;
import org.miframework.annotation.Column;
import org.miframework.annotation.Fk;
import org.miframework.annotation.Table;
import org.miframework.generic.GenericDac;
import org.miframework.helper.DaoHelper;

/**
 * 
 * @author miaro
 *
 */
@Table(name="v_meuble_benefice_confection_mp")
public class VBeneficeMeuble {
	
	public VBeneficeMeuble[] getBeneficeBetween(Connection c, double min, double max)throws Exception{
		List<VBeneficeMeuble> result = new ArrayList<>();
		boolean isOpen = c == null;
		if(isOpen) c = GenericDac.generate();
		
		String query = "SELECT * FROM v_meuble_benefice_confection_mp where benefice between "+min+" and "+max;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			
			stmt = c.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				VBeneficeMeuble t = new VBeneficeMeuble();
				DaoHelper.select(t, rs, c);
				result.add(t);
			}
			
		} finally {
			rs.close();
			stmt.close();
			if(isOpen) c.close();
		}
		
		return result.toArray(new VBeneficeMeuble[result.size()]);
	}

	@Column(name="temps_confection")
	double tempsConfection;
	
	@Fk(join="id_meuble")
	Meuble meuble;
	
	@Column(name="temps_confection_main_oeuvre")
	double tempsConfectionmainOeuvre;
	
	@Column(name="revient_matiere_premiere_total")
	double revientMatierePremiereTotal;
	
	@Column(name="prix_vente")
	double prixVente;
	
	@Column(name="benefice")
	double benefice;
	
	public VBeneficeMeuble() {
		// TODO Auto-generated constructor stub
	}
	
	public double getBenefice() {
		return benefice;
	}
	
	public Meuble getMeuble() {
		return meuble;
	}
	
	public double getPrixVente() {
		return prixVente;
	}
	
	public double getRevientMatierePremiereTotal() {
		return revientMatierePremiereTotal;
	}
	
	public double getTempsConfection() {
		return tempsConfection;
	}
	
	public double getTempsConfectionmainOeuvre() {
		return tempsConfectionmainOeuvre;
	}
	
	public void setBenefice(double benefice) {
		this.benefice = benefice;
	}
	
	public void setMeuble(Meuble meuble) {
		this.meuble = meuble;
	}
	
	public void setPrixVente(double prixVente) {
		this.prixVente = prixVente;
	}
	
	public void setRevientMatierePremiereTotal(double revientMatierePremiereTotal) {
		this.revientMatierePremiereTotal = revientMatierePremiereTotal;
	}
	
	public void setTempsConfection(double tempsConfection) {
		this.tempsConfection = tempsConfection;
	}
	
	public void setTempsConfectionmainOeuvre(double tempsConfectionmainOeuvre) {
		this.tempsConfectionmainOeuvre = tempsConfectionmainOeuvre;
	}
}
