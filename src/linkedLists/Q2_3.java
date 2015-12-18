package linkedLists;

public class Q2_3 {
	
	public void removeElement(Node n){
		if(n==null || n.next==null){
			n=null;
			return;
		}
		n.data = n.next.data;
		n.next = n.next.next;
	}

}
