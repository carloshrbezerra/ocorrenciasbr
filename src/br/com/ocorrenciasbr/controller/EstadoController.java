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
		
		
		String estado = request.getParameter("estado");
		String ano = request.getParameter("ano");
		
		if(ano == "" || ano == null){
			ano = "2007";
		}
		
		
		OcorrenciasDAO ocorrenciaDAO = new OcorrenciasDAO();
		
		//Ocorrencias pessoas sem capacete
		List<OcorrenciaTotalVO> listOcorrenciaSemCapacete  =   ocorrenciaDAO.getTotalOcorrenciaPessoasSemCapacete(estado, ano);
		request.setAttribute("totalOcorrenciaSemCapacete", this.calculaTotalOcorrencais(listOcorrenciaSemCapacete));
		request.setAttribute("listOcorrenciaSemCapacete", preencheMeses(listOcorrenciaSemCapacete));
		
		//Ocorrencias pessoas sem cinto
		List<OcorrenciaTotalVO> listOcorrenciaSemCinto  =   ocorrenciaDAO.getTotalOcorrenciaPessoasSemCinto(estado, ano);
		request.setAttribute("totalOcorrenciaSemCinto", this.calculaTotalOcorrencais(listOcorrenciaSemCinto));
		request.setAttribute("listOcorrenciaSemCinto", preencheMeses(listOcorrenciaSemCinto));
		
		
		//Ocorrencias pessoas alcoolizadas
		List<OcorrenciaTotalVO> listOcorrenciaAlcool  =   ocorrenciaDAO.getTotalOcorrenciaPessoasAlcoolizadas(estado, ano);
		request.setAttribute("totalOcorrenciaAlcool", this.calculaTotalOcorrencais(listOcorrenciaAlcool));
		request.setAttribute("listOcorrenciaAlcool", preencheMeses(listOcorrenciaAlcool));
		
		
		//Ocorrencias por tipo de veiculo/carro
		List<OcorrenciaTotalVO> listOcorrenciaCarro  =   ocorrenciaDAO.getTotalOcorrenciaTipoVeiculoCarro(estado, ano);
		request.setAttribute("totalOcorrenciaCarro", this.calculaTotalOcorrencais(listOcorrenciaCarro));
		request.setAttribute("listOcorrenciaCarro", preencheMeses(listOcorrenciaCarro));
		
		
		//Ocorrencias por tipo de veiculo/moto
		List<OcorrenciaTotalVO> listOcorrenciaMoto  =   ocorrenciaDAO.getTotalOcorrenciaTipoVeiculoMoto(estado, ano);
		request.setAttribute("totalOcorrenciaMoto", this.calculaTotalOcorrencais(listOcorrenciaMoto));
		request.setAttribute("listOcorrenciaMoto", preencheMeses(listOcorrenciaMoto));
		
		
		//Ocorrencias por pessoa do sexo masculino
		List<OcorrenciaTotalVO> listOcorrenciaSexoMasculino  =   ocorrenciaDAO.getTotalOcorrenciaPessoasSexoMasculino(estado, ano);
		request.setAttribute("totalOcorrenciaSexoMasculino", this.calculaTotalOcorrencais(listOcorrenciaSexoMasculino));
		request.setAttribute("listOcorrenciaSexoMasculino", preencheMeses(listOcorrenciaSexoMasculino));
				
				
		//Ocorrencias por pessoa do sexo feminino
		List<OcorrenciaTotalVO> listOcorrenciaSexoFeminio  =   ocorrenciaDAO.getTotalOcorrenciaPessoasSexoFeminino(estado, ano);
		request.setAttribute("totalOcorrenciaSexoFeminio", this.calculaTotalOcorrencais(listOcorrenciaSexoFeminio));
		request.setAttribute("listOcorrenciaSexoFeminio", preencheMeses(listOcorrenciaSexoFeminio));
		
		
		//Ocorrencias por pessoa do sexo feminino
		List<OcorrenciaTotalVO> listOcorrenciaCarroPessoaSemHabilitacao  =   ocorrenciaDAO.getTotalOcorrenciaPessoasSemHabilitacao(estado, ano);
		request.setAttribute("totalOcorrenciaCarroPessoaSemHabilitacao", this.calculaTotalOcorrencais(listOcorrenciaCarroPessoaSemHabilitacao));
		request.setAttribute("listOcorrenciaCarroPessoaSemHabilitacao", preencheMeses(listOcorrenciaCarroPessoaSemHabilitacao));
		
		
		//Ocorrencias com acidentes
		List<OcorrenciaTotalVO> listOcorrenciaAcidente =   ocorrenciaDAO.getTotalOcorrenciaComAcidente(estado, ano);
		request.setAttribute("totalOcorrenciaAcidente", this.calculaTotalOcorrencais(listOcorrenciaAcidente));
		request.setAttribute("listOcorrenciaAcidente", preencheMeses(listOcorrenciaAcidente));
		
		
		//Ocorrencias com acidentes/atropelamento
		List<OcorrenciaTotalVO> listOcorrenciaAcidenteAtropelamento =   ocorrenciaDAO.getTotalOcorrenciaComAcidenteAtropelamento(estado, ano);
		request.setAttribute("totalOcorrenciaAcidenteAtropelamento", this.calculaTotalOcorrencais(listOcorrenciaAcidenteAtropelamento));
		request.setAttribute("listOcorrenciaAcidenteAtropelamento", preencheMeses(listOcorrenciaAcidenteAtropelamento));
		
		
		request.setAttribute("page", "pages/estados/estado.jsp");
		request.setAttribute("logo", false);
		request.setAttribute("title", "Estatísticas de trânsito - " + getEstadosDescricao().get(estado) +"-"+ ano);
		
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
	 * Método responsável retonra a descricao dos estados
	 * @return
	 * @author Carlos Bezerra
	 */
	private Map<String, String> getEstadosDescricao(){
		
		Map<String, String> estados = new HashMap<String, String>();
		estados.put("AC","Acre");
		estados.put("AL","Alagoas");
		estados.put("AP","Amapá");
		estados.put("AM","Amazonas");
		estados.put("BA","Bahia");
		estados.put("CE","Ceará");
		estados.put("DF","Distrito Federal");
		estados.put("ES","Espírito Santo");
		estados.put("GO","Goiás");
		estados.put("MA","Maranhão");
		estados.put("MT","Mato Grosso");
		estados.put("MS","Mato Grosso do Sul");
		estados.put("MG","Minas Gerais");
		estados.put("PA","Pará");
		estados.put("PB","Paraíba");
		estados.put("PR","Paraná");
		estados.put("PE","Pernambuco");
		estados.put("PI","Piauí");
		estados.put("RJ","Rio de Janeiro");
		estados.put("RN","Rio Grande do Norte");
		estados.put("RS","Rio Grande do Sul");
		estados.put("RO","Rondônia");
		estados.put("RR","Roraima");
		estados.put("SC","Santa Catarina");
		estados.put("SP","São Paulo");
		estados.put("SE","Sergipe");
		estados.put("TO","Tocantins");
	
		
		return estados;
	}
	
	

	/**
	 * Método responsável por ordenar os meses e preencher os vazios(0)
	 * @param list
	 * @return List<OcorrenciaTotalVO>
	 * @author Carlos Bezerra
	 */
	
	private int calculaTotalOcorrencais(List<OcorrenciaTotalVO> lista){
		int total = 0;
		for (OcorrenciaTotalVO ocorrencia : lista){
			total += ocorrencia.getTotalOcorrencia();
		}
		
		return total;
	}
	
	
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
