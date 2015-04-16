import java.util.*;

public class TheLoveLetterMystery {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		in.nextLine();
		
		for(int i=0; i<N; i++) {
		
		String s = in.nextLine();
		
		int i1 = 0;
		int j = s.length()-1;
		int count = 0;
		
		if(s.length()/2 != 0) {
			
			while(i1 < j) {
				
				count += Math.abs( s.charAt(i1) - s.charAt(j) );
				
				i1++;
				j--;
			}
			
		} else if (s.length()/2 == 0) {
			
				while(i1 <= j) {
				
				count += Math.abs( s.charAt(i1) - s.charAt(j) );
				
				i1++;
				j--;
			}
			
		}
		
		System.out.println(count);
		
		}
		
		in.close();
		
		
	}
	
	
}
