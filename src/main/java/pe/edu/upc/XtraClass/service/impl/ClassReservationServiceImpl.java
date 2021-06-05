package pe.edu.upc.XtraClass.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.XtraClass.model.entity.ClassificationConsulting;
import pe.edu.upc.XtraClass.model.repository.ClassReservationRepository;
import pe.edu.upc.XtraClass.service.ClassificactionConsultingService;


@Service
public class ClassReservationServiceImpl implements ClassReservationService{
	
	@Autowired
	private ClassReservationRepository classReservationRepository;
	
	@Override
	public JpaRepository<ClassificationConsulting,Integer> getRepository() {
		return classReservationRepository;
		}
}
