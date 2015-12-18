package arrayAndStrings;

public class Q1_6 {
	
	public static int[][] rotate(int[][] matrix, int n){
		int levels = n/2;
		for(int i=0; i<levels;i++){
			int last = n - 1 - i;
			for(int j=i; j<last ; j++){
				int top = matrix[i][j];
				
				/*Left to top*/
				matrix[i][j] = matrix[last-j+i][i];
				
				/*Bottom to left*/
				matrix[last-j+i][i]=matrix[last][last-j+i];
				
				/*Right to bottom*/
				matrix[last][last-j+i]=matrix[j][last];
				
				/*Top to right*/				
				matrix[j][last]= top;											
				
			}
		}
		return matrix;
	}
	
	
	public static void main(String[] args){
		int count = 1;
		int[][] matrix = new int[5][5];
		for(int i =0;i<5;i++){
			for(int j=0;j<5;j++){
				matrix[i][j] = count;
				count++;
			}
		}
		System.out.println("Original matrix");
		for(int i =0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		matrix = rotate(matrix,5);
		
		System.out.println("Rotated matrix");
		for(int i =0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	
}
