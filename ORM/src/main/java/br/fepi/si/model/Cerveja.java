package br.fepi.si.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="cerveja")
@PrimaryKeyJoinColumn(name = "id_bebida")
public class Cerveja extends Bebida implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private TioposEnum tipo;
	
	
	public Cerveja() {
		super();
	}
	
	
	public Cerveja(TioposEnum tipo) {
		super();
		this.tipo = tipo;
	}

	@Column (name=" tipo_cerveja")
	@Enumerated(EnumType.STRING)
	public TioposEnum getTipo() {
		return tipo;
	}

	public void setTipo(TioposEnum tipo) {
		this.tipo = tipo;
	}
	
	

}
