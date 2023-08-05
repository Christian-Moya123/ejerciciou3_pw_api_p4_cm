package com.uce.edu.demo.controller;



import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.service.IVehiculoService;
import com.uce.edu.demo.serviceto.VehiculoTo;


@RestController
@RequestMapping("/vehiculos")
@CrossOrigin
public class VehiculoControllerRestFull {
	
	@Autowired
	private IVehiculoService vehiculoService;
	
	@GetMapping(path="/{placa}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public VehiculoTo consultarPorPlaca(@PathVariable String placa) {
		return this.vehiculoService.seleccionarPorPlaca(placa);
	}
	
	@GetMapping
	public ResponseEntity<List<VehiculoTo>> consultarTodosLosVehiculos() {
	    List<VehiculoTo> listaVehiculos = this.vehiculoService.seleccionarTodos();
	    
	    for (VehiculoTo vehiculo : listaVehiculos) {
	        String placa = vehiculo.getPlaca();
	        Link selfLink = linkTo(methodOn(VehiculoControllerRestFull.class).consultarPorPlaca(placa)).withSelfRel();
	        vehiculo.add(selfLink);
	    }
	    
	    return ResponseEntity.ok(listaVehiculos);
	}

	


	

}
