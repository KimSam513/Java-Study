package unit02.employee;

public abstract class Employee {

	String no;
	String name;
	int career;
	int salary;
	
	public Employee() {
		
	}
	public Employee(String no, String name, int career) {
		super();
		this.no = no;
		this.name = name;
		this.career = career;
	}
	
	public abstract void paySalary();
	
	
	public void printInfo() {
		System.out.println("번호 : " + no + "이름 : " + name + "월급 :" + salary + "만원");
	}
	
	
}
