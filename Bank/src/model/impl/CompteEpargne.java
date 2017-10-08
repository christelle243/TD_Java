package model.impl;

import model.dec.CompteManip;

public final class CompteEpargne extends Compte implements CompteManip
{
	private final float interestRates;

	public CompteEpargne (String owner, double initalBalance, float interestRates)
    {
        super(owner, initalBalance);
        if (interestRates > 0)
        {
        	 this.interestRates = interestRates;
        }
        else
        {
        	System.out.println ("Erreur : Taux d'interêt nul ou négatif (interet par defaut : 1% ) !");
            this.interestRates = 1;
        }
    }

    public CompteEpargne (String owner, float interestRates)
    {
    	super(owner);
    	if (interestRates > 0)
        {
        	 this.interestRates = interestRates;
        }
        else
        {
        	System.out.println ("Erreur : Taux d'interêt nul ou négatif  (interet par defaut : 1% ) !");
            this.interestRates = 1;
        }
    }

    public float getInterestRates ()
    {
        return this.interestRates;
    }

    public double withdraw(double amount)
    {
        if (this.getBalance()<= 50)
        {
            System.out.println ("Erreur : Retrait impossible, solde insuffisant !");
        }
        else
        {
            double previous = this.getBalance();
            this.setBalance(previous - amount);
            return this.getBalance();
        }
        return 0d;
    }

    @Override
    public double deposit(double amount)
    {
        double previous = this.getBalance();
        this.setBalance(previous + amount);
        return this.getBalance();
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\nInterêt d'épargne : ").append(this.interestRates).append("%\n");
        return sb.toString(); //Retouner avec le .toString() car c'est un stringBuilder (ATTENTION !!)
    }
}