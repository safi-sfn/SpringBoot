package main;

import service.BuyCourse;
import service.DevOpsCourse;
import service.JavaCourse;
import service.SpringBootCourse;

public class LaunchApp {

	public static void main(String[] args) {
		
		BuyCourse buyCourse = new BuyCourse();  //target class/object
		
//		JavaCourse java = new JavaCourse();  --> Dependent object
//		buyCourse.setCourse(java);
		
//		injecting dependent object into target object is called -> Dependency Injection
		
		// Setter injection
		buyCourse.setCourse(new JavaCourse());
//		buyCourse.setCourse(new DevOpsCourse());
//		buyCourse.setCourse(new SpringBootCourse());
		
		boolean status = buyCourse.buyTheCourse(4500);
		if(status) 
			System.out.println("Enrolled the courses");
		else
			System.out.println("failed to enroll");

	}

}
