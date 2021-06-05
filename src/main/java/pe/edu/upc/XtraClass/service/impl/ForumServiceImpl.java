package pe.edu.upc.XtraClass.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.XtraClass.model.entity.Forum;
import pe.edu.upc.XtraClass.model.repository.ForumRepository;
import pe.edu.upc.XtraClass.service.crud.ForumService;

@Service
public class ForumServiceImpl implements ForumService{

	@Autowired
	private ForumRepository forumRepository;
	
	@Override
	public JpaRepository<Forum, Integer> getRepository(){
		return forumRepository;
	}
}
