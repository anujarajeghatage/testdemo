package com.tns.JPACRUDOPERATIONS1.client;

import com.tns.JPACRUDOPERATIONS1.entities.Student;
import com.tns.JPACRUDOPERATIONS1.service.StudentService;
import com.tns.JPACRUDOPERATIONS1.service.StudentServiceImplementation;





public class Client {

	public static void main(String[] args) {
		
		Student student=new Student();
		StudentService service=new StudentServiceImplementation();
		//create operation
		student.setStudentid(102);
		student.setName("tanu");
        service.addStudent(student);		
        
        
       /* //retrive
        service.findStudentById(100);
        System.out.println("id is"+student.getStudentid());
        System.out.println("id is"+student.getName());*/
        
        //update
        student=service.findStudentById(100);
        student.setName("dhoni");
        service.updateStudent(student);
	}

}
