package br.com.ocorrenciasbr.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ocorrenciasbr.dao.OcorrenciasDAO;
import br.com.ocorrenciasbr.vo.OcorrenciaTotalVO;


public class EstadoController extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String estado = (String) request.getParameter("estado");
		
		
		OcorrenciasDAO ocorrenciaDAO = new OcorrenciasDAO();
		
		//Ocorrencias pessoas sem capacete
		List<OcorrenciaTotalVO> listOcorrenciaSemCapacete  =   ocorrenciaDAO.getTotalOcorrenciaPessoasSemCapacete(estado);
		request.setAttribute("listOcorrenciaSemCapacete", preencheMeses(listOcorrenciaSemCapacete));
		
		//Ocorrencias pessoas sem cinto
		List<OcorrenciaTotalVO> listOcorrenciaSemCinto  =   ocorrenciaDAO.getTotalOcorrenciaPessoasSemCinto(estado);
		request.setAttribute("listOcorrenciaSemCinto", preencheMeses(listOcorrenciaSemCinto));
		
		
		//Ocorrencias pessoas alcoolizadas
		List<OcorrenciaTotalVO> listOcorrenciaAlcool  =   ocorrenciaDAO.getTotalOcorrenciaPessoasAlcoolizadas(estado);
		request.setAttribute("listOcorrenciaAlcool", preencheMeses(listOcorrenciaAlcool));
		
		
		//Ocorrencias por tipo de veiculo/carro
		List<OcorrenciaTotalVO> listOcorrenciaCarro  =   ocorrenciaDAO.getTotalOcorrenciaTipoVeiculoCarro(estado);
		request.setAttribute("listOcorrenciaCarro", preencheMeses(listOcorrenciaCarro));
		
		
		//Ocorrencias por tipo de veiculo/moto
		List<OcorrenciaTotalVO> listOcorrenciaMoto  =   ocorrenciaDAO.getTotalOcorrenciaTipoVeiculoMoto(estado);
		request.setAttribute("listOcorrenciaMoto", preencheMeses(listOcorrenciaMoto));
		
		
		//Ocorrencias por pessoa do sexo masculino
		List<OcorrenciaTotalVO> listOcorrenciaSexoMasculino  =   ocorrenciaDAO.getTotalOcorrenciaPessoasSexoMasculino(estado);
		request.setAttribute("listOcorrenciaSexoMasculino", preencheMeses(listOcorrenciaSexoMasculino));
				
				
		//Ocorrencias por pessoa do sexo feminino
		List<OcorrenciaTotalVO> listOcorrenciaSexoFeminio  =   ocorrenciaDAO.getTotalOcorrenciaPessoasSexoFeminino(estado);
		request.setAttribute("listOcorrenciaSexoFeminio", preencheMeses(listOcorrenciaSexoFeminio));
		
		
		//Ocorrencias por pessoa do sexo feminino
		List<OcorrenciaTotalVO> listOcorrenciaCarroPessoaSemHabilitacao  =   ocorrenciaDAO.getTotalOcorrenciaPessoasSemHabilitacao(estado);
		request.setAttribute("listOcorrenciaCarroPessoaSemHabilitacao", preencheMeses(listOcorrenciaCarroPessoaSemHabilitacao));
		
		
		//Ocorrencias com acidentes
		List<OcorrenciaTotalVO> listOcorrenciaAcidente =   ocorrenciaDAO.getTotalOcorrenciaComAcidente(estado);
		request.setAttribute("listOcorrenciaAcidente", preencheMeses(listOcorrenciaAcidente));
		
		
		//Ocorrencias com acidentes/atropelamento
		List<OcorrenciaTotalVO> listOcorrenciaAcidenteAtropelamento =   ocorrenciaDAO.getTotalOcorrenciaComAcidenteAtropelamento(estado);
		request.setAttribute("listOcorrenciaAcidenteAtropelamento", preencheMeses(listOcorrenciaAcidenteAtropelamento));
		
		
		request.setAttribute("page", "pages/estados/estado.jsp");
		request.setAttribute("logo", false);
		
		RequestDispatcher view = request.getRequestDispatcher("index.jsp");
		view.forward(request, response);
		
	}	
	
	
	
	/**
	 * Método responsável por retornar os meses do ano
	 * @return
	 * @author Carlos Bezerra
	 */
	private Map<Integer, String> getMeses(){
		
		Map<Integer, String> meses = new HashMap<Integer, String>();
		meses.put(1,"JAN");
		meses.put(2,"FEV");
		meses.put(3,"MAR");
		meses.put(4,"ABR");
		meses.put(5,"MAI");
		meses.put(6,"JUN");
		meses.put(7,"JUL");
		meses.put(8,"AGO");
		meses.put(9,"SET");
		meses.put(10,"OUT");
		meses.put(11,"NOV");
		meses.put(12,"DEZ");
		
		return meses;
	}
	
	

	/**
	 * Método responsável por ordenar os meses e preencher os vazios(0)
	 * @param list
	 * @return List<OcorrenciaTotalVO>
	 * @author Carlos Bezerra
	 */
	private List<OcorrenciaTotalVO> preencheMeses(List<OcorrenciaTotalVO> list){
		
		List<OcorrenciaTotalVO> l = new ArrayList<OcorrenciaTotalVO>();
		
		label : for(int i = 1; i <= 12; i++){
					
					for(OcorrenciaTotalVO o : list){
						if(o.getMes().equals(i)){
							o.setDescricaoMes(getMeses().get(i));
							continue label;
						}
					}
			
					OcorrenciaTotalVO oc = new OcorrenciaTotalVO();
					oc.setMes(i);
					oc.setDescricaoMes(getMeses().get(i));
					oc.setTotalOcorrencia(0);
					l.add(oc);	
		}
			
		list.addAll(l);
	
		Collections.sort(list, new Comparator(){
			public int compare(Object o1, Object o2) {  
				OcorrenciaTotalVO oco1 = (OcorrenciaTotalVO) o1;  
				OcorrenciaTotalVO oco2 = (OcorrenciaTotalVO) o2;  		
				return oco1.getMes().compareTo(oco2.getMes());
		    } 
		});

		return list;
	}

}
