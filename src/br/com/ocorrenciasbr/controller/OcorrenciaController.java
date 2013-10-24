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


public class OcorrenciaController extends HttpServlet{
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		
		String ano = request.getParameter("ano");
		
		if(ano == "" || ano == null){
			ano = "2007";
		}
		
		OcorrenciasDAO ocorrenciaDAO = new OcorrenciasDAO();
		
		//Numeto total de ocorrencias por estado
		List<OcorrenciaTotalEstadoVO> listOcorrenciaTotalEstado  =  ocorrenciaDAO.getTotalOcorrenciaEstado(ano);
		
		request.setAttribute("listOcorrenciaTotalEstado", listOcorrenciaTotalEstado);
			
		request.setAttribute("page", "pages/ocorrencias/ocorrencias.jsp");
		request.setAttribute("title", "Total de ocorrências por estados - " + ano);
		request.setAttribute("ano", ano);
		
		RequestDispatcher view = request.getRequestDispatcher("index.jsp");
		view.forward(request, response);
		 	
	}
}
