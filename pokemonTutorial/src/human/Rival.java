package human;

import pokemon.Pokemon;

public class Rival extends Human {
	Pokemon[] rivalPokemon;

	public Rival(){
		String rivalName;
		rivalPokemon = new Pokemon[6];
	}

	public void decideRivalName() {
		System.out.println("【ライバルの名前は？】");
		String enterRivalMyName = new java.util.Scanner(System.in).nextLine();
		name = enterRivalMyName;
	}

	public Pokemon selectRivalPokemon(Pokemon[] p, int x) {
		switch(x) {
		case 1:
			rivalPokemon[0] = p[0]; //ヒトカゲ
			break;
		case 2:
			rivalPokemon[0] = p[1]; //フシギダネ
			break;
		case 3:
			rivalPokemon[0] = p[2]; //ゼニガメ
			break;
		default:
			System.out.println("");
		}
		return p[x];
	}

	public void selectRivalPokemonTalk() {
		System.out.println("\n" + this.name + ":");
		System.out.println("「そうか、ならおれは" + rivalPokemon[0].name + "にするぜ！」");
	}
}
