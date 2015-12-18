package treesAndGraphs;
/*Create a binary tree with minimal height*/

/*This means we need to have equal elements on both sides. Something like
 * a binary search tree. So we can have smaller elements on the left and larger
 * elements on the right and keep on doing it for the subtrees*/
public class Q4_3 {
	
	public static void makeTree(int[] array){
		int middle = array.length/2;
		int left = 0;		
		int right = array.length;
		Node parent = new Node(array[middle]);
		parent.left = makeSubtreeTree(array,left,middle);
		parent.right = makeSubtreeTree(array,middle,right);
		
	}
	
	public static Node makeSubtreeTree(int[] array,int left, int right){
		
		//Recursion ending condition : Base condition if you will
		if(right<left)
			return null;
		int middle = (left+right)/2;
		Node parent = new Node(array[middle]);
		parent.left = makeSubtreeTree(array,left,middle);
		parent.right = makeSubtreeTree(array,middle,right);
		return parent;
	}
	
	public static void main(String[] args){
		
	}
}
