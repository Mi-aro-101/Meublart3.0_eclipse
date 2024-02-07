/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.etu2020.servlet;

import jakarta.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

import org.meublart.model.MatierePremiere;
import org.meublart.model.StyleMatierePremiere;
import org.meublart.model.StyleMeuble;
import org.miframework.generic.GenericDac;
import org.miframework.generic.GenericDao;
import org.miframework.helper.MeubleHelper;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author miaro
 */
public class StyleServlet extends HttpServlet {
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                PrintWriter writer = response.getWriter();
                StyleMeuble style = new StyleMeuble();
                String des = request.getParameter("designation");
                String[] tableau = request.getParameterValues("liste");
                style.setDesignation(des);
                try(Connection c = GenericDac.generate()) {
                    GenericDao.insert(c, style);
                    Map<String, String> conditions = new HashMap<>();
                    conditions.put("designation", des);
                    
                    StyleMeuble styleObject = GenericDao.findOneBy(c, StyleMeuble.class, conditions);
                                
                    int[] tab = MeubleHelper.conversion(tableau);
                    
                    for (int i : tab) {
                    
                        MatierePremiere mat = GenericDao.findById(c, MatierePremiere.class, i);
                        
                        StyleMatierePremiere styleMatiere = new StyleMatierePremiere(null, mat, styleObject);
                        
                        GenericDao.insert(c, styleMatiere);
                    }
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace(writer);
                }
                response.sendRedirect("nouveaustyle.do");
                
                
            }
}
