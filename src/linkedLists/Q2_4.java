package linkedLists;

//1. Iteration used. 2. TRY using recursion
public class Q2_4 {
	
	public Node sum(Node a, Node b){
		Node head = new Node(0);
		Node temp = head;
		int carry = 0;
		
		while(a!=null || b!=null){
			int rem = (a.data+b.data+carry)%10;
			carry = (carry + a.data + b.data)/10;
			temp = new Node(rem);
			temp.next = null;
			temp = temp.next;
			a=a.next;
			b=b.next;
		}
		
		if(a==null)
		{
			temp = b;
		}
		
		if(b==null)
		{
			temp = a;
		}
		
		return head;
		
	}
	
	public static Node sum2(int carry,Node a, Node b){
		
		if(a==null || b==null)
			return null;
		
		Node result = new Node(carry);
		int value = carry;
		
		if(a!=null){
			value = value + a.data;
		}
		if(b!=null){
			value = value + b.data;
		}
		
		result.data = value%10;
		result.next = sum2(value/10,a.next,b.next);
		
		return result;		
		
	}
	
	public static void main(String[] args){
		Node a = new Node(3);
		a.next=new Node(1);
		a.next.next = new Node(5);
		
		Node b = new Node(5);
		b.next=new Node(9);
		b.next.next = new Node(2);
		
		Node sum = sum2(0,a,b);
		while(sum!=null){
			System.out.println(sum.data);
			sum=sum.next;
			
		}
		
	}

}
