package com.rest.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.springrest.model.Course;

@Service
public class CourseServiceImpl implements CourseService {

	
	@Override
	public List<Course> getCourses() {
		List<Course> li=new ArrayList<>();
		li.add(new Course(23,"Ramayan","About Ram"));
		li.add(new Course(33,"Bhagvad Geeta ","About Krishna"));
		return li;
		
	}

	@Override
	public Course getCourse(long c_id) {
		
		Course c=null;
		List<Course> li=getCourses();
		
		for(Course course:li)
		{
			if(course.getC_id()==c_id)
			{
				c=course;
				break;
			}
		}
	return c;
	}

	@Override
	public Course addCourse(Course cr) {
		
		List<Course> li=getCourses();
		li.add(cr);
		return cr; 
	}

}
