
public class SpiralMatrix {
	
	private static void Sizer (int[][] mat) {
		
		if(mat==null) {
			System.out.println("Null");
		
		} else {
		
		int row = 0;
		
		while(row < mat.length) {
			
			
			if(row % 2 == 0) {
				int col = 0;
			while(col < mat[0].length) {
				System.out.print(mat[row][col]+" ");
				col++;
			} 
			}
			
			if(row % 2 == 1) {
				int col = mat[0].length-1;
			while(col >= 0) {
				System.out.print(mat[row][col]+" ");
				col--;
			} 
			}
			
			row++;
			
		}
		}
	}
	
	public static void main(String args[]) {
		
		int[][] mat = {  {1,2,3,10},
				         {4,5,6,11},
				         {7,8,9,12} ,
				         {30,40,50,60}
				      };
		Sizer(mat);
		
	}

}
