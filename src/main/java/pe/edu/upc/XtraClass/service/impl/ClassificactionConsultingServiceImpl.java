package pe.edu.upc.XtraClass.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.XtraClass.model.entity.ClassificationConsulting;
import pe.edu.upc.XtraClass.model.repository.ClassificactionConsultingRepository;
import pe.edu.upc.XtraClass.service.ClassificactionConsultingService;


@Service
public class ClassificactionConsultingServiceImpl implements ClassificactionConsultingService{
	
	@Autowired
	private ClassificactionConsultingRepository classificactionConsultingRepository;
	
	
	@Override
	public JpaRepository<ClassificationConsulting,String> getRepository() {
		return classificactionConsultingRepository;
	}

}
