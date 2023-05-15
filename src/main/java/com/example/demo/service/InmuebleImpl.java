package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Inmueble;

import com.example.demo.repository.Inmueble_repo;
@Service
public class InmuebleImpl implements Inmuebles_Services{

	@Autowired
	public Inmueble_repo inmurepo;

	@Override
	public Iterable<Inmueble> findAll() {
		// TODO Auto-generated method stub
		return inmurepo.findAll();
	}

	@Override
	public Optional<Inmueble> findById(Long id_inmueble) {
		// TODO Auto-generated method stub
		return inmurepo.findById(id_inmueble);
	}

	@Override
	public Inmueble save(Inmueble id_inmueble) {
		// TODO Auto-generated method stub
		return inmurepo.save(id_inmueble);
	}

	@Override
	public void deleteById(Long id_inmueble) {
		// TODO Auto-generated method stub
		inmurepo.deleteById(id_inmueble);
	}

	@Override
	public List<Inmueble> findAllByInmueble(Long id_inmueble) {
		// TODO Auto-generated method stub
		List<Inmueble> respuesta= new ArrayList<>();
		List<Inmueble> poki = inmurepo.findAll();
		for(int i=0; i<poki.size(); i++) {
			if(poki.get(i).getUsuarios().getCodigo()==id_inmueble){
				respuesta.add(poki.get(i));
				}
			
		}
		return respuesta;
	}
	
	


}
