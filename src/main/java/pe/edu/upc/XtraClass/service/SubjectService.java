package pe.edu.upc.XtraClass.service;

import java.util.List;

import pe.edu.upc.XtraClass.model.entity.Subject;

public interface SubjectService extends CrudService<Subject, Integer>{
      List<Subject> findByName(String name) throws Exception;
	  List<Subject> findByNameStartingWith(String name) throws Exception;
}
