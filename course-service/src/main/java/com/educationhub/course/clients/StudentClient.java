package com.educationhub.course.clients;

import com.educationhub.course.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "course-hub-student", url = "localhost:8080/students")
public interface StudentClient {

	@GetMapping("/by-course/{courseId}")
	List<StudentDTO> findByCourseId(@PathVariable long courseId);

}
