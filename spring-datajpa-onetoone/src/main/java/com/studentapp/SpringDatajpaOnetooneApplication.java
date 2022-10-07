package com.studentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentapp.model.Adress;
import com.studentapp.model.Student;
import com.studentapp.service.IStudentService;
import com.studentapp.service.StudentServiceImpl;

@SpringBootApplication
public class SpringDatajpaOnetooneApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaOnetooneApplication.class, args);
	}

	@Autowired
	IStudentService studentService;
	@Override
	public void run(String... args) throws Exception {

		Adress adress=new Adress("Bangalore", "Karnataka");
		Student student=new Student("Pramod", "Mech", adress);
		Adress adress1=new Adress("Bijapur", "Karnataka");
		Student student1=new Student("Virat", "Digital", adress1);
//		studentService.addStudent(student);
//		studentService.addStudent(student1);
//		System.out.println("get by all");
//		studentService.getAll().forEach(System.out::println);
//		System.out.println();
//		System.out.println("get by city And department");
//		studentService.getByCityAndDepartment("Bijapur", "Digital").forEach(System.out::println);
//		System.out.println();
//		System.out.println("get by department");
//		studentService.getByDepartment("Mech").forEach(System.out::println);
//		System.out.println();
//		System.out.println("get by city");
//		studentService.getByCity("Bangalore").forEach(System.out::println);
//		System.out.println(studentService.getById(2));
//		
//		System.out.println();
//		System.out.println("get by city and state");
//		studentService.getByCityAndState("Bangalore", "karnataka");
		
	}

}
