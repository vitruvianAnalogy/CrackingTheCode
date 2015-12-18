package stackAndQueues;

class Node{
	int data;
	Node next;
	
	public Node(int data){
		this.data = data;
		next = null;
		
	}
}

class Stack{
	
	Node top;
	int size;
	
	public Node pop(){
		
		if(top!=null){
			Node temp = new Node(top.data);
			top = top.next;
			return temp;
		}
					
		return null;		
	}
	public void push(int data){
		
		Node temp = new Node(data);
		temp.next = top;
		top = temp;
	}
	
}

public class Q3_1 {
	
	int stackSize = 300;
	//tracks topElement
	int[] stackPointer = {0,0,0};
	int[] array = new int[stackSize*3];
	
	//Divide array into stacks of equal size
	public void pushStatic(int stackNum, int value){
		/*Since the stack is empty in the beginning therefore
		 * the top elements for each stack will be at 0, 
		 * 300 and 600 respectively*/
		
		int index = (stackNum * stackSize) + stackPointer[stackNum];
		stackPointer[stackNum]++;
		array[index] = value;
		
	}	
	
	public int popStatic(int stackNum){
		int index = (stackNum*stackSize) + stackPointer[stackNum]-1;
		stackPointer[stackNum]--;
		int value = array[index];
		array[index] = 0;
		
		return value;
	}
	

	
	public static void main(String[] args){
		
	}

}


