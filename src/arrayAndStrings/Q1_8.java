package arrayAndStrings;

public class Q1_8 {
	
	/*We cannot implement this program without isSubstring
	 * but isRotation method is correct and that is all we need,
	 *  assuming we have isSubstring*/
	public static boolean isSubstring(String a, String b){
		//We don't have this method.
		return false;
	}
	
	public static boolean isRotation(String a, String b){
		
		String c = a+a;
		if(isSubstring(c,b))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args){
		String input = "waterbottle";
		String input2 = "erbottlewat";
		
		if(isRotation(input,input2))
			System.out.println("Yes");
		else
			System.out.println("Yes");
	}

}
