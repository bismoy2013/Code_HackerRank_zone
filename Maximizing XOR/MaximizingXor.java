import java.util.*;


public class MaximizingXor {
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b= in.nextInt();
		
		int max = Integer.MIN_VALUE;
		
		for(int i=a; i<=b; i++) {
			
			for(int j=i; j<=b; j++) {
				
				int num = i ^ j ;
				
				if(num > max) {
					
					max = num;
					
				}
				
			}
			
		}
		
		System.out.println(max);
		
		in.close();
	}

}
