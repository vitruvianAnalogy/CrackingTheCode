package recursion;
import java.io.*;
import java.util.ArrayList;

/**
 * @author Nishant
 * Generate permutations of a string
 * O(n!) since there are n! permutations
 */
public class Q8_4 {

	public static ArrayList<String> getPermutations(String s){
		ArrayList<String> permutations = new ArrayList<String>();
		if(s==null){
			return null;
		}
		else if(s.length()==0)
		{
			permutations.add("");
			return permutations;
		}
		char current = s.charAt(0);
		ArrayList<String> smallerSet = getPermutations(s.substring(1));
		for(String str : smallerSet){
			for(int j = 0; j<=str.length();j++){
				permutations.add(str.substring(0,j)+current+str.substring(j));
				/*Above statement looks as if it will skip the case where
				 * char current has to be added to the front of the string
				 * but in reality it will add it. To understand that case, 
				 * ponder over what will happen if j = 0 and how substring
				 * works*/
			}
		}
		return permutations;
	}
}
