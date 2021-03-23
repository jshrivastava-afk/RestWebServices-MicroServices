package com.rest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.springrest.model.Course;
import com.rest.springrest.service.CourseService;

@RestController
public class MyController {

	@Autowired
	CourseService cs;
	
	@GetMapping("/")
	public String home()
	{
		return "home";
	}
	
	//GET-all
	@GetMapping("/course")
	public List<Course> getCourses()
	{
		return cs.getCourses();
		
	}
	
	//GET-by id
	@GetMapping("/course/{c_id}")
	public Course getCourse(@PathVariable long c_id)
	{
		return cs.getCourse(c_id) ;
		
	}
	
	//POST-add course
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course cr)
	{
		return cs.addCourse(cr);
		
	}
}
