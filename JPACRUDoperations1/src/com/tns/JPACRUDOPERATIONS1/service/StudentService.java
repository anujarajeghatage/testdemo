package com.tns.JPACRUDOPERATIONS1.service;

import com.tns.JPACRUDOPERATIONS1.entities.Student;

public interface StudentService {
	
	 public abstract void addStudent(Student student);
	 
	 public abstract Student findStudentById(int id);
	  
	 public abstract void updateStudent(Student student);
	 
	 public abstract void removeStudent(Student student);

}
