package pe.edu.upc.XtraClass.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.XtraClass.model.entity.Subject;
import pe.edu.upc.XtraClass.model.repository.SubjectRepository;
import pe.edu.upc.XtraClass.service.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService{
	@Autowired
	private SubjectRepository subjectRepository;
	
	@Override
	public JpaRepository<Subject, Integer> getRepository() {
		return subjectRepository;
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Subject> findByName(String name) throws Exception {
		return subjectRepository.findByName(name);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Subject> findByNameStartingWith(String name) throws Exception {
		return subjectRepository.findByNameStartingWith(name);
	}
}
