package unit02.pokemon;

public class Picachu extends Pokemon {

	boolean zSkill;

	public Picachu(String name, String skill, int experience, boolean zSkill) {
		super(name, skill, experience);
		this.zSkill = zSkill;
	}

	@Override
	public void train() {
		experience += 50;
		System.out.println(name + "�� �Ʒ��� ���� ����ġ " + experience + "�� �Ǿ����ϴ�");
		
	}

	@Override
	public void levelUp() {
		if(experience >= 50) {
			experience -= 30;
			
			if(zSkill) {
				name = "�ް�������";
				System.out.println("������ �Ѵܰ� �ö󰬽��ϴ�."+ name + "�� ��ȭ ����!");
			}
			else {
				name = "������";
				System.out.println("������ �Ѵܰ� �ö󰬽��ϴ�." + name + "�� ��ȭ ����~!");
			}
		}
		else
			System.out.println("����ġ�� �����մϴ�. �������� ���ؼ��� �� �Ʒ��ϼ���!!");
			
		
	}
	
	
	
	
	
	
}
