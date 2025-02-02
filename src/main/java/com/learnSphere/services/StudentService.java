package com.learnSphere.services;

import java.util.List;

import com.learnSphere.entities.Course;
import com.learnSphere.entities.Lesson;

public interface StudentService {
	List<Course> fetchCourseList();
	
	Course fetchCourse(int CourseId);
	
	Lesson getLesson(int lessonId);

}
