import java.util.*;

public class AngryProfessor {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		for(int i=0; i<N; i++) {
			
			int n = in.nextInt();
			int k = in.nextInt();
			
			int count = 0;
			int[] array = new int[n];
			
			for(int j=0; j<n; j++) {
				
				array[j] = in.nextInt();
				if(array[j] <= 0) {
					count++;
				}
				
			}
			
			if(count<k) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
			
		}
		
		in.close();
		
	}
	
}
