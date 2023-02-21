
/**
 * Write a description of class SumOfOdds here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumOfOdds
{
    public static int sumOdd(int n){
	if(n == 0) {
	return 1;    
        }
        return ((2*n+1)+sumOdd(n-1));
}

}
