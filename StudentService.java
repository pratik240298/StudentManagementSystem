package com.psd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.psd.entity.Student;
@Service
public interface StudentService {
	public List<Student> getAllStudent();

}
