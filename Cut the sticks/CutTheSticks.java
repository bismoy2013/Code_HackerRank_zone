import java.util.*;


public class CutTheSticks {
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] array = new int[N];
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<N; i++) {
			
			array[i] = in.nextInt();
			
			if(array[i] < min) {
				min = array[i];
			}
			
		}
		
		int size = N;
		
		System.out.println(size);
		
		while(size > 0) {
			
			int newMin = min ;
		    min = Integer.MAX_VALUE;
			
			for(int i=0; i<N; i++) {
				
				if(array[i] > 0) {
				
					array[i] -= newMin;
				
				}
				
				if(array[i] < min && array[i] > 0) {
					min = array[i] ;
				}
				
				if(array[i] == 0) {
					size -- ;
					array[i] = -1;
				}
				
			}
			
			if(size != 0) {
			System.out.println(size);
			}
			
		}
		
		in.close();
		
		
	}

}
