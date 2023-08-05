package com.uce.edu.demo.repositori;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.uce.edu.demo.modelo.Vehiculo;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface IVehiculoRepository {
	
	public void insertarVehiculo(Vehiculo vehiculo);
	public List<Vehiculo> seleccionarTodos();
	public Vehiculo seleccionarPorPlaca(String placa);
	

}
