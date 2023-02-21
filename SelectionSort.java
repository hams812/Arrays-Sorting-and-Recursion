import java.util.Arrays;

public class SelectionSort{
     
     
    public static void main(String[] args){
         int[]A= {2,0,-1,4,5};
         
         Stopwatch timer1 = new Stopwatch();
         sortFromEnd(A);//method that we have written below
         double time1 = timer1.elapsedTime();
         
         System.out.println("The sorted array is: "+Arrays.toString(A));
         System.out.println("(%.2f seconds)Time taken: "+ time1);
    }
    public static void sortFromBeginning(int[] A){
    for(int i=0; i<A.length; i++){
        int min_index = findMinIndex(A, i);//calling the method below
        swap(A, i, min_index);//again calling the method below
    }
    }
//returns the index of the smallest value of A from index s
//to the end of the array
public static int findMinIndex(int[] A, int start_index){
        int min_index;
    min_index = start_index;
    for(int i= start_index; i<A.length; i++){
        if(A[min_index]>A[i]){
            min_index = i;
        }
    }
    return min_index;
}

 public static void sortFromEnd(int[] A){
    for(int i=A.length-1; i>=0; i--){
        int max_index = findMaxIndex(A, i);//calling the method below
        swap(A, i, max_index);//again calling the method below
    }
    }
public static int findMaxIndex(int[] A, int end_index){
        int max_index;
    max_index = end_index;
    for(int i= end_index; i>=0; i--){
        if(A[max_index]<A[i]){
            max_index = i;
        }
    }
    return max_index;
}
//Leaves A in the same state, except that 
//the elements at the indices i and j are switched
public static void swap(int[] A, int i, int j){
    int temp = A[i];
    A[i] = A[j];
    A[j] = temp;
}
}