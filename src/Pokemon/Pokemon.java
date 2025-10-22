package Pokemon;
import java.util.Random;

import Pokemon.type.TypePokemon;

public abstract class Pokemon {
	private String nom;
	private int niveau;
	protected int hp;
	private int atk;
	private TypePokemon type;
	
	public Pokemon(String nom, TypePokemon t) {
		this.nom = nom;
		this.type = t;
		Random random = new Random();
		this.niveau = random.nextInt(1, 11);
		this.hp = niveau*2;
		this.atk = (niveau/2) + 1;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getNiveau() {
		return this.niveau;
	}

	public int getHp() {
		return this.hp;
	}
	
	public int getAtk() {
		return this.atk;
	}
	
	public TypePokemon getTypePokemon() {
		return this.type;
	}
	
	public boolean isKO() {
		if(this.hp <= 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void soigner() {
		this.hp = this.niveau * 2;
		System.out.println(this.nom + " à de nouveau "
				+ this.hp
				+ " hp !");
	}
	
	public abstract void attaquer(Pokemon p);
	
	public abstract void subir(Pokemon p);
	
	public String toString() {
		return "Je m'appelle " + this.nom
				+ "\n\tJe suis de niveau : " + this.niveau
				+ "\n\tJ'ai " + this.hp + " points de vie"
				+ "\n\tMon attaque de base est de " + this.atk
				+ "\n\tJe suis de type " + this.type;
	}
	
	public void log(String msg) {
		System.out.println("[" + this.nom + "] : " + msg + "\n");
	}
}
