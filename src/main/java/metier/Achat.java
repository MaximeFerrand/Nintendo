package metier;

import java.time.LocalDate;

public class Achat {
	
	private Jeu game;
	private LocalDate date;
	private int prix;
	
	@Override
	public String toString() {
		return "Achat [game=" + game + ", date=" + date + ", prix=" + prix + "]";
	}

	public Jeu getGame() {
		return game;
	}

	public LocalDate getDate() {
		return date;
	}


	public int getPrix() {
		return prix;
	}

	public void setGame(Jeu game) {
		this.game = game;
	}



	public void setDate(LocalDate date) {
		this.date = date;
	}



	public void setPrix(int prix) {
		this.prix = prix;
	}



	public Achat(Jeu game, LocalDate date, int prix) {
		super();
		this.game = game;
		this.date = date;
		this.prix = prix;
	}
	
	
	

}
