
/**
 * Write a description of class fibonacci here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class fibonacci
{
    public static int Fib(int term){
        int low=0;
        int high=1;
        int temp=0;
        for(int i=2;i<term;i++){
            temp = low + high;
            low=high;
            high=temp;
        }
        return temp;
    }
     public static int FibRec(int term){
        if (term==1){
            return 0;
        }
         if(term==2){
            return 1;
        }
        return FibRec(term-1)+FibRec(term-2);
     }
}
