package br.com.ocorrenciasbr.model;

// Generated Sep 16, 2013 3:34:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

/**
 * TipoareaespecialId generated by hbm2java
 */
@Entity
public class TipoAreaEspecial implements java.io.Serializable {

	private Integer taecodigo;
	private String taedescricao;
	private String taeatualiza;

	@Column(name = "taecodigo")
	public Integer getTaecodigo() {
		return this.taecodigo;
	}

	public void setTaecodigo(Integer taecodigo) {
		this.taecodigo = taecodigo;
	}

	@Column(name = "taedescricao", length = 22)
	public String getTaedescricao() {
		return this.taedescricao;
	}

	public void setTaedescricao(String taedescricao) {
		this.taedescricao = taedescricao;
	}

	@Column(name = "taeatualiza", length = 1)
	public String getTaeatualiza() {
		return this.taeatualiza;
	}

	public void setTaeatualiza(String taeatualiza) {
		this.taeatualiza = taeatualiza;
	}
}