package treesAndGraphs;

class BSTNode{
	int value;
	BSTNode parent;
	BSTNode left;
	BSTNode right;
}
public class Q4_5 {
	
	public BSTNode inorder(BSTNode node){
		return node;
	}
	
	public BSTNode returnNextNode(BSTNode node){
		
		if(node == null){
			return null;
		}
		if(node.right==null)
			return node.parent;
		
		while(node.right!=null){
			inorder(node);
		}

			
		return node;
	}

}
