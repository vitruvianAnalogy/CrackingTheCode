package arrayAndStrings;

/*Remove duplicate characters*/
public class Q1_3 {
	
	public static String removeDuplicates(String input){
		for(int i = 0; i<input.length(); i++){
			for(int j = 0; j<input.length();j++){
				if(input.charAt(i)==input.charAt(j) && i!=j)
					input = input.substring(0,j)+input.substring(j+1);
			}
		}
		return input; 
	}
	
	/*Test Cases
	 * 1. No duplicates
	 * 2. Randomly spread duplicates
	 * 3. Continuous duplicates
	 * 4. Null String*/
	
	public static void main(String[] args){
		String input = "aaabbb";
		input = removeDuplicates(input);
		System.out.println(input);
	}

}
