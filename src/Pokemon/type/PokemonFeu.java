package Pokemon.type;

import Pokemon.Pokemon;

public class PokemonFeu extends Pokemon{
	
	public PokemonFeu(String nom) {
		super(nom, TypePokemon.FEU);
	}
	
	@Override
	public void attaquer(Pokemon p) {
		p.subir(this);
		this.log("J'ai attaqué : " + p.getNom());
	}
	
	@Override
	public void subir(Pokemon p) {
		TypePokemon t = p.getTypePokemon();
		
		switch(t) {
		case PLANTE :
			this.hp -= p.getAtk()*0.5;	
			break;
		case FEU :
			this.hp -= p.getAtk() * 0.5;
			break;
		case EAU:
			this.hp -= p.getAtk() * 2;
			break;
		default :
			this.hp -= p.getAtk();	
		} 
		
	} 
}
