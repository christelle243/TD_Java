package model.fact;

import model.dec.CompteManip;
import model.impl.*;

public final class CompteFactory
{
	public CompteManip createCompteCourant(String owner)
	{
		return new CompteCourant(owner);
	}

	public CompteManip createCompteEpargne(String owner, float interestRates)
	{
		return new CompteEpargne(owner, interestRates);
	}
}