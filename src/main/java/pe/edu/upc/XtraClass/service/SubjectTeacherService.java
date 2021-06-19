package pe.edu.upc.XtraClass.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.XtraClass.model.entity.Subject;
import pe.edu.upc.XtraClass.model.entity.SubjectTeacher;

public interface SubjectTeacherService extends CrudService<SubjectTeacher, Integer>{

	static List<SubjectTeacher> findByStarTime11(Object starTime, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	static List<SubjectTeacher> findBySubjectId( String id) {
		// TODO Auto-generated method stub
		return null;
	}

	static List<SubjectTeacher> findByStarTime1(Object starTime, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	static List<SubjectTeacher> findByStarTime1(Subject subject, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	static Optional<SubjectTeacher> findBySubjectName(Object name, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	static Optional<SubjectTeacher> findBySubjectName(Subject subject, String string) {
		// TODO Auto-generated method stub
		return null;
	}
	static Optional<SubjectTeacher> findBySubjectName(Subject subject, Object string) {
		// TODO Auto-generated method stub
		return null;
	}


}
