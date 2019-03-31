package br.usjt.ccp3an_mca_app_previsoes.model.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;

import br.usjt.ccp3an_mca_app_previsoes.model.Dia;

//Classe que repesenta o dia

@Entity
public class DiaSemana implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	@NotEmpty
	private String nomedia;
	@OneToOne (optional = false)
	@JoinColumn (name = "Dia")
	private Dia dia;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomedia() {
		return nomedia;
	}
	public void setNomedia(String nomedia) {
		this.nomedia = nomedia;
	}
	public Dia getDia() {
		return dia;
	}
	public void setDia(Dia dia) {
		this.dia = dia;
	}

}
