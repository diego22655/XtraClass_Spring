package pe.edu.upc.XtraClass.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.XtraClass.model.entity.Student;
import pe.edu.upc.XtraClass.model.repository.StudentRepository;
import pe.edu.upc.XtraClass.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public JpaRepository<Student, Integer> getRepository(){
		return studentRepository;
	}
	
}
