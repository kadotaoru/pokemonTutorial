package human;

import pokemon.Fushigidane;
import pokemon.Hitokage;
import pokemon.Pokemon;
import pokemon.Zenigame;

public class Hakase extends Human {
	public Pokemon[] firstPokemon;

	public Hakase(String name) {
		this.name = name;
		firstPokemon = new Pokemon[3];  //firstPokemon[]ではない
		firstPokemon[0] = new Hitokage("ヒトカゲ", "炎");
		firstPokemon[1] = new Fushigidane("フシギダネ", "水");
		firstPokemon[2] = new Zenigame("ゼニガメ", "草");
	}

	public void cheackHakasePokemon() {
		System.out.println("");
		System.out.println("【博士の残りポケモン】\n" + firstPokemon[0].name + ","
	+ firstPokemon[1].name + "," + firstPokemon[2].name);
	}
}
