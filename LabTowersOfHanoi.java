
/**
 * Write a description of class LabTowersOfHanoi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class LabTowersOfHanoi{
    public static void main(String[] args){
       Scanner keys = new Scanner(System.in);
       System.out.println("How many disks?");
       int disks = keys.nextInt();
       hanoiSolve(disks);
   }
   
   public static void hanoiSolve(int n)
   {
       hanoiSolve(n, 1, 3, 2);
   }
   
   public static void hanoiSolve(int n, int start, int end, int temp){
       if(n == 1){
            System.out.println(". "+"Move disk from tower   " + start + " to tower   " + end + ".");
            return;
       }
       hanoiSolve(n-1, start, temp, end);
       
       System.out.println(". "+"Move disk from tower   " + start + " to tower   " + end + ".");
       hanoiSolve(n-1, temp, end, start);
   }
   
   
}

