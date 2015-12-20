package treesAndGraphs;

class BSTNode{
	int value;
	BSTNode parent;
	BSTNode left;
	BSTNode right;
}
public class Q4_5 {
	
	public BSTNode inorder(BSTNode node){
		if(node.left==null)
			return node;
		else
			return inorder(node.left);
	}
	
	public BSTNode returnNextNode(BSTNode node){		
		if(node == null){
			return null;
		}
		
		BSTNode parentTemp = node.parent;
		
		/*If nodes are leaf*/
		if(node.left== null && node.right ==null){			
			if(parentTemp == null)
				return null;
			else
			{
				if(parentTemp.left == node){
					return parentTemp;
				}
				else if(parentTemp.right == node){
					return parentTemp.parent;
				}
			}
		}
		
		/*If nodes are not leaf*/
		if(parentTemp == node.left){
			if(node.right!=null){
				return inorder(node.right);
			}
			else
			{
				return node.parent;
			}
		}
		
		if(parentTemp == node.right){
			if(node.right!=null){
				return inorder(node.right);
			}
			else
			{
				return node.parent==null?null:node.parent.parent;
			}
		}
					
		return node;
	}

	/*To find the inorder successor we will either choose our parent or
	 * we will choose our right inorder successor*/
	public BSTNode returnNext(BSTNode node){
		
		/*If node is not null*/
		if(node!=null){
			//Make a temp reference
			BSTNode p;
			
			/*If node doesn't have a parent or if node has a right child
			 * then we know that the inorder successor will be to the right*/
			if(node.parent==null || node.right!=null){
				//This is the case where our successor is in the right
				p = inorder(node.right);
			}
			else{
				/*If parent is not null therefore parent could be the successor or
				 * if node.right == null, then also the parent could be the successor*/
				while((p = node.parent)!=null){
					//This is the case where our successor is in the parent
					if(p.left == node){
						/*If our node is to the left of the parent this our parent
						 * is our successor, therefore we will break here and assign
						 * parent as the successor, p holds the parent*/
						break;
					}
					/*If our node is on the right of its parent, then we would find the
					 * successor to our parent and that will be our successor too. If
					 * our parent is also on the right of its parent, then we'll find
					 * the successor of our parent's parent and this will keep on going
					 * on until our parent is on the left of its parent, hence the WHILE loop*/
					node = p;
				}
			}
			return p;
		}
		
		return node;
	}
	
}
