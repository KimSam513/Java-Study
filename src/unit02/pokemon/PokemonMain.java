package unit02.pokemon;

public class PokemonMain {

	public static void main(String[] args) {
		
		Picachu pika1 = new Picachu("피츄", "백만볼트", 10, true );
		Picachu pika2 = new Picachu("피카츄", "백만볼트", 40, false );
		Gobook  gobu1 =  new Gobook("꼬부기", "물대포", 30);
		
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
