package treesAndGraphs;
import java.util.*;

/*Run Time Complexity : nlogn
 *Space Complexity : nlogn*/

class B48Node{
	int data;
	B48Node left;
	B48Node right;
}

public class Q4_8 {
	
	public static void findSum(B48Node root, int sum, ArrayList<Integer> buffer, int level){
		/*No tree, hence no path*/
		if(root==null)
			return;
		
		int temp = sum;
		//Add the value of the first node i.e. root into the array list
		/*Each level in the buffer holds the sum of paths starting from that level
		 * Therefore level 1 means that buffer(1) has sum of path starting from
		 * root of the Tree*/
		buffer.add(root.data);
		
		/*We will start from the root of the tree. This level will keep on
		 * increasing with each depth*/
		for(int i = level; i>= 1; i--){
			//Subtract the element we got at i level
			temp -= buffer.get(i);
			if(temp==0){
				print(buffer,i,level);
			}
		}
		
		ArrayList<Integer> c1 = (ArrayList<Integer>)buffer.clone();
		ArrayList<Integer> c2 = (ArrayList<Integer>)buffer.clone();
		findSum(root.left,sum,c1,level+1);
		findSum(root.right,sum,c2,level+1);
	}
	
	/**
	 * @param buffer - contains the nodes which are in the required path
	 * @param level - upper half of buffer, where path starts
	 * @param i2 - lower half of buffer, where path ends
	 */
	public static void print(ArrayList<Integer>buffer, int level, int i2){
		for(int i = level ; i<= i2;i++){
			System.out.print(buffer.get(i)+" ");
		}
		System.out.println();
	}

}
