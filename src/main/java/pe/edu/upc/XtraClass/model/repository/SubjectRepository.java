package pe.edu.upc.XtraClass.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.edu.upc.XtraClass.model.entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer>{
      List<Subject> findByName(String name);
	
	  @Query("select e from Subject e where e.name like ?1%")
	  List<Subject> findByNameStartingWith (String name);
}
