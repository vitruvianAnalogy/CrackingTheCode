package recursion;

public class Q8_5 {
	
	/*As long as we have left, we can insert it
	 * We can only insert right if it is available and if there is a left opened
	 * for it*/
	/*This code will keep on working until all the combinations are not printed
	 * This seems odd. This is possible because*/
	public static void printCombinations(int left, int right, char[]str, int count){
		
		/*Right is smaller than left means we have one extra left. 
		 * We should not have no extra right */
		if(left<0 || right<left)
			return;
		
		/*If left and right are zero then we don't have any parenthesis to form
		 * so we will print what we have until now*/		
		if(left==0 && right==0)
			System.out.println(str);
		else{
			if(left>0){
				str[count] = '(';
				printCombinations(left-1,right,str,count+1);
			}
			if(right>left){
				str[count] = ')';
				printCombinations(left,right-1,str,count+1);
			}
		}		
	}
	
	public static void main(String[] args){
		char[] str = new char[6];
		printCombinations(3,3,str,0);
	}

}
