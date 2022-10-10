package test;

import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Console c1 = new Console("DS");
		Console c2 = new Console("PS2");
		Console c3 = new Console("SWITCH");
		Console c4 = new Console("XBOX");
		Console c5 = new Console("PSP");
		
		Jeu j1 = new Jeu("Pokemon" , c1);
		Jeu j2 = new Jeu("God of War", c2);
		Jeu j3 = new Jeu("The Legend of Zelda", c3);
		Jeu j4 = new Jeu("Horizon", c4);
		Jeu j5 = new Jeu("Forza Horizon", c5);
		
	}

}
