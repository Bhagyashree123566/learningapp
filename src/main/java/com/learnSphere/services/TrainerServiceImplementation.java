package com.learnSphere.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnSphere.entities.Course;
import com.learnSphere.entities.Lesson;
import com.learnSphere.repositories.CourseRepository;
import com.learnSphere.repositories.LessonRepository;

@Service
public class TrainerServiceImplementation implements
                                  TrainerService{
	@Autowired
	CourseRepository repo;
	@Autowired
	LessonRepository lrepo;
	

	@Override
	public String addCourse(Course course) {
		repo.save(course);
		return null;
	}


	@Override
	public List<Course> fetchAllCourses() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}


	@Override
	public String addLesson(Lesson lesson) {
		// TODO Auto-generated method stub
		lrepo.save(lesson);
		return "lesson added";
	}


	@Override
	public String saveCourse(Course course) {
		repo.save(course);
		return "course updated";
	}
	

}
