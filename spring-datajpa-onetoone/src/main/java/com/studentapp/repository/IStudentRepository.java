package com.studentapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.studentapp.model.Student;
@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer>{

	// 
//	List<Student> findByDepartment(String dept);
//	List<Student> findByAdressCity(String city);
//	List<Student> findByAdressCityAndDepartment(String city,String department);
	
	
	@Query("from student s where s.department=?1")
	List<Student> findByStudDepartment(String dept);
	
	@Query("from student s inner join s.adress a where a.city=?1")
	List<Student> findByStudAdressCity(String city);
	
	@Query("from student s inner join s.adress a where a.city=?1 and s.department=?2")
	List<Student> findByAdressCityAndDepartment(String city,String department);
	
	@Query("from student s inner join s.adress a where a.city=?1 and a.state=?2")
	List<Student> findByCityState(String city,String state);
	
}
