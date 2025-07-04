package service;

public class JavaCourse implements ICourse {

	@Override
	public boolean getTheCourse(double amount) {
		System.out.println("Java course purchased and amount paid is "+amount);
		return true;
	}

}
