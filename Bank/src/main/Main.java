package main;

import model.dec.CompteManip;
import model.fact.CompteFactory;

public final class Main
{
    public static void main (String[] args)
    {
        try
        {
            CompteFactory cf = new CompteFactory();
        
            /*CompteManip c1 = cf.createCompteCourant("John Doe", 50);
            CompteManip c2 = cf.createCompteCourant("Jack Bauer");

            c1.deposit(100.0d);
            double retrait = c1.withdraw(900.0d);
            double newSolde = c2.deposit(100000.0d);

            System.out.println(c1);
            System.out.println(c2);*/

            CompteManip c1 = cf.createCompteEpargne("John Doe", -0.6f);
            System.out.println(c1);
            c1.deposit(100.0d);
            System.out.println(c1);
            c1.withdraw(55.0d);
            System.out.println(c1);
        }
    	catch (Exception e)
        {
            System.out.println(e);
        }

    }
}