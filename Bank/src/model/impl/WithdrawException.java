public class RetraitException extends Exception
{
	private float amount;
	
	public RetraitException (float amount)
	{
		this.amount = amount;
	}
	
	public String toString ()
	{
		return super.toString() + "Erreur : Retrait impossible !" + this.amount;
	}
}