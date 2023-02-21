
/**
 * Write a description of class MergeSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class MergeSort
{
    public static void main(String[] args){
        int [] arr={8,2,6,11,7,10};
        int len = arr.length;
        mergeSort(arr,0,len-1);
        System.out.println("The sorted array is: "+Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr,int left, int right){//right is index, left is zero
    if (left < right){
      int mid = (left + right) / 2;
      mergeSort(arr,left,mid);
      mergeSort(arr,(mid + 1), right);
      combineArrays(arr,left, (mid + 1), right);
    }
}
  
public static void combineArrays(int[] arr,int left, int mid, int right){//right is index, left is zero
    int leftEnd = mid - 1;
    int index = left;
    int size = right - left + 1;
    int temp[]=new int[25];
    
    while ((left <= leftEnd) && (mid <= right)){
      if ( arr[left]<=arr[mid]){
        temp[index] = arr[left];
        index++;
        left++;
      }
      else{
        temp[index] = arr[mid];
        index++;
        mid++;
      }
    }
    
    while (left <= leftEnd){
      temp[index] = arr[left];
      index++;
      left++;
    }
    
    while (mid <= right){
      temp[index] = arr[mid];
      index++;
      mid++;
    }
    
    for (int i=0; i<size; i++){
      arr[right] = temp[right];
      right--;
    }  
      
  }


}
