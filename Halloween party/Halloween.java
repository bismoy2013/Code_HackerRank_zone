
import java.util.*;
 
public class Halloween {
	
   private static long halloweenParty(long n){
       if(n%2 ==0)
           return (n/2)*(n/2);
       return (n/2)*(n/2+1);
   }
 
   public static void main(String[] args) {
   
	   Scanner in = new Scanner(System.in);
       int N = in.nextInt();
       for(int i = 0;i < N;i++){
         long n = in.nextInt();
         System.out.println(halloweenParty(n));
       
       }
 

     in.close();
   }
}
