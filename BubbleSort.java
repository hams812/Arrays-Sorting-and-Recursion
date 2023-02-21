
import java.util.Arrays;

public class BubbleSort{
     
     
     public static void main(String[] args){
         int[]A= {2,0,-1,4,5};
         
         Stopwatch timer1 = new Stopwatch();
         bubbleSortDown(A);
         double time1 = timer1.elapsedTime();
         
         System.out.println("The sorted array is: "+Arrays.toString(A));
         System.out.println("(%.2f seconds)Time taken: "+ time1);
        }
    public static void bubbleSortUp(int A[]){
        for (int i = 0; i < A.length-1; i++){
            for (int j = 0; j < A.length-1-i; j++){
                if (A[j] > A[j+1]){ 
                    swap(A, j, j+1);
                }
            }
        }
    }
     public static void bubbleSortDown(int A[]){
        for (int i = 0; i < A.length; i++){
            boolean swapped=false;
            for (int j = A.length-1-i; j >0; j--){
                if (A[j] < A[j-1]){ 
                    swap(A, j, j-1);
                    swapped=true;
                }
            }
            if(swapped==false){
                return;
            }
        }
    }
//Leaves A in the same state, except that 
//the elements at the indices i and j are switched
public static void swap(int[] A, int i, int j){
    int temp = A[i];
    A[i] = A[j];
    A[j] = temp;
}
}
