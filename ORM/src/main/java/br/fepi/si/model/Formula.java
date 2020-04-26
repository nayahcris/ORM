package br.fepi.si.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="formula")
public class Formula implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long idFormula;
	private String descricao;
	
	
	public Formula() {
		super();
	}

	public Formula(Long idFormula, String descricao) {
		super();
		this.idFormula = idFormula;
		this.descricao = descricao;
	}
	@Id
	@GeneratedValue
	@Column (name = "id_formula")
	public Long getIdFormula() {
		return idFormula;
	}
	public void setIdFormula(Long idFormula) {
		this.idFormula = idFormula;
	}
	@Column (name = "descricao", length = 30, nullable = true)
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idFormula == null) ? 0 : idFormula.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Formula other = (Formula) obj;
		if (idFormula == null) {
			if (other.idFormula != null)
				return false;
		} else if (!idFormula.equals(other.idFormula))
			return false;
		return true;
	}
	
	
	
	
	

}
