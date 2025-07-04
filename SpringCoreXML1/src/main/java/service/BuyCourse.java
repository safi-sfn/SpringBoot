package service;

public class BuyCourse {
	
	
	/*
	 * i want to use 
	 *   method of JavaCourse class
	 *   method of SpringBootCourse class
	 *   method of DevOpsCourse class
	 *   --but directly i don't want to create an object of javacourse,springbootcourse,devopscourse
	 *   i will handover the control of object creation to another class called Inversion Control
	 *   in this program our main method is inversion of Control
	 */

	private ICourse course;
	
	public void setCourse(ICourse course) {
		this.course = course;
	}

	public boolean buyTheCourse(double amount) {
		
		
		return  course.getTheCourse(amount);
		

	}

}
