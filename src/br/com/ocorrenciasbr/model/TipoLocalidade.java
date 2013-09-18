package br.com.ocorrenciasbr.model;

// Generated Sep 16, 2013 3:34:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

/**
 * TipolocalidadeId generated by hbm2java
 */
@Entity
public class TipoLocalidade implements java.io.Serializable {

	private Integer ttlcodigo;
	private String ttldescricao;
	private String ttlatualiza;

	@Column(name = "ttlcodigo")
	public Integer getTtlcodigo() {
		return this.ttlcodigo;
	}

	public void setTtlcodigo(Integer ttlcodigo) {
		this.ttlcodigo = ttlcodigo;
	}

	@Column(name = "ttldescricao", length = 13)
	public String getTtldescricao() {
		return this.ttldescricao;
	}

	public void setTtldescricao(String ttldescricao) {
		this.ttldescricao = ttldescricao;
	}

	@Column(name = "ttlatualiza", length = 1)
	public String getTtlatualiza() {
		return this.ttlatualiza;
	}

	public void setTtlatualiza(String ttlatualiza) {
		this.ttlatualiza = ttlatualiza;
	}
}