package com.psd.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psd.entity.Student;
import com.psd.service.StudentService;
@Service
public class ServiceImpl implements StudentService {
	@Autowired
	com.psd.repository.Studentrepository Studentrepository;
	
	
	@Override
	public List<Student> getAllStudent() {
		
		return Studentrepository.findAll();
	}

}
