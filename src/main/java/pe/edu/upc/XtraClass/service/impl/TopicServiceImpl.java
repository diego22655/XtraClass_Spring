package pe.edu.upc.XtraClass.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.XtraClass.model.entity.Topic;
import pe.edu.upc.XtraClass.model.repository.TopicRepository;
import pe.edu.upc.XtraClass.service.TopicService;

@Service
public class TopicServiceImpl implements TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	@Override
	public JpaRepository<Topic, Integer> getRepository() {
		return topicRepository;
	}

}
