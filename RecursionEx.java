
/**
 * Write a description of class RecursionEx here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RecursionEx
{
    public static int mysteryAdd(int n, int m)
{
    if (n == 0)
        return m;
    else
        return 1 + mysteryAdd (n-1,m);
}
public static int mysteryAddArray(int[] A, int idx) //idx always zero
{
    if (idx == A.length-1)
        return A[idx];
    else
               return A[idx]+ mysteryAddArray(A,idx+1);
}
public static void mystery(int a)
	{
		int b = a /2;
		int c = a % 2;
		if (b > 0)
			mystery(b);
		System.out.print(c);
	}
public static int exp(int n,int e)
	{
		 if(e<=0){
	        return 1;
                 }
     return n*exp(n,e-1);
         }
public static boolean isPrimeRec(int n,int i) // i should equal 2
	{
	    if(n<=2){
	        return (n==2);
            }
	    if(n%i==0){
	        return false;
            }
            if(i*i>n){
                return true;
            }
            return isPrimeRec(n,i+1);
         }
         public static boolean isPrime(int userNum) {
             boolean isPrime=true;
         if(userNum == 2) {
			isPrime= true;
		}
    	else if(userNum == 1 || userNum % 2 == 0) {
			isPrime= false;
		} 
        else{
			for(int i = 3; i <= Math.sqrt(userNum); i += 2) {
				if(userNum % i == 0) {
			isPrime= false;
				}
			}
		}
		return isPrime;
}
}
	
	
