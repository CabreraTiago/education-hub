package com.coursehub.course.services;

import com.coursehub.course.clients.StudentClient;
import com.coursehub.course.dto.StudentDTO;
import com.coursehub.course.entities.Course;
import com.coursehub.course.http.responses.StudentByCourseResponse;
import com.coursehub.course.repositories.CourseRepository;
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
