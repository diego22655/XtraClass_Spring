package pe.edu.upc.XtraClass.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.edu.upc.XtraClass.model.entity.SubjectTeacher;

@Repository
public interface SubjectTeacherRepository extends JpaRepository<SubjectTeacher, Integer>{

}
