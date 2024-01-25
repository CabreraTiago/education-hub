package com.educationhub.student.services;

import com.educationhub.student.entities.Student;
import com.educationhub.student.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentService {

	private final StudentRepository studentRepository;

	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	public Student findById(long id) {
		return studentRepository.findById(id).orElseThrow();
	}

	public void save(Student student) {
		studentRepository.save(student);
	}

	public List<Student> findByCourseId(long courseId) {
		return studentRepository.findByCourseId(courseId);
	}

}
