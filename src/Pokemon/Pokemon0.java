package Pokemon;
import java.util.Random;

public class Pokemon0 {
	private String nom;
	private int niveau;
	private int hp;
	private int atk;
	
	public Pokemon0(String nom) {
		this.nom = nom;
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
	
	public void attaquer(Pokemon0 p) {
		p.hp -= this.atk;
	}
	
	public String toString() {
		return "Je m'appelle " + this.nom
				+ "\n\tJe suis de niveau : " + this.niveau
				+ "\n\tJ'ai " + this.hp + " points de vie"
				+ "\n\tMon attaque de base est de " + this.atk;
	}
	
	public void log(String msg) {
		System.out.println("[" + this.nom + "] : " + msg);
	}
}
