package recursion;
import java.util.*;
/*Find all the subsets of a test
 *Every element has the choice to be in a set or not
 *i.e. 2 choices....For n elements 2 choices mean the time complexity cannot
 *get better than 2*2*2*2*....n times
 *Therefore the fastest time for it to be is 2^n */
public class Q8_3 {

	//To find the subsets we can find subset of a smaller set and so forth. 
	//Therefore we need to keep going down the recursion stack to find the smallest
	//sets and so on
	
	/*This is how it'll work. Divide a set S into S[0] and S[1...n].
	 *Compute subsets of S[1...n] by dividing it further to S[1] and S[2...n]
	 *Compute subsets of S[2...n] by dividing it further to S[2] and S[3...n]
	 *and on and on  */
	public ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int index){
		ArrayList<ArrayList<Integer>> allSubsets;
		
		/*If the index reaches the last element in the "SET" then we create
		 * allSubSets*/
		if(set.size()==index){
			allSubsets = new ArrayList<ArrayList<Integer>>();
			allSubsets.add(new ArrayList<Integer>());
		}
		else /*If the index hasn't reached the Last element, i.e. then we will send it
		even more below and do operations on the allSubsets that is returned
*/		{
			//We get the subsets we get for the smaller subset
			allSubsets = getSubsets(set,index+1);
			//We find what is the item on our index
			int item = set.get(index);
			
			//Create a list of subsets at our level
			ArrayList<ArrayList<Integer>> moreSubsets = new ArrayList<ArrayList<Integer>>();
			
			/*Find all the subsets coming from the level below*/
			for(ArrayList<Integer> subset : allSubsets){
				/*Create a new subset that will have the element at the current level
				 * added to the each subset(hence the loop) we are getting from the 
				 * level below*/
				ArrayList<Integer> newSubset = new ArrayList<Integer>();
				newSubset.addAll(subset);
				newSubset.add(item);
				//We make a list of our subsets
				moreSubsets.add(newSubset);
			}
			/*This will make sure that we add the list of subsets created at
			 * each level to the biggest list out there. That we way will
			 * add the subsets that doesn't contain a certain element
			 * and above levels, where it does contain a certain element
			 * which fulfills our basic idea*/
			allSubsets.addAll(moreSubsets);
		}
		
		return allSubsets;
	}
}
