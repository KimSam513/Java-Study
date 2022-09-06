package unit02.pokemon;

public class Gobook extends Pokemon {

	
	public Gobook(String name, String skill, int experience) {
		super(name, skill, experience);
	}

	@Override
	public void train() {
		experience += 30;
		System.out.println(name + "�� �Ʒ��� ���� ����ġ " + experience +  "�� �Ǿ����ϴ�");
	}

	@Override
	public void levelUp() {
		if(experience >= 50) {
			experience -= 30;
			name = "��Ϻα�";
			
			System.out.println("������ �Ѵܰ� �ö󰬽��ϴ�."+ name + "�� ��ȭ ����!");

		}
		else
			System.out.println("����ġ�� �����մϴ�. �������� ���ؼ��� �� �Ʒ��ϼ���!!");
		
	}
	
	
	

}
