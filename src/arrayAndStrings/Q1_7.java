package arrayAndStrings;

public class Q1_7 {
	
	public static int[][] modifyMatrix(int[][]matrix){
		int[]rows = new int[matrix.length];
		int[]cols = new int[matrix[0].length];
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j]==0){
					rows[i]=1;
					cols[j]=1;
				}
			}
		}
		
		for(int i=0;i<rows.length;i++){
			for(int j=0;j<cols.length;j++){
				if(rows[i]==1 || cols[j]==1)
					matrix[i][j]=0;
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
		matrix[1][2]=0;
		System.out.println("Original Matrix");
		for(int i =0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}		
		matrix = modifyMatrix(matrix);
		System.out.println("Modified Matrix");
		for(int i =0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}		
		
	}

}
