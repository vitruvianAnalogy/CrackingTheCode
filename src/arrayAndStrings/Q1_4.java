package arrayAndStrings;

public class Q1_4 {
	
	public static boolean isAnagram(String a, String b){
		
		if(a.length()!=b.length())
			return false;
		
		a = a.toUpperCase();
		b = b.toUpperCase();
		int[] characters = new int[26];
		for(int i=0; i<a.length(); i++){
			characters[a.charAt(i)-65]++;
		}
		for(int i=0; i<b.length(); i++){
			characters[b.charAt(i)-65]--;
		}
		
		for(int i=0; i<b.length(); i++){
			if(characters[i]!=0)
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args){
		String input = "aaabbb";
		String input2 = "bababa";
		System.out.println(isAnagram(input,input2));
		
	}

}
