package com.uce.edu.demo.serviceto;

import java.io.Serializable;
import java.math.BigDecimal;

import org.springframework.hateoas.RepresentationModel;


public class VehiculoTo extends RepresentationModel<VehiculoTo> implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String placa;
	private String marca;
	private BigDecimal precio;
	private String cilindraje;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public String getCilindraje() {
		return cilindraje;
	}
	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
