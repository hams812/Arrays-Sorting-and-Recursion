
/**
 * Write a description of class InsertionSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class InsertionSort
{
   public static void main(String[] args){
         int[]A= {2,0,-1,4,5};
         
         Stopwatch timer1 = new Stopwatch();
         InsertionSort(A);//method that we have written below
         double time1 = timer1.elapsedTime();
         
         System.out.println("The sorted array is: "+Arrays.toString(A));
         System.out.println("(%.2f seconds)Time taken: "+ time1);
    }
    public static void InsertionSort(int A[])
    {
         for (int i = 1; i < A.length; i++){
             int j=i-1;
            while(j>=0 && A[j]>A[j+1]){
                  swap(A, j, j+1);
                  j=j-1;
            }
        }
    }
    public static void swap(int[] A, int i, int j){
    int temp = A[i];
    A[i] = A[j];
    A[j] = temp;
    }
    }

