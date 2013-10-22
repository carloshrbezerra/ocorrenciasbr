package br.com.ocorrenciasbr.controller;

import java.io.IOException; 

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PageController
 */

public class PageController extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String caminho = "";
		
		if(request.getParameter("tipo") == "graficos"){
			request.setAttribute("page", "template/body.jsp#graficos");
		}else{
			request.setAttribute("page", "template/body.jsp");
			caminho = "ocorrencias.do";
		}
		
		
	
		RequestDispatcher view = request.getRequestDispatcher(caminho);
		view.forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
