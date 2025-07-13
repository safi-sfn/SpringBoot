package service;

public class DevOpsCourse implements ICourse {

	@Override
	public boolean getTheCourse(double amount) {
		
		System.out.println("DevOps course purchased and amount paid is "+amount);
		return true;
	}

	public DevOpsCourse() {
		System.out.println("DevOps bean created");	}

}
