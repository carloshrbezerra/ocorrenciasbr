package br.com.ocorrenciasbr.vo;

public class OcorrenciaTotalVO {
	
	private String estado = "";
	private Integer totalOcorrencia = 0;
	private Integer mes = 0;
	private Integer totalGeral = 0;
	private String descricaoMes = "";
	
	
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Integer getTotalOcorrencia() {
		return totalOcorrencia;
	}
	public void setTotalOcorrencia(Integer totalOcorrencia) {
		this.totalOcorrencia = totalOcorrencia;
	}
	public Integer getMes() {
		return mes;
	}
	public void setMes(Integer mes) {
		this.mes = mes;
	}
	public Integer getTotalGeral() {
		return totalGeral;
	}
	public void setTotalGeral(Integer totalGeral) {
		this.totalGeral = totalGeral;
	}
	public String getDescricaoMes() {
		return descricaoMes;
	}
	public void setDescricaoMes(String descricaoMes) {
		this.descricaoMes = descricaoMes;
	}
	
}
