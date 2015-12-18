package linkedLists;

public class Q2_5 {
	
	public static Node getLoopHead(Node node){
		if(node == null)
			return null;

		Node slow = node;
		Node fast = node;
		
		while(fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
				break;
			if(fast==null)
				break;
		}
		if(fast==null | fast.next==null)
			return null;
		
		slow = node;
		while(slow!=fast){
			slow=slow.next;
			fast=fast.next;			
		}

		return fast;
	}

}
