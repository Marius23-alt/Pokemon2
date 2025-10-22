package Test;
import java.util.ArrayList;

import Pokemon.Pokemon0;
import Pokemon.type.*;

public class Test {

	public static void main(String[] args) {
		
		testPokemonType();

	}
	public static void testPokemon0() {
		//Test Pokemon0
		System.out.println("\nTEST POKEMON0\n");
		ArrayList<Pokemon0> l = new ArrayList<>();
		Pokemon0 p1 = new Pokemon0("Pikachu");
		Pokemon0 p2 = new Pokemon0("Tortank");
		
		l.add(p1);
		l.add(p2);
		
		for(Pokemon0 element : l) {
			element.log(element.toString());
			System.out.println("\n");
		}
		
	}
	
	public static void testPokemonType() {
		System.out.println("\nTEST POKEMON TYPES\n");
		PokemonEau eau = new PokemonEau("Rhinolove");
		PokemonFeu feu = new PokemonFeu("Chovsourir");
		eau.log(eau.toString());
		feu.log(feu.toString());
		eau.attaquer(feu);
		feu.attaquer(eau);
		eau.log(eau.toString());
		feu.log(feu.toString());
	}
}
