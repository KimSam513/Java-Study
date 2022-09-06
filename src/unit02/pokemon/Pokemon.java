package unit02.pokemon;

public abstract class Pokemon {
	
	String name;
	String skill;
	int experience;

	
	public Pokemon() {
	}

	public Pokemon(String name, String skill, int experience) {
		this.name = name;
		this.skill = skill;
		this.experience = experience;
	}
	
	public abstract void train();
	public abstract void levelUp();
	public void pokemonInfo() {
		System.out.println("이름 : " + name + ", 기술 : " + skill + ", 경험치 : " + experience);
	}
	

}
