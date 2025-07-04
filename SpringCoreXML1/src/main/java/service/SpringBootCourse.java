package service;

public class SpringBootCourse implements ICourse {

	@Override
	public boolean getTheCourse(double amount) {
		System.out.println("SpringBoot course purchased and amount paid is "+amount);
		return true;
	}

}
