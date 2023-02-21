
/**
 * Write a description of class printCharArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class printCharArray
{
    public static void print(char[] B){
        for(int i=0;i<B.length;i++){
            System.out.println(B[i]);
        } 
    }
    
    public static void printRec(char[] B, int Start_idx){
        if(Start_idx==B.length){
            return;
        }
      
        printRec(B,Start_idx+1);  
          System.out.println(B[Start_idx]);
    }
}
