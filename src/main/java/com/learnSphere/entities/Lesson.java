package com.learnSphere.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.ManyToOne;

@Entity
public class Lesson {
	
	@Id
	int lessonId;
	String lessonName;
	String lessonTopics;
	String lessonLink;
	
	@ManyToOne
	Course courses;
	
	public Lesson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lesson(int lessonId, String lessonName, String lessonTopics, String lessonLink, Course courses) {
		super();
		this.lessonId = lessonId;
		this.lessonName = lessonName;
		this.lessonTopics = lessonTopics;
		this.lessonLink = lessonLink;
		this.courses = courses;
	}
	public int getLessonId() {
		return lessonId;
	}
	public void setLessonId(int lessonId) {
		this.lessonId = lessonId;
	}
	public String getLessonName() {
		return lessonName;
	}
	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}
	public String getLessonTopics() {
		return lessonTopics;
	}
	public void setLessonTopics(String lessonTopics) {
		this.lessonTopics = lessonTopics;
	}
	public String getLessonLink() {
		return lessonLink;
	}
	public void setLessonLink(String lessonLink) {
		this.lessonLink = lessonLink;
	}
	public Course getCourses() {
		return courses;
	}
	public void setCourses(Course courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Lesson [lessonId=" + lessonId + ", lessonName=" + lessonName + ", lessonTopics=" + lessonTopics
				+ ", lessonLink=" + lessonLink + ", courses=" + courses + "]";
	}
	
	

}
