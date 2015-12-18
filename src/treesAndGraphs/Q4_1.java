package treesAndGraphs;


/*No BFS required*/
public class Q4_1 {
	
	public static int minLength(Node root){
		if(root == null)
			return 0;
		else
			return 1 + Math.min(minLength(root.left), minLength(root.right));
	}
	
	public static int maxLength(Node root){
		if(root == null)
			return 0;
		else
			return 1 + Math.max(maxLength(root.left), maxLength(root.right));
	}
	
	public static void isBalanced(Node root){		
		if((maxLength(root)-minLength(root))>1)
			System.out.println("No");
		else
			System.out.println("Yes");
		
	}
	
	public static void main(String[] args){
		Node n = new Node(2);
		isBalanced(n);
		
	}

}
