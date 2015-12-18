package arrayAndStrings;

public class Q1_1 {
	
	public static boolean isTotalUnique(String input){
		input = input.toUpperCase();
		int[] characters = new int[26];
		for(int i=0;i<input.length();i++){
			characters[input.charAt(i)-65]++;
		}
		for(int j=0;j<26;j++){
			if(characters[j]>1)
				return false;
		}
		return true;
	}
	
	public static boolean isTotalUniqueNoDS(String input){
		/*You have to create a bit vector. Put each element in its place
		 * in the bit vector. Turn each position to 1 if an element is encountered
		 * If the element is encountered for the second time then return false*/
		input = input.toUpperCase();
		int checker = 0;
		for(int i=0;i<input.length();i++){

			int val = input.charAt(i)-'A';
			/*See if checker and (1 left shifted alphabet times)*/
			if((checker & (1<<val)) > 0)
				return false;
			checker|=(1<<val);
		}
		return true;
	}
	
	public static void main(String[] args){
		String input = "Nishat";
		if(isTotalUnique(input))
			System.out.println("Unique");
		else
			System.out.println("Not Unique");
		
		if(isTotalUniqueNoDS(input))
			System.out.println("Unique");
		else
			System.out.println("Not Unique");
	}

}
