package br.com.ocorrenciasbr.util;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import br.com.ocorrenciasbr.dao.OcorrenciasDAO;
import br.com.ocorrenciasbr.vo.OcorrenciaTotalEstadoVO;

public class Test {
	
	    public static void main(String[] args) throws SQLException {
	    		
	    	OcorrenciasDAO oco = new OcorrenciasDAO();
	    	List<OcorrenciaTotalEstadoVO> list  = oco.getTotalOcorrenciaEstado();
	    	
	    }
}

