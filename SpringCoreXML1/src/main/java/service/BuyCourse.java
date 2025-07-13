package service;

public class BuyCourse {
	

	private ICourse course;
	
	
	
	public BuyCourse() {
		
		System.out.println("Course bean created");
	}

	public void setCourse(ICourse course) {
		this.course = course;
	}

	public boolean buyTheCourse(double amount) {
		
		
		return  course.getTheCourse(amount);
		

	}

}
