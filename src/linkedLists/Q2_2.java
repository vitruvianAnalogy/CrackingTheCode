package linkedLists;

/*Find Nth to Last element of a singly linked list*/
public class Q2_2 {
	
	public Node returnNthToLastElement(Node head,int n){
		
		if(head==null || n<1)
			return null;
		
		Node slow = head;
		Node fast = head;
		int count = 1;
		
		while(count<n){
			if(fast.next==null)
				return null;
			fast= fast.next;
			count++;
		}
		while(fast.next!=null){
			slow = slow.next;
			fast = fast.next;
		}
		
		return slow;
	}

	public static void main(String[] args){
		
	}
}
