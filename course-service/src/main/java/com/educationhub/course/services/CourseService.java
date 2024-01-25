package com.educationhub.course.services;

import com.educationhub.course.clients.StudentClient;
import com.educationhub.course.dto.StudentDTO;
import com.educationhub.course.entities.Course;
import com.educationhub.course.http.responses.StudentByCourseResponse;
import com.educationhub.course.repositories.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CourseService {

	private final CourseRepository courseRepository;
	private final StudentClient studentClient;

	public List<Course> findAll() {
		return courseRepository.findAll();
	}

	public Course findById(long id) {
		return courseRepository.findById(id).orElseThrow();
	}

	public void save(Course course) {
		courseRepository.save(course);
	}

	public StudentByCourseResponse findStudentByCourseId(long courseId) {
		var course = findById(courseId);
		List<StudentDTO> students = studentClient.findByCourseId(course.getId());
		return StudentByCourseResponse
				.builder()
				.courseName(course.getName())
				.teacher(course.getTeacher())
				.students(students).build();
	}

}
