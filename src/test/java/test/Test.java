package test;

import metier.Boutique;
import metier.Client;
import metier.Console;
import metier.Hybride;
import metier.Jeu;
import metier.Portable;
import metier.Salon;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Portable c1 = new Portable("DS", null, null);
		Salon c2 = new Salon("PS2", null, null);
		Hybride c3 = new Hybride("SWITCH", null, null);
		Salon c4 = new Salon("XBOX", null, null);
		Portable c5 = new Portable("PSP", null, null);

		Boutique boutique =new Boutique("shop","35 rue de roches");
		Jeu j1 = new Jeu("Pokemon" , c1,boutique);
		Jeu j2 = new Jeu("God of War", c2, boutique);
		Jeu j3 = new Jeu("The Legend of Zelda", c3, boutique);
		Jeu j4 = new Jeu("Horizon", c4, boutique);
		Jeu j5 = new Jeu("Forza Horizon", c5, boutique);
		
		
		Client cl1= new Client("Meriem","Rochdi");
		Client cl2= new Client("Catherine", "Rousseau");
		
		
		
		
		
	}

}
