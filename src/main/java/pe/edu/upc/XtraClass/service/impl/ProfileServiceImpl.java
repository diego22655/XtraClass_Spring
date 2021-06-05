package pe.edu.upc.XtraClass.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.XtraClass.model.entity.Profile;
import pe.edu.upc.XtraClass.model.repository.ProfileRepository;
import pe.edu.upc.XtraClass.service.ProfileService;

@Service
public class ProfileServiceImpl implements ProfileService{
	@Autowired
	private ProfileRepository profileRepository;
	
	@Override
	public JpaRepository<ProfileTeacher, Integer> getRepository() {
		return ProfileRepository;
	}
}
