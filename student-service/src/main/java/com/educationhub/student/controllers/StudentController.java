package com.educationhub.student.controllers;

import com.educationhub.student.entities.Student;
import com.educationhub.student.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/students")
public class StudentController {

	private final StudentService studentService;

	@GetMapping
	public List<Student> findAll() {
		return studentService.findAll();
	}

	@GetMapping("/{id}")
	public Student findById(@PathVariable long id) {
		return studentService.findById(id);
	}

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public void save(@RequestBody Student student) {
		studentService.save(student);
	}

	@GetMapping("/by-course/{courseId}")
	public List<Student> findByCourseId(@PathVariable long courseId) {
		return studentService.findByCourseId(courseId);
	}

}
