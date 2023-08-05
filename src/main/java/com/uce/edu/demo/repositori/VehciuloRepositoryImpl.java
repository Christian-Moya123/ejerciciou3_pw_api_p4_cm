package com.uce.edu.demo.repositori;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.uce.edu.demo.modelo.Vehiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class VehciuloRepositoryImpl implements IVehiculoRepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public List<Vehiculo> seleccionarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Vehiculo> myQuery = this.entityManager.createQuery("SELECT v FROM Vehiculo v", Vehiculo.class);
        return myQuery.getResultList();
	}

	@Override
	public Vehiculo seleccionarPorPlaca(String placa) {
	    String sql = "SELECT v FROM Vehiculo v WHERE v.placa = :datoPlaca";
	    TypedQuery<Vehiculo> myQuery = this.entityManager.createQuery(sql, Vehiculo.class);
	    myQuery.setParameter("datoPlaca", placa);
	    return myQuery.getSingleResult();
	}


	
	

}
