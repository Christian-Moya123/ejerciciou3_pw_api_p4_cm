package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.serviceto.VehiculoTo;

public interface IVehiculoService {
	
	public void insertarVehiculo(Vehiculo vehiculo);
	public List<VehiculoTo> seleccionarTodos();
	public VehiculoTo seleccionarPorPlaca(String placa);

}
