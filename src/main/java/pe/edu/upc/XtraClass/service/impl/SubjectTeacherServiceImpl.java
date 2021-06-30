package pe.edu.upc.XtraClass.service.impl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.XtraClass.model.entity.SubjectTeacher;
import pe.edu.upc.XtraClass.model.repository.SubjectTeacherRepository;
import pe.edu.upc.XtraClass.service.SubjectTeacherService;

@Service
public class SubjectTeacherServiceImpl implements SubjectTeacherService{
	@Autowired
	private SubjectTeacherRepository subjectTeacherRepository;
	
	@Override
	public JpaRepository<SubjectTeacher, Integer> getRepository() {
		return subjectTeacherRepository;
	}

	@Override
	@Transactional(readOnly=true)
	public List<SubjectTeacher> listsubjectteacher() {
		return subjectTeacherRepository.findAll();
	}
	
}
