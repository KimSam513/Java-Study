package unit02.employee;

public abstract class Employee {

	
	//�ּ�����!!! �ּ��� �޾Ƽ� ��Ʈ���� ��������� Ȯ���غ���!!
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
		System.out.println("��ȣ : " + no + "�̸� : " + name + "���� :" + salary + "����");
	}
	
	
}
