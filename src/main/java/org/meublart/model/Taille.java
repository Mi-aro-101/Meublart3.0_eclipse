/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.meublart.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.miframework.annotation.Column;
import org.miframework.annotation.GenerationType;
import org.miframework.annotation.Pk;
import org.miframework.annotation.Table;
import org.miframework.generic.GenericDac;
import org.miframework.helper.DaoHelper;
import org.miframework.helper.MeubleHelper;

/**
 *
 * @author pc
 */
@Table (name="taille")
public class Taille {
    @Column (name="id_taille")
    @Pk(generation = GenerationType.AUTO)
    Integer idTaille;
    @Column (name="designation")
    String designation;
    
    public Taille[] getAllIds(Connection c, int[] idTailles)throws Exception{
    	List<Taille> tailles = new ArrayList<>();
    	boolean isOpen = c == null;
    	if(isOpen) c = GenericDac.generate();
    	
    	Statement stmt = null;
    	ResultSet rs = null;
    	
    	String idTaillesAsString = MeubleHelper.arrayToStringQuery(idTailles);
    	String query = "SELECT * FROM taille WHERE id_taille in ("+ idTaillesAsString +")";
    	
    	try {
			
    		stmt = c.createStatement();
    		rs = stmt.executeQuery(query);
    		while(rs.next()) {
    			Taille taille = new Taille();
    			DaoHelper.select(taille, rs, c);
    			tailles.add(taille);
    		}
    		
		} catch (Exception e) {
			throw e;
		}finally {
			rs.close();
			stmt.close();
			if(isOpen) c.close();
		}
    	
    	return tailles.toArray(new Taille[tailles.size()]);
    }

    public Taille() {
    }

    public Taille(Integer idTaille, String designation) {
        this.idTaille = idTaille;
        this.designation = designation;
    }

    public Integer getIdTaille() {
        return idTaille;
    }

    public void setIdTaille(Integer idTaille) {
        this.idTaille = idTaille;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    
}
