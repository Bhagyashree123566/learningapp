package com.learnSphere.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnSphere.entities.Course;
import com.learnSphere.entities.Lesson;
import com.learnSphere.repositories.CourseRepository;
import com.learnSphere.repositories.LessonRepository;
import com.learnSphere.repositories.UsersRepository;

@Service
public class StudentServiceImplementation implements StudentService {
    @Autowired
	CourseRepository repo;
     
    @Autowired
 	LessonRepository lrepo;
    
    @Autowired
 	UsersRepository urepo;
    
    
	
	@Override
	public List<Course> fetchCourseList() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Course fetchCourse(int CourseId) {
		// TODO Auto-generated method stub
		return repo.findByCourseId(CourseId);
	}

	//modification
		@Override
		public Lesson getLesson(int lessonId) {
			return lrepo.findByLessonId(lessonId);
		}
	
	

}
