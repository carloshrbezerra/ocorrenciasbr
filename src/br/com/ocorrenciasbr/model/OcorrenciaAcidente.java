package br.com.ocorrenciasbr.model;

// Generated Sep 16, 2013 3:34:01 PM by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * OcorrenciaacidenteId generated by hbm2java
 */
@Entity
public class OcorrenciaAcidente implements java.io.Serializable {

	private Integer oacocoid;
	private Integer oacttacodigo;
	private Integer oactcacodigo;
	private String oacdano;
	private String oacdanoterc;
	private String oacdanoamb;
	private String oaclatitude;
	private String oaclongitude;
	private String oacdistab;
	private String oacdistac;
	private String oacdistbc;
	private Integer oacmodelopista;
	private String oacsentido1;
	private String oacsentido2;
	private Integer oacqtdfaixa1;
	private Integer oacqtdfaixa2;
	private String oacacostamento1;
	private String oacacostamento2;
	private String oaccanteiro;
	private String oaclinhacentral;
	private String oacorientpista;
	private String oacgirafundo;
	private Integer oacversaocroqui;
	private String oacsitio;
	private List<Ocorrencia> ocorrencias = new ArrayList<Ocorrencia>();
	private TipoAcidente tipoAcidente;
	
	
	
	@ManyToOne
	@JoinColumn(name="oacttacodigo")
	public TipoAcidente getTipoAcidente() {
		return tipoAcidente;
	}

	public void setTipoAcidente(TipoAcidente tipoAcidente) {
		this.tipoAcidente = tipoAcidente;
	}

	@OneToMany(mappedBy="ocorrenciaAcidente",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	public List<Ocorrencia> getOcorrencias() {
		return ocorrencias;
	}

	public void setOcorrencias(List<Ocorrencia> ocorrencias) {
		this.ocorrencias = ocorrencias;
	}

	@Column(name = "oacocoid")
	public Integer getOacocoid() {
		return this.oacocoid;
	}

	public void setOacocoid(Integer oacocoid) {
		this.oacocoid = oacocoid;
	}

	@Column(name = "oacttacodigo")
	public Integer getOacttacodigo() {
		return this.oacttacodigo;
	}

	public void setOacttacodigo(Integer oacttacodigo) {
		this.oacttacodigo = oacttacodigo;
	}

	@Column(name = "oactcacodigo")
	public Integer getOactcacodigo() {
		return this.oactcacodigo;
	}

	public void setOactcacodigo(Integer oactcacodigo) {
		this.oactcacodigo = oactcacodigo;
	}

	@Column(name = "oacdano", length = 1)
	public String getOacdano() {
		return this.oacdano;
	}

	public void setOacdano(String oacdano) {
		this.oacdano = oacdano;
	}

	@Column(name = "oacdanoterc", length = 1)
	public String getOacdanoterc() {
		return this.oacdanoterc;
	}

	public void setOacdanoterc(String oacdanoterc) {
		this.oacdanoterc = oacdanoterc;
	}

	@Column(name = "oacdanoamb", length = 1)
	public String getOacdanoamb() {
		return this.oacdanoamb;
	}

	public void setOacdanoamb(String oacdanoamb) {
		this.oacdanoamb = oacdanoamb;
	}

	@Column(name = "oaclatitude", length = 20)
	public String getOaclatitude() {
		return this.oaclatitude;
	}

	public void setOaclatitude(String oaclatitude) {
		this.oaclatitude = oaclatitude;
	}

	@Column(name = "oaclongitude", length = 20)
	public String getOaclongitude() {
		return this.oaclongitude;
	}

	public void setOaclongitude(String oaclongitude) {
		this.oaclongitude = oaclongitude;
	}

	@Column(name = "oacdistab", length = 6)
	public String getOacdistab() {
		return this.oacdistab;
	}

	public void setOacdistab(String oacdistab) {
		this.oacdistab = oacdistab;
	}

	@Column(name = "oacdistac", length = 6)
	public String getOacdistac() {
		return this.oacdistac;
	}

	public void setOacdistac(String oacdistac) {
		this.oacdistac = oacdistac;
	}

	@Column(name = "oacdistbc", length = 6)
	public String getOacdistbc() {
		return this.oacdistbc;
	}

	public void setOacdistbc(String oacdistbc) {
		this.oacdistbc = oacdistbc;
	}

	@Column(name = "oacmodelopista")
	public Integer getOacmodelopista() {
		return this.oacmodelopista;
	}

	public void setOacmodelopista(Integer oacmodelopista) {
		this.oacmodelopista = oacmodelopista;
	}

	@Column(name = "oacsentido1", length = 16)
	public String getOacsentido1() {
		return this.oacsentido1;
	}

	public void setOacsentido1(String oacsentido1) {
		this.oacsentido1 = oacsentido1;
	}

	@Column(name = "oacsentido2", length = 20)
	public String getOacsentido2() {
		return this.oacsentido2;
	}

	public void setOacsentido2(String oacsentido2) {
		this.oacsentido2 = oacsentido2;
	}

	@Column(name = "oacqtdfaixa1")
	public Integer getOacqtdfaixa1() {
		return this.oacqtdfaixa1;
	}

	public void setOacqtdfaixa1(Integer oacqtdfaixa1) {
		this.oacqtdfaixa1 = oacqtdfaixa1;
	}

	@Column(name = "oacqtdfaixa2")
	public Integer getOacqtdfaixa2() {
		return this.oacqtdfaixa2;
	}

	public void setOacqtdfaixa2(Integer oacqtdfaixa2) {
		this.oacqtdfaixa2 = oacqtdfaixa2;
	}

	@Column(name = "oacacostamento1", length = 1)
	public String getOacacostamento1() {
		return this.oacacostamento1;
	}

	public void setOacacostamento1(String oacacostamento1) {
		this.oacacostamento1 = oacacostamento1;
	}

	@Column(name = "oacacostamento2", length = 1)
	public String getOacacostamento2() {
		return this.oacacostamento2;
	}

	public void setOacacostamento2(String oacacostamento2) {
		this.oacacostamento2 = oacacostamento2;
	}

	@Column(name = "oaccanteiro", length = 6)
	public String getOaccanteiro() {
		return this.oaccanteiro;
	}

	public void setOaccanteiro(String oaccanteiro) {
		this.oaccanteiro = oaccanteiro;
	}

	@Column(name = "oaclinhacentral", length = 6)
	public String getOaclinhacentral() {
		return this.oaclinhacentral;
	}

	public void setOaclinhacentral(String oaclinhacentral) {
		this.oaclinhacentral = oaclinhacentral;
	}

	@Column(name = "oacorientpista", length = 6)
	public String getOacorientpista() {
		return this.oacorientpista;
	}

	public void setOacorientpista(String oacorientpista) {
		this.oacorientpista = oacorientpista;
	}

	@Column(name = "oacgirafundo", length = 6)
	public String getOacgirafundo() {
		return this.oacgirafundo;
	}

	public void setOacgirafundo(String oacgirafundo) {
		this.oacgirafundo = oacgirafundo;
	}

	@Column(name = "oacversaocroqui")
	public Integer getOacversaocroqui() {
		return this.oacversaocroqui;
	}

	public void setOacversaocroqui(Integer oacversaocroqui) {
		this.oacversaocroqui = oacversaocroqui;
	}

	@Column(name = "oacsitio", length = 6)
	public String getOacsitio() {
		return this.oacsitio;
	}

	public void setOacsitio(String oacsitio) {
		this.oacsitio = oacsitio;
	}
}