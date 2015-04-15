import java.util.*;
public class LonelyInteger {
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int N = in.nextInt();
		
		for(int i=0; i<N; i++) {
			
			int n = in.nextInt();
			if(map.containsKey(n)) {
				
				map.put(n, map.get(n)+1);
				
			} else {
				
				map.put(n, 1);
				
			}
			
		}
		
		
		for(Integer j : map.keySet()) {
			
			if(map.get(j) == 1)
			{
				System.out.println(j);
			}
			
		}
		
		
		in.close();
		
	}

}
