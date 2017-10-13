package model.fact;

import model.dec.CompteManip;
import model.impl.*;
import model.exceptions.*;

public final class CompteFactory
{
	public CompteManip createCompteCourant(String owner)
	{
		return new CompteCourant(owner);
	}

	public CompteManip createCompteCourant(String owner, float ceiling)
	{
		return new CompteCourant(owner, ceiling);
	}

	public CompteManip createCompteEpargne(String owner, float interestRates) throws InterestRatesException
	{
		return new CompteEpargne(owner, interestRates) ;
	}

	public CompteManip createCompteEpargne(String owner, float interestRates, float ceiling) throws InterestRatesException
	{
		return new CompteEpargne(owner, interestRates, ceiling);
	}
}