package com.restapi.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.restapi.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	

}
