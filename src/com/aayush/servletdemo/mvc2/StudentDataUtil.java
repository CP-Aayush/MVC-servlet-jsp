package com.aayush.servletdemo.mvc2;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	public static List<Student> getStudents(){
		List<Student> students =new ArrayList<>();
		
		students.add(new Student("Mary","Pubic","aaa@gmail.com"));
		students.add(new Student("John","Doe","aaa123@gmail.com"));
		students.add(new Student("Ajay","Pubic","aa2@gmail.com"));
		
		return students;
	}

}
