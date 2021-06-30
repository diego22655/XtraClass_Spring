package pe.edu.upc.XtraClass.service;


import java.util.List;

import pe.edu.upc.XtraClass.model.entity.SubjectTeacher;

public interface SubjectTeacherService extends CrudService<SubjectTeacher, Integer>{
	public List<SubjectTeacher>listsubjectteacher();
}
