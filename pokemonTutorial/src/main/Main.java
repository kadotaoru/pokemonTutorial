package main;

import human.Hakase;
import human.Me;
import human.Rival;

public class Main {

	public static void main(String[] args) {
		Me me = new Me();
		Rival rv = new Rival();
		Hakase dr = new Hakase("オーキド博士");

		System.out.println("╰( ^o^)╮_=͟͟͞͞◒ ポケモンゲットだぜ！\r\n" +
				"");
		//主人公の名前入力
		me.decideMyName();
		//ライバルの名前入力
		rv.decideRivalName();
		//主人公の最初のポケモンを選ぶ＆選んだ番号（数字）をxへ代入
		int x = me.selectPokemon(dr.firstPokemon);
		//ライバルの最初のポケモンが決まる
		rv.selectRivalPokemon(dr.firstPokemon, x);
		//博士の残りのポケモンを確認（3匹ともいる
		dr.cheackHakasePokemon();
		//ライバルのポケモンの確認
		rv.selectRivalPokemonTalk();

		//謎にトサキント召喚！
		me.tosakinto();

	}

}
