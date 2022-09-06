package unit02.employee;

public class Staff extends Employee {

	public Staff(String no, String name, int career) {
		super(no, name, career);
	}

	@Override
	public void paySalary() {
		if(career < 5)
			salary = career * 10;
		else
			salary = career * 20;
	}
	


}
