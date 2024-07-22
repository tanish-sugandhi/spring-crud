package com.example.spring1.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring1.entities.Course;
import com.example.spring1.services.CourseService;

@RestController
public class MainController {
    //@GetMapping("/")
	//public String home()
	//{
		//return "this is home";
	//}
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/get")
	public List<Course> getCourses()
	{
		return this.courseService.getCourses();
	}
	@GetMapping("/getbyid/{courseId}")
	public Course getCourse(@PathVariable String courseId)
	{
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	@PostMapping("/add")
	public String addCourse(@RequestBody Course course){
		return this.courseService.addCourse(course);
	}
	@PutMapping("/update")
	public Course updateCourse(@RequestBody Course course)
	{
		return this.courseService.updateCourse(course);
	} 
	@GetMapping("/delete/{courseId}")
	public Course deleteCourse(@PathVariable String courseId)
	{
		return this.courseService.deleteCourse(Long.parseLong(courseId));
	}
}
