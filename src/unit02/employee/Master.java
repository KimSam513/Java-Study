package unit02.employee;

public class Master extends Employee {
	
	int bonus;

	public Master(String no, String name, int career, int bonus) {
		super(no, name, career);
		this.bonus = bonus;
	}

	@Override
	public void paySalary() {
		salary = career * 30 + bonus;
	}
	

}
