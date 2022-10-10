package test;

import metier.Console;
import metier.Hybride;
import metier.Jeu;
import metier.Portable;
import metier.Salon;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Portable c1 = new Portable("DS");
		Salon c2 = new Salon("PS2");
		Hybride c3 = new Hybride("SWITCH");
		Salon c4 = new Salon("XBOX");
		Portable c5 = new Portable("PSP");
		
		Jeu j1 = new Jeu("Pokemon" , c1);
		Jeu j2 = new Jeu("God of War", c2);
		Jeu j3 = new Jeu("The Legend of Zelda", c3);
		Jeu j4 = new Jeu("Horizon", c4);
		Jeu j5 = new Jeu("Forza Horizon", c5);
		
		Client c1= new Client("Meriem","Rochdi");
		Client c2= new Client("Catherine", "Rousseau");
		
		
		
		
		
	}

}
