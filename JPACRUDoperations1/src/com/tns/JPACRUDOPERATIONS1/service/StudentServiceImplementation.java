package com.tns.JPACRUDOPERATIONS1.service;

import com.tns.JPACRUDOPERATIONS1.dao.StudentDao;
import com.tns.JPACRUDOPERATIONS1.dao.StudentDaoImplementation;
import com.tns.JPACRUDOPERATIONS1.entities.Student;

public class StudentServiceImplementation implements StudentService {

	
	private StudentDao dao;

	public StudentServiceImplementation() 
	{
		dao=new StudentDaoImplementation ();
		
	}

	@Override
	public void addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.CommitTransaction();
		
		
	}

	@Override
	public Student findStudentById(int id) {
		
		Student student=dao.getStudentById(id);
		return student;
	}

	@Override
	public void updateStudent(Student student) {
		dao.beginTransaction();
        dao.updateStudent(student);
        dao.CommitTransaction();
	}

	@Override
	public void removeStudent(Student student) {
		
		dao.beginTransaction();
       dao.removeStudent(student);
       dao.CommitTransaction();
       
	}
	
	
	
	
	
	
}
