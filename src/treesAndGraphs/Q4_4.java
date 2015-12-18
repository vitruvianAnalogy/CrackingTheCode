package treesAndGraphs;
import java.util.*;
//Make linked list of each level
public class Q4_4 {
	public ArrayList<LinkedList<Node>> returnListOfLinkedLists(Node root){
		
		/*Initialize list of linked lists*/
		ArrayList<LinkedList<Node>> lists = new ArrayList<LinkedList<Node>>();
		/*Initialize linked list*/
		LinkedList<Node> list = new LinkedList<Node>();
		
		list.add(root);
		lists.add(list);
		int level = 0;
		
		while(true){
			list = new LinkedList<Node>();
			for(int i = 0; i<lists.get(level).size();i++){
				if(lists.get(level).get(i)!=null)
				{
					Node temp = lists.get(level).get(i);
					if(temp.left!=null)
						list.add(temp.left);
					if(temp.right!=null)
						list.add(temp.right);
				}				
			}
			if(list.size()>0)
				lists.add(list);
			else
				break;
			level++;
		}

		return lists;
	}
	
}
