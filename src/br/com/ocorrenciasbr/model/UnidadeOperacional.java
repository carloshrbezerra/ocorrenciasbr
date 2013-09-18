package br.com.ocorrenciasbr.model;

// Generated Sep 16, 2013 3:34:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * UnidadeoperacionalId generated by hbm2java
 */
@Entity
public class UnidadeOperacional implements java.io.Serializable {

	private Integer uniid;
	private Integer uniunidade;
	private String unilotacao;
	private String unisigla;
	private Integer unittucodigo;
	private Integer uniunidaderesponsavel;
	private String unidenominacao;
	private String uniendereco;
	private String unimunicipio;
	private String unicep;
	private String unitelefone;
	private String uniemail;
	private String unilocal;
	private String unilatitude;
	private String unilongitude;
	private String unihelicoptero;
	private String unitexto;
	private TipoUnidadeOperacional tipoUnidadeOperacional;
	
	
	@ManyToOne
	@JoinColumn(name="uniunidade")
	public TipoUnidadeOperacional getTipoUnidadeOperacional() {
		return tipoUnidadeOperacional;
	}

	public void setTipoUnidadeOperacional(
			TipoUnidadeOperacional tipoUnidadeOperacional) {
		this.tipoUnidadeOperacional = tipoUnidadeOperacional;
	}

	@Column(name = "uniid")
	public Integer getUniid() {
		return this.uniid;
	}

	public void setUniid(Integer uniid) {
		this.uniid = uniid;
	}

	@Column(name = "uniunidade")
	public Integer getUniunidade() {
		return this.uniunidade;
	}

	public void setUniunidade(Integer uniunidade) {
		this.uniunidade = uniunidade;
	}

	@Column(name = "unilotacao", length = 9)
	public String getUnilotacao() {
		return this.unilotacao;
	}

	public void setUnilotacao(String unilotacao) {
		this.unilotacao = unilotacao;
	}

	@Column(name = "unisigla", length = 15)
	public String getUnisigla() {
		return this.unisigla;
	}

	public void setUnisigla(String unisigla) {
		this.unisigla = unisigla;
	}

	@Column(name = "unittucodigo")
	public Integer getUnittucodigo() {
		return this.unittucodigo;
	}

	public void setUnittucodigo(Integer unittucodigo) {
		this.unittucodigo = unittucodigo;
	}

	@Column(name = "uniunidaderesponsavel")
	public Integer getUniunidaderesponsavel() {
		return this.uniunidaderesponsavel;
	}

	public void setUniunidaderesponsavel(Integer uniunidaderesponsavel) {
		this.uniunidaderesponsavel = uniunidaderesponsavel;
	}

	@Column(name = "unidenominacao", length = 66)
	public String getUnidenominacao() {
		return this.unidenominacao;
	}

	public void setUnidenominacao(String unidenominacao) {
		this.unidenominacao = unidenominacao;
	}

	@Column(name = "uniendereco", length = 60)
	public String getUniendereco() {
		return this.uniendereco;
	}

	public void setUniendereco(String uniendereco) {
		this.uniendereco = uniendereco;
	}

	@Column(name = "unimunicipio", length = 6)
	public String getUnimunicipio() {
		return this.unimunicipio;
	}

	public void setUnimunicipio(String unimunicipio) {
		this.unimunicipio = unimunicipio;
	}

	@Column(name = "unicep", length = 8)
	public String getUnicep() {
		return this.unicep;
	}

	public void setUnicep(String unicep) {
		this.unicep = unicep;
	}

	@Column(name = "unitelefone", length = 51)
	public String getUnitelefone() {
		return this.unitelefone;
	}

	public void setUnitelefone(String unitelefone) {
		this.unitelefone = unitelefone;
	}

	@Column(name = "uniemail", length = 56)
	public String getUniemail() {
		return this.uniemail;
	}

	public void setUniemail(String uniemail) {
		this.uniemail = uniemail;
	}

	@Column(name = "unilocal", length = 20)
	public String getUnilocal() {
		return this.unilocal;
	}

	public void setUnilocal(String unilocal) {
		this.unilocal = unilocal;
	}

	@Column(name = "unilatitude", length = 20)
	public String getUnilatitude() {
		return this.unilatitude;
	}

	public void setUnilatitude(String unilatitude) {
		this.unilatitude = unilatitude;
	}

	@Column(name = "unilongitude", length = 10)
	public String getUnilongitude() {
		return this.unilongitude;
	}

	public void setUnilongitude(String unilongitude) {
		this.unilongitude = unilongitude;
	}

	@Column(name = "unihelicoptero", length = 10)
	public String getUnihelicoptero() {
		return this.unihelicoptero;
	}

	public void setUnihelicoptero(String unihelicoptero) {
		this.unihelicoptero = unihelicoptero;
	}

	@Column(name = "unitexto", length = 163)
	public String getUnitexto() {
		return this.unitexto;
	}

	public void setUnitexto(String unitexto) {
		this.unitexto = unitexto;
	}
}