package model;

public final class SalleCinema
{
	private final  String film;
	public final int nbPlaces;
	private final double tarif;
	private int nbPlacesVendues;

	public SalleCinema (String film, int nbPlaces, double tarif)
	{
		this.film = film;
		this.nbPlaces = nbPlaces;
		this.tarif = tarif;
		this.nbPlacesVendues = 0;

	}

	public String getFilm()
	{
		return this.film; 
	}

	public double getTarif()
	{
		return this.tarif; 
	}

	public int getNbPlacesVendues()
	{
		return this.nbPlacesVendues; 
	}

	public int vendrePlaces()
	{
		this.nbPlacesVendues ++;
		return this.nbPlacesVendues;
	}

	public double tauxRemplissage()
	{
		double place = (double) this.nbPlaces;
		double vendues = (double) this.nbPlacesVendues;
		return vendues/place;
	}

	public double chiffreAffaires()
	{
		return this.nbPlacesVendues*tarif;
	}

	public boolean estPleine()
	{
		if (this.nbPlacesVendues == this.nbPlaces)
			return true;
		else 
			return false;
	}

	public int nbPlacesDisponibles()
	{
		return this.nbPlaces - this.nbPlacesVendues; 
	}

	@Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Film projeté \t\t : ").append(this.film).append("\n")
                .append("Tarif \t\t\t : ").append(this.tarif).append("\n")
                .append("Nombre de places \t : ").append(this.nbPlaces).append("\n")
                .append("Taux remplissage \t : ").append(this.tauxRemplissage()).append("\n")
                .append("Chiffre d’affaires \t : ").append(this.chiffreAffaires()).append("\n");
        return sb.toString(); //Retouner avec le .toString() car c'est un stringBuilder (ATTENTION !!)
    }
    

}