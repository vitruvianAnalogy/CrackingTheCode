package recursion;

public class Q8_8 {
	
	//Stores the col number where the queen is stored for a certain row.
	int[] columnForRow = new int[8];
	
	boolean check(int row){
		for(int i = 0; i< row; i++){
			int diff = Math.abs(columnForRow[i]-columnForRow[row]);
			if(diff==0 || diff == row - i)//Same col or same diagonal
			{
				return false;
			}
		}
		return true;
	}
	
	public void eightQueens(int row){
		if(row==8)
			System.out.println();
		for(int i =0 ; i<8;i++){
			columnForRow[row] = i;
			/*If matches the col or row or diagonal then false, 
			 * will try in next iteration, else try for next row*/
			if(check(row)){
				eightQueens(row+1);
			}
		}
	}
}
