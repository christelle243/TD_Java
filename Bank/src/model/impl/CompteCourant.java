package model.impl;

import java.util.UUID;
import java.lang.StringBuilder;

import model.dec.CompteManip;

/**
 * Modelsa check account.
 */
public final class CompteCourant extends Compte implements CompteManip
{
    public CompteCourant (String owner, double initalBalance)
    {
        super(owner, initalBalance);
    }

    public CompteCourant (String owner)
    {
        super(owner);
    }

    @Override
    public double withdraw(double amount)
    {
        double previous = this.getBalance();
        this.setBalance(previous - amount);
        return this.getBalance();
    }

    @Override
    public double deposit(double amount)
    {
        double previous = this.getBalance();
        this.setBalance(previous + amount);
        return this.getBalance();
    }

}
