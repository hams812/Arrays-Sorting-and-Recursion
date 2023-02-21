public class RecursionLesson{
    
    public static void main(String[] args){
        //doThis(16);
       // multiply(12,3);
        //mystery(3);
        System.out.println("The final value is: "+foo(10));
    }
public static void doThis(int n){
    System.out.println(n);
    if(n > 0){
        doThis(n / 2);
    }
}

public static int multiplyImprov2(int n, int m){
    if(n == 0){   
            return 0;
    }
     return ( m+  multiplyImprov2(n-1,m));
}

public static void mystery(int n) {
if (n > 0) {
                //System.out.println(n);
        mystery(n-1);
        System.out.println(n);
    }
}
public static int foo(int n)
    {
        if (n < 10){
            return 1;
        }
        else{
          return 1 + foo(n/10);
        }
            
    }
    public static int mystery2nd(int [] A, int n){
        if(n==0){
            return A[0];
        }
        else return (A[n-1]*mystery2nd(A,n-1));
    }
    
    public static void stuff(int j, int k){
        if(j!=k){
         stuff(j+1,k);  
          System.out.println(j+" "+k);
        }
    }
    public static void stuff2(int j, int k){
        if(j!=k){
         System.out.println(j+" "+k);
         stuff2(j+1,k);  
        }
    }
}
