package pe.edu.upc.XtraClass.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.XtraClass.model.entity.ClassReservation;
import pe.edu.upc.XtraClass.model.repository.ClassReservationRepository;
import pe.edu.upc.XtraClass.service.ClassReservationService;


@Service
public class ClassReservationServiceImpl implements ClassReservationService {
	
	@Autowired
	private ClassReservationRepository classReservationRepository;
	
	@Override
	public JpaRepository<ClassReservation,Integer> getRepository() {
		return classReservationRepository;
		}
}
