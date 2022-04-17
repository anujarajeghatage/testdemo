package com.tns.JPACRUDOPERATIONS1.dao;

import javax.persistence.EntityManager;

import com.tns.JPACRUDOPERATIONS1.entities.Student;

public class StudentDaoImplementation implements  StudentDao 
{
   private EntityManager entityManager;

      public StudentDaoImplementation() //empty constructor
      {
    	  entityManager=JPAUtil.getEntityManager();
    	  
      }
      @Override
      public void addStudent(Student student)
      {
    	  entityManager.persist(student);
      }
      @Override
      public Student getStudentById(int id)
      {
    	  Student student=entityManager.find(Student.class,id);
    	  return student;
      }
      @Override
      public  void updateStudent(Student student)
      {
    	  entityManager.merge(student);
      }
      @Override
      public void removeStudent(Student student)
      {
    	  entityManager.remove(student);
      }
      @Override
      public void CommitTransaction()
      {
    	  entityManager.getTransaction().commit();
      }
      @Override
      public void beginTransaction()
      {
    	  entityManager.getTransaction().begin();
      }




   
	
	
	
	
}
