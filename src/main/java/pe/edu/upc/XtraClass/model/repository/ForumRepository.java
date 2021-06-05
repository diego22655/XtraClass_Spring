package pe.edu.upc.XtraClass.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.edu.upc.XtraClass.model.entity.Forum;

@Repository
public interface ForumRepository extends JpaRepository<Forum, Integer>{
    List<Forum> findByIssue(String issue);
	
	  @Query("select e from Forum e where e.issue like ?1%")
	  List<Forum> findByIssueStartingWith (String issue);
}
