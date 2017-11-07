package model;

public final class Employe
{
	private final  String nom;
	public double salaireBase;
	private final double nbHeure;

	public Employe (String nom, double salaireBase, double nbHeure) // Faire une exception
	{
		this.nom = nom;
		try
		{
			if (salaireBase<=13 && nbHeure<=60) // Si ces conditions ne sont pas rempli il faut stopper le constructeur ! Possible ??
			{
				this.salaireBase= salaireBase;
				this.nbHeure = nbHeure;
			}
			else
			{
				if(salaireBase>13)
					System.out.println("ERROR : Salaire de base trop élevé (13€ max) !");
				if(nbHeure>60)
					System.out.println("ERROR : Nombre d'heure trop élevé (60h max) !");
			}
		}
		catch (){}
	}

	public String getNom()
	{
		return this.nom; 
	}

	public double getSalaireBase()
	{
		return this.salaireBase; 
	}

	public double getNbHeure()
	{
		return this.nbHeure; 
	}

	@Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Nom :\t\t\t\t").append(this.nom).append("\n")
          .append("Salaire horaire de base :\t").append(this.salaireBase).append(" €\n")
          .append("Nombre d'heure effectué :\t").append(this.nbHeure).append("\n")
          .append("Salaire hebdomadaire :\t\t").append(salaire()).append(" €\n");
        return sb.toString(); //Retouner avec le .toString() car c'est un stringBuilder (ATTENTION !!)
    }

    public double salaire ()
    {
    	if (nbHeure>40)
    	{
    		return ((40*salaireBase)+((nbHeure-40)*(1.5*salaireBase)));
    	}

    	return nbHeure*salaireBase;
    }
    

}