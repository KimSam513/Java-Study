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
		System.out.println(name + "가 훈련을 통해 경험치 " + experience + "이 되었습니다");
		
	}

	@Override
	public void levelUp() {
		if(experience >= 50) {
			experience -= 30;
			
			if(zSkill) {
				name = "메가라이츄";
				System.out.println("레벨이 한단계 올라갔습니다."+ name + "로 진화 성공!");
			}
			else {
				name = "라이츄";
				System.out.println("레벨이 한단계 올라갔습니다." + name + "로 진화 성공~!");
			}
		}
		else
			System.out.println("경험치가 부족합니다. 레벨업을 위해서는 더 훈련하세요!!");
			
		
	}
	
	
	
	
	
	
}
