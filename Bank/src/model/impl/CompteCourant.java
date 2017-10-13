package model.impl;

import java.util.UUID;
import java.lang.StringBuilder;

import model.dec.CompteManip;

/**
 * Modelsa check account.
 */
public final class CompteCourant extends Compte implements CompteManip
{
    private float ceiling;
    
    public CompteCourant (String owner, double initalBalance)
    {
        super(owner, initalBalance);
        System.out.println ("Plafond automatique : 100€");
        this.ceiling =  100f;
    }

    public CompteCourant (String owner, double initalBalance, float ceiling)
    {
        super(owner, initalBalance);
        this.ceiling =  ceiling;
    }

    public CompteCourant (String owner)
    {
        super(owner);
        System.out.println ("Plafond automatique : 100€");
        this.ceiling =  100f;
    }

    public CompteCourant (String owner, float ceiling)
    {
        super(owner);
        this.ceiling =  ceiling;
    }

    @Override
    public double withdraw(double amount)
    { 
        if (this.getBalance()-amount < this.ceiling)
        {
            System.out.println ("Erreur : Retrait impossible, plafond de découvert dépassé !");
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

}
