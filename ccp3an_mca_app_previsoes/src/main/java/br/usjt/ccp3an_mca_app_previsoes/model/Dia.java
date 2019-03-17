package br.usjt.ccp3an_mca_app_previsoes.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Dia implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String nomedia;
	private Long tempmin;
	private Long tempmax;
	private String descricao;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomedia() {
		return nomedia;
	}
	public void setNomedia(String nomeDIa) {
		this.nomedia = nomeDIa;
	}
	public Long getTempmin() {
		return tempmin;
	}
	public void setTempmin(Long tempMin) {
		this.tempmin = tempMin;
	}
	public Long getTempmax() {
		return tempmax;
	}
	public void setTempmax(Long tempMax) {
		this.tempmax = tempMax;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
