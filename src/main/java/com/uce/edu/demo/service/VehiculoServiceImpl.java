package com.uce.edu.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.repositori.IVehiculoRepository;
import com.uce.edu.demo.serviceto.VehiculoTo;

@Service
public class VehiculoServiceImpl implements IVehiculoService{
	
	@Autowired
	private IVehiculoRepository vehiculoRepository;

	@Override
	public void insertarVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public VehiculoTo seleccionarPorPlaca(String placa) {
		// TODO Auto-generated method stub
		return this.convertirTo(this.vehiculoRepository.seleccionarPorPlaca(placa));

	}
	
	public List<VehiculoTo> seleccionarTodos() {
		// TODO Auto-generated method stub
		List<Vehiculo> lista = this.vehiculoRepository.seleccionarTodos();
		List<VehiculoTo> listaTO = lista.stream().map(vehiculo -> this.convertirTo(vehiculo)).collect(Collectors.toList());
		
		return listaTO;
	}
	
	private VehiculoTo convertirTo(Vehiculo vehiculo) {
		VehiculoTo veTO = new VehiculoTo();
		veTO.setCilindraje(vehiculo.getCilindraje());
		veTO.setId(vehiculo.getId());
		veTO.setMarca(vehiculo.getMarca());
		veTO.setPlaca(vehiculo.getPlaca());
		veTO.setPrecio(vehiculo.getPrecio());
		return veTO;
	}
	
	private Vehiculo convertir(VehiculoTo vehiculo) {
		Vehiculo veTO = new Vehiculo();
		veTO.setCilindraje(vehiculo.getCilindraje());
		veTO.setId(vehiculo.getId());
		veTO.setMarca(vehiculo.getMarca());
		veTO.setPlaca(vehiculo.getPlaca());
		veTO.setPrecio(vehiculo.getPrecio());
		return veTO;
	}

}
