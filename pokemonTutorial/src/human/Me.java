package human;

import pokemon.Pokemon;

public class Me extends Human {
	Pokemon[] myPokemon;

	public Me(){
		myPokemon = new Pokemon[6];
	}

	public void decideMyName() {
		System.out.println("【あなたの名前は？】");
		String enterMyName = new java.util.Scanner(System.in).nextLine();
		name = enterMyName;
	}

	public int selectPokemon(Pokemon[] p) {
		System.out.println("【好きなポケモンの番号を入力してね】\n"
				+ "1: フシギダネ\n"
				+ "2: ゼニガメ\n"
				+ "3: ヒトカゲ");
		int selectFirstPokemon = new java.util.Scanner(System.in).nextInt();
		switch (selectFirstPokemon) {
		case 1:
			myPokemon[0] = p[1];
			System.out.println(this.name + "は" + myPokemon[0].name + "に決めた！");
			break;
		case 2:
			myPokemon[0] = p[2];
			System.out.println(this.name + "は" + myPokemon[0].name + "に決めた！");
			break;
		case 3:
			myPokemon[0] = p[0];
			System.out.println(this.name + "は" + myPokemon[0].name + "に決めた！");
			break;
		default:
			System.out.println("オーキド博士:\n"
					+ "「" + this.name + "よ、さらばだ...」\n"
					+ "GAME OVER");
			break;
		}
		return selectFirstPokemon;

	}

	public void tosakinto() {
		System.out.println("\n\n\n");
		System.out.println(" 　　　　　　　　　　　　, イ´￣｀ヽ\r\n" +
				"　　　　　　　　　 　 　 ／　 | 　 　 _j\r\n" +
				"　　　　　　　　　　　　f′　　|　　,（_{\r\n" +
				"　　　　　　　 　 _　　 ｝　　......　j′｀ヽ\r\n" +
				"　　　　　　 ＿,r'´ ｀ヽ L, .::::/::::::.　　　j\r\n" +
				"　　　　　　f´　, - ､_ノ￣｀ヽ:|:::::::::::　,f'´\r\n" +
				"　　 　 _　　Ｌ.l 　,.-::‐::::‐::::､!::;/::::;r_'_r─ 、\r\n" +
				"　　､　 | ＼,｣ _,f´:::::::::::::::::　 ｀ヽ:::´::::::._,r　´＼\r\n" +
				"　   | ＼'､　 ＼:::::::::: 　　　　　 　l:─:-:､::::..　 ｀ヽ\r\n" +
				"  ／　　/|ヽ　 ﾉ 　 , -- 、　　　　ト ､::::::｀ヽ::.　 ｛\r\n" +
				"｛　 　 {. l! ｀\"′　Ｌ.ィ＾l　　､..ノ......二｀ヽ._　　 ｝\r\n" +
				"　｀ト　 ゞ、　＿　 ヽ二.ノ　 _::::::::　 、　｀ヽ ｀ｰ ′\r\n" +
				"　 └ ´￣Y´＿｀ヽ　　　　_,ｨ＾ヽ、　,ゝ　f~\r\n" +
				"　　　　　 ｀ ｰ─┴一　´　Ｌ._　 Y_ー ´\r\n" +
				"  　　　　　　　　　　　　　　　　｀ー ′\r\n" +
				"");
	}
}
