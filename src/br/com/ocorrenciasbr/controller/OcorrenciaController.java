package br.com.ocorrenciasbr.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ocorrenciasbr.dao.OcorrenciasDAO;
import br.com.ocorrenciasbr.vo.OcorrenciaTotalEstadoVO;


public class OcorrenciaController extends HttpServlet{
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		OcorrenciasDAO ocorrenciaDAO = new OcorrenciasDAO();
		
		//Numeto total de ocorrencias por estado
		List<OcorrenciaTotalEstadoVO> listOcorrenciaTotalEstado  =   ocorrenciaDAO.getTotalOcorrenciaEstado();
		
		
		
		
		PrintWriter out = response.getWriter();
		
		out.println("ocorrencias br");
		
		
	}
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
	
		PrintWriter out = response.getWriter();
		
		out.println("ocorrencias br");
		
		
	}
	
	
}
