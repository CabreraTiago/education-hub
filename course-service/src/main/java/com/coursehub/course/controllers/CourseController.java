package com.coursehub.course.controllers;

import com.coursehub.course.entities.Course;
import com.coursehub.course.http.responses.StudentByCourseResponse;
import com.coursehub.course.services.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/courses")
public class CourseController {

	private final CourseService courseService;

	@GetMapping
	public List<Course> findAll() {
		return courseService.findAll();
	}

	@GetMapping("/{id}")
	public Course findById(@PathVariable long id) {
		return courseService.findById(id);
	}

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public void save(@RequestBody Course course) {
		courseService.save(course);
	}

	@GetMapping("/students/{courseId}")
	public StudentByCourseResponse findStudentByCourseId(@PathVariable long courseId) {
		return courseService.findStudentByCourseId(courseId);
	}

}
