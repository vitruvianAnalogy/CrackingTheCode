package linkedLists;

class Node {
	int data;
	Node next;
	
	public Node(int data){
		this.data = data;
		this.next = null;
	}
}

class LinkedList{
	Node head;
	public LinkedList(int data){
		head = new Node(data);
	}
	
	public void add(int data){
		Node temp = head;
		while(temp.next!=null){
			temp = temp.next;
		}
		Node newNode = new Node(data);
		temp.next = newNode;
	}
	
	public void printList(){
		Node temp = head;
		if(head==null)
			return;
		while(temp!=null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public void removeDups(){
		
		if(head==null)
			return;
		
		Node previous = head;
		Node current = previous.next;
		while(current!=null){
			Node runner = head;
			
			while(runner!=current){
				if(runner.data == current.data){
					//Skip the current
					previous.next = current.next;
					current = current.next;
					//Since i have taken care of this current, therefore
					//I don't need to keep this loop running, therefore break
					break;
				
				}				
				runner=runner.next;
			}
			if(runner==current){
				/*Once we have reached this current, therefore now we will
				 * take care of the next element
				 * Therefore we'll keep track of the one element before it
				 * and the element which are gonna study now*/ 
				previous = current;
				current = current.next;
			}
		}		
	}
}

public class Q2_1 {
	
	public static void main(String[] args){
		
		/*Create linked list*/
		LinkedList myList = new LinkedList(10);
		myList.add(4);
		myList.add(5);
		myList.add(6);
		myList.add(6);
		myList.add(7);
		myList.add(7);
		myList.add(4);
		
		System.out.println("Original List");
		myList.printList();
		
		myList.removeDups();
		System.out.println("Changed List");
		myList.printList();
	}

}
