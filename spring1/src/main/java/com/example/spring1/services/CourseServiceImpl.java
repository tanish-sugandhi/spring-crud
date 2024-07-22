package com.example.spring1.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.example.spring1.entities.Course;
@Service
public class CourseServiceImpl implements CourseService {
  List<Course> list;
  public CourseServiceImpl()
  {
	  list=new ArrayList<>();
	  list.add(new Course(145,"Java core course","this course contains basics of java"));
	  list.add(new Course(4343,"spring boot course","creating rest api using spring boot"));
  }
    public List<Course> getCourses() {
		return list;
	}
    
    public Course getCourse(long courseId)
    {
    	Course c=null;
    	for(Course course:list)
    	{
    		if(course.getId()==courseId)
    		{
    			c=course;
    			break;
    		}
    	}
    	return c;
    }
    public String addCourse(Course course) {
		list.add(course);
		return "Add Successfully...";
	}
   public Course updateCourse(Course course)
   {
	   list.forEach(e->{
		   if(e.getId()==course.getId())
		   {
			   e.setTitles(course.getTitles());
			   e.setDescription(course.getDescription());
		   }
		   
	   });
	   return course;
   }
   public Course deleteCourse(Course courseId)
   {
	   Course c=null;
	   for(Course c1:list)
	   {
		   if(c1==courseId)
		   {
			   c=c1;
			   list.remove(c1);
			   break;
		   }
	   }
	   
	   return c;
   }
@Override
public Course deleteCourse(long courseId) {
	// TODO Auto-generated method stub
	return null;
}
}
