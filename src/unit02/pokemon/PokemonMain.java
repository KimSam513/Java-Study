package unit02.pokemon;

public class PokemonMain {

	public static void main(String[] args) {
		
		Picachu pika1 = new Picachu("����", "�鸸��Ʈ", 10, true );
		Picachu pika2 = new Picachu("��ī��", "�鸸��Ʈ", 40, false );
		Gobook  gobu1 =  new Gobook("���α�", "������", 30);
		
		pika1.train();
		pika2.train();
		gobu1.train();
		
		System.out.println("========================================");	
		pika1.levelUp();
		pika2.levelUp();
		gobu1.levelUp();
		System.out.println("========================================");
		pika1.pokemonInfo();
		pika2.pokemonInfo();
		gobu1.pokemonInfo();
		System.out.println("========================================");

	}

}
