package metier;

import java.time.LocalDate;

public abstract class Console {

	protected String nom;
	protected Integer prix;
	protected LocalDate dateSortie;
	
	public Console(String nom, Integer prix, LocalDate dateSortie) {
		
		this.nom = nom;
		this.prix = prix;
		this.dateSortie = dateSortie;
	}

	public Integer getPrix() {
		return prix;
	}

	public void setPrix(Integer prix) {
		this.prix = prix;
	}

	public LocalDate getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(LocalDate dateSortie) {
		this.dateSortie = dateSortie;
	}

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Console [nom=" + nom + "]";
	}
	
	
}
