package main;

import model.SalleCinema;

public final class Main
{
    public static void main (String[] args)
    {
    	SalleCinema sc = new SalleCinema("Hercule", 1000, 7.50);
    	System.out.println(sc);
    	sc.vendrePlaces();
    	sc.vendrePlaces();
    	sc.vendrePlaces();
    	System.out.println("Nb places vendues : "+ sc.getNbPlacesVendues() );
    	System.out.println("La salle est pleine : "+ sc.estPleine());
    	System.out.println("Nombres de place dispo : "+ sc.nbPlacesDisponibles());
    	System.out.println("\n");
    	System.out.println(sc);
    	
    }
}