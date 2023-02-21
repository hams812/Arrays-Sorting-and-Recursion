
/**
 * Write a description of class maxInAnArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class maxInAnArray
{
    public static int max(int[]A){
        int max=A[0];
            for(int i=0;i<A.length;i++){
                    max=Math.max(A[i],max);
            }
        return max;    
    }
    public static int maxRec(int[]A,int n){
        if(n==1){
            return A[0];
        }
        
        return Math.max(A[n-1],maxRec(A,n-1));    
    }
    
}
