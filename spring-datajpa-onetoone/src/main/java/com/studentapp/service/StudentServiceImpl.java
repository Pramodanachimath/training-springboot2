package com.studentapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentapp.model.Student;
import com.studentapp.repository.IStudentRepository;
@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentRepository studentRepository;

	@Override
	public void addStudent(Student student) {

	studentRepository.save(student);
		
		
	}

	@Override
	public void updateStudent(Student student) {
		studentRepository.save(student);
	}

	@Override
	public void deleteStudent(int studentId) {

		studentRepository.deleteById(studentId);
		
	}

	@Override
	public Student getById(int studentId) {
		Optional<Student> student= studentRepository.findById(studentId);
		if(student.isPresent())
           return student.get();
		return null;
		
	}

	@Override
	public List<Student> getAll() {
		return studentRepository.findAll();
	}

	@Override
	public List<Student> getByDepartment(String department) {
		//return studentRepository.findByDepartment(department);
		return studentRepository.findByStudDepartment(department);
	}

	@Override
	public List<Student> getByCity(String city) {
		return studentRepository.findByStudAdressCity(city);
//		return studentRepository.findByAdressCity(city);
	}

	@Override
	public List<Student> getByCityAndDepartment(String city, String department) {
		return studentRepository.findByAdressStudCityAndDepartment(city, department);
//		return studentRepository.findByAdressCityAndDepartment(city, department);
	}

	@Override
	public List<Student> getByCityAndState(String city, String state) {
		return studentRepository.findByStudCityState(city, state);
//		return studentRepository.findByCityState(city, state);
	}

	

	

}
