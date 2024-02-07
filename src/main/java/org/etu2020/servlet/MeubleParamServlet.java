package org.etu2020.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import org.meublart.model.Meuble;
import org.meublart.model.MeubleParam;
import org.meublart.model.Taille;
import org.miframework.generic.GenericDac;
import org.miframework.generic.GenericDao;
import org.miframework.helper.MeubleHelper;

/**
 * Servlet implementation class MeubleParamServlet
 */
public class MeubleParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MeubleParamServlet() {
        super();
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	PrintWriter out = response.getWriter();
    	String idMeubleString = request.getParameter("idMeuble");
    	String[] idTaillesStrings = request.getParameterValues("idTaille");
    	
    	// Get the ids value as integer
    	Integer idMeuble = Integer.parseInt(idMeubleString);
    	int[] idtailles = MeubleHelper.conversion(idTaillesStrings);
    	
    	try (Connection c = GenericDac.generate()){
			
    		Meuble meuble = GenericDao.findById(c, Meuble.class, idMeuble);
    		Taille[] tailles = new Taille().getAllIds(c, idtailles);
    		
    		for(Taille taille : tailles) {
    			MeubleParam meubleParam = new MeubleParam();
    			meubleParam.setIdMeubleParam(null);
    			meubleParam.setIdMeuble(meuble);
    			meubleParam.setIdTaille(taille);
    			
    			GenericDao.insert(c, meubleParam);
    		}
    		
		} catch (Exception e) {
			out.println(e);
			e.printStackTrace(out);
		}
    	
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

}
