package br.usjt.ccp3an_mca_app_previsoes.model;

import java.io.Serializable;
import java.util.Date;

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
	private Date dataHora;
	private String humidade;
	private Double latitude;
	private Double longitude;
	
	public Date getDataHora() {
		return dataHora;
	}
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	public String getHumidade() {
		return humidade;
	}
	public void setHumidade(String humidade) {
		this.humidade = humidade;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
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
