//https://www.hackerrank.com/challenges/find-digits

import java.util.Scanner;


public class FindDigits {
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		long N = in.nextLong();
		
		//in.nextLine();
		
		while(N>0) {
			
			//System.out.prlongln(N);
			
			long number = in.nextLong();
			
			//System.out.prlongln("Number: "+number);
			long count = 0;
			long climax = number ;
			
			//System.out.prlongln("Climax: "+climax);
			
			while(number > 0) {
				
				if(number%10 !=0) {
			
					if(climax%(number%10) == 0) {
						
						count ++;
				
			}
				}
				
				number/=10;
				
			}
			
			System.out.println(count);
			
			N--;
		}
		
		in.close();
		
	}

}
