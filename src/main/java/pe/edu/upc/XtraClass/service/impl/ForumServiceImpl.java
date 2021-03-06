package pe.edu.upc.XtraClass.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.XtraClass.model.entity.Forum;
import pe.edu.upc.XtraClass.model.repository.ForumRepository;
import pe.edu.upc.XtraClass.service.ForumService;

@Service
public class ForumServiceImpl implements ForumService {

	@Autowired
	private ForumRepository forumRepository;
	
	@Override
	public JpaRepository<Forum, Integer> getRepository(){
		return forumRepository;
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Forum> findByIssue(String issue) throws Exception {
		return forumRepository.findByIssue(issue);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Forum> findByIssueStartingWith(String issue) throws Exception {
		return forumRepository.findByIssueStartingWith(issue);
	}
}
