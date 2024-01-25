package com.coursehub.course.http.responses;

import com.coursehub.course.dto.StudentDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentByCourseResponse {

	private String courseName;
	private String teacher;
	private List<StudentDTO> students;

}
