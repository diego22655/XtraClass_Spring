package pe.edu.upc.XtraClass.service;

import pe.edu.upc.XtraClass.model.entity.Forum;

public interface ForumService extends CrudService<Forum, Integer>{
    List<Forum> findByIssue(String issue) throws Exception;
	  List<Forum> findByIssueStartingWith(String issue) throws Exception;
}
