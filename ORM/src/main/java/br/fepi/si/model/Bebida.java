package br.fepi.si.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;



@Entity
@Table (name = "bebida")
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn (name = "bebida")
public class Bebida implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long idBebida;
	private String rotulo;
	private Double volumeAlcoolico;
	private BigDecimal preco;
	private Formula formula;
	
	public Bebida() {
		
	}

	public Bebida(Formula formula, Long idBebida, String rotulo, Double volumeAlcoolico, BigDecimal preco) {
		super();
		this.formula = formula;
		this.idBebida = idBebida;
		this.rotulo = rotulo;
		this.volumeAlcoolico = volumeAlcoolico;
		this.preco = preco;
	}
	
	@Id
	@GeneratedValue(generator = "inc")
	@Column (name = "id_bebida")
	@GenericGenerator(name = "inc", strategy = "increment")
	public Long getIdBebida() {
		return idBebida;
	}
	public void setIdBebida(Long idBebida) {
		this.idBebida = idBebida;
	}
	
	@Column (name = "rotulo", length = 30, nullable = false)
	public String getRotulo() {
		return rotulo;
	}
	public void setRotulo(String rotulo) {
		this.rotulo = rotulo;
	}
	
	@Column (name = "volume_alcoolico", nullable = false)
	public Double getVolumeAlcoolico() {
		return volumeAlcoolico;
	}
	public void setVolumeAlcoolico(Double volumeAlcoolico) {
		this.volumeAlcoolico = volumeAlcoolico;
	}
	
	@Column (name= "preco", precision = 10, scale = 2, nullable = false)
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	@ManyToOne
	@JoinColumn (name = "id_formula")
	public Formula getFormula() {
		return formula;
	}
	public void setFormula(Formula formula) {
		this.formula = formula;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idBebida == null) ? 0 : idBebida.hashCode());
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
		Bebida other = (Bebida) obj;
		if (idBebida == null) {
			if (other.idBebida != null)
				return false;
		} else if (!idBebida.equals(other.idBebida))
			return false;
		return true;
	}

	
	
	
	
	
	
	

}
