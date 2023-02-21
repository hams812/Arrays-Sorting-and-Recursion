
/**
 * Write a description of class SumOfDigits here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumOfDigits
{
   public static int sumDigits(int n)
	{
		if (n<10)
			return n;
		return ( (n%10) + sumDigits (n/10) );
}

}
