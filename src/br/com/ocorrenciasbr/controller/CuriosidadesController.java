package br.com.ocorrenciasbr.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ocorrenciasbr.dao.OcorrenciasDAO;
import br.com.ocorrenciasbr.vo.OcorrenciaTotalEstadoVO;


public class CuriosidadesController extends HttpServlet{
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		
		String ano = request.getParameter("ano");
		
		if(ano == "" || ano == null){
			ano = "2013";
		}
		
			
		request.setAttribute("page", "pages/curiosidades/curiosidades.jsp");
		request.setAttribute("title", "Curiosidades - " + ano);
		request.setAttribute("ano", ano);
		
		RequestDispatcher view = request.getRequestDispatcher("index.jsp");
		view.forward(request, response);
		 	
	}
}
