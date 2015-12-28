package recursion;

public class Q8_6 {
	
	enum Color{
		RED, GREEN, YELLOW, BLUE, BLACK, WHITE
	}
	/*To fill  the adjacent area we need the coordinates x and y of the point
	 * that we are trying to color*/
	public static boolean fill(Color[][] matrix, int x, int y, Color oColor, Color mColor){
		if(x<0 || x>=matrix.length || y<0 || y>=matrix[0].length){
			return false;
		}
		
		if(matrix[x][y]==oColor ){
			matrix[x][y]=mColor;
			fill(matrix,x-1,y,oColor,mColor);
			fill(matrix,x,y-1,oColor,mColor);
			fill(matrix,x+1,y,oColor,mColor);
			fill(matrix,x,y+1,oColor,mColor);
		}
		return true;
	}

}
