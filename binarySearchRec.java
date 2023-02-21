
/**
 * Write a description of class binarySearchRec here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class binarySearchRec
{
    public static int binarySearch(int v, int[] array, int low, int high){ //low and high are indexes				 		
int middle = (low + high)/2; 		 		
if(high < low){ 			 
return -1; 		
}  		 		 		
if (v < array[middle]){ 			
return binarySearch(v, array, low, middle - 1); 	
} 		 		
if (v > array[middle]){ 			
return binarySearch(v, array, middle + 1, high); 	
} 		 		
if (v == array[middle]){ 			
return middle; 		
} 		 		
return -1; 	
}

}
