package com.tns.JPACRUDOPERATIONS1.dao;

import com.tns.JPACRUDOPERATIONS1.entities.Student;

public interface StudentDao
{
 public abstract void addStudent(Student student);
 
 public abstract Student getStudentById(int id);
  
 public abstract void updateStudent(Student student);
 
 public abstract void removeStudent(Student student);
 
 public abstract void CommitTransaction();
 
 public abstract void beginTransaction();
 
 
 
 
 
}
