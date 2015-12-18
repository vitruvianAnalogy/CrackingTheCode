package stackAndQueues;

class StackNode{
	int data;
	int previous;
	public StackNode(int data, int previous){
		this.data = data;
		this.previous = previous;
	}
}

public class Q3_1b {
	
	int stackSize = 300;
	int indexUsed = 0;
	int[] stackPointer = {-1,-1,-1};
	
	/*Create an array of stack objects*/
	StackNode[] buffer = new StackNode[stackSize*3];
	
	public void push(int stackNum, int value){
		
		//Stores the previous top element index
		int lastIndex = stackPointer[stackNum];
		
		//Assigns the index which is available next 
		stackPointer[stackNum] = indexUsed;
		
		//Increment indexUsed for next time
		indexUsed++;
		
		//Save new node in buffer while maintaining previous top element
		buffer[stackPointer[stackNum]]= new StackNode(value,lastIndex);
		
	}
	
	public int pop(int stackNum){
		//Get the top element of this stackNum
		int topIndex = stackPointer[stackNum];
		
		//Get the value of the top element
		int value = buffer[topIndex].data;
		
		//Get the index of previous top element
		int previous = buffer[topIndex].previous;
		
		//Assign previous element index to stackPointer
		stackPointer[stackNum]=previous;
		
		//Remove the element once value is returned
		buffer[topIndex] = null;
		
		/*Deficiency : We can decrement indexUsed but this doesn't make
		 * sense because decrementing index used might overwrite some other
		 * stack. We can fix this by making another array which keeps track
		 * of the free spaces*/ 
		indexUsed--;
		
		return value;
		
	}

	public static void main(String[] args){
		
	}
}
