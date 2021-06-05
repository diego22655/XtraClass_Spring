package pe.edu.upc.XtraClass.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.XtraClass.model.entity.Person;
import pe.edu.upc.XtraClass.model.repository.PersonRepository;
import pe.edu.upc.XtraClass.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public JpaRepository<Person, Integer> getRepository(){
		return personRepository;
	}
}
