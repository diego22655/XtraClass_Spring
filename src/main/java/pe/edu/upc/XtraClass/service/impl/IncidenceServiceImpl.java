package pe.edu.upc.XtraClass.service.crud.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.XtraClass.model.entity.Incidence;
import pe.edu.upc.XtraClass.model.repository.IncidenceRepository;
import pe.edu.upc.XtraClass.service.crud.IncidenceService;

@Service
public class IncidenceServiceImpl implements IncidenceService{

	@Autowired
	private IncidenceRepository incidenceRepository;
	
	@Override
	public JpaRepository<Incidence,Integer>getRepository(){
		return incidenceRepository;
	}
}
