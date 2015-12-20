package treesAndGraphs;

/*Considering the case where there is no parent in the node*/
class BNode{
	BNode parent;
	BNode left;
	BNode right;
}
public class Q4_6 {

	public static BNode commonAncestor2(BNode first, BNode second, int diff){
		while(diff>0){
			first = first.parent;
			diff--;
		}
		while(first!=null || second!=null){
			if(first.parent!=second.parent){
				first = first.parent;
				second = second.parent;
			}
			else{
				return first.parent;
			}
		}
		
		return null;
	}
	
	/*If first second node are both on one side of a node, then we
	 * will branch into that direction where they are both on the same side
	 * until they are no longer on the same side, which would mean we have found
	 * the common ancestor*/
	public static BNode commonAncestor(BNode root, BNode first, BNode second){
		if(covers(root.left, first) && covers(root.left, second))
			return commonAncestor(root.left,first,second);
		else if(covers(root.right,first) && covers(root.right, second))
			return commonAncestor(root.right,first,second);
		else
			return root;
	}
	
	public static boolean covers (BNode root, BNode node){
		
		if(root == null)
			return false;
		if(root == node)
			return true;
		return covers(root.left,node) || covers(root.right,node);
	}
	
	public static void main(String[] args){
		BNode first = new BNode();
		BNode fTemp = first;
		BNode second = new BNode();
		BNode sTemp = second;
		
		int htFirst = 0;
		int htSecond = 0;
		
		while(fTemp.parent!=null){
			htFirst++;
			fTemp = fTemp.parent;
		}
		while(sTemp.parent!=null){
			htSecond++;
			sTemp = sTemp.parent;
		}
		if(htFirst-htSecond>0)
			commonAncestor2(first,second,(htFirst-htSecond));
		else
			commonAncestor2(second,first,(htSecond-htFirst));
	}
}
