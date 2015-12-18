package arrayAndStrings;

/*Replace all strings with %20*/
public class Q1_5 {
	
	public static String replaceString(String input){
		input = input.replaceAll(" ", "%20");
		return input;
	}
	
	public static void main(String[] args){
		String input = "a aab   bb";
		input = replaceString(input);
		System.out.println(input);
	}

}
