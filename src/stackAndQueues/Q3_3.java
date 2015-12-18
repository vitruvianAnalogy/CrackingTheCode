package stackAndQueues;

import java.util.ArrayList;

class SetOfStacks{
	ArrayList<Stack> myStacks = new ArrayList<Stack>();
	int capacity;
	public SetOfStacks(int capacity){
		this.capacity = capacity;
	}
	
	public Stack getLastStack(){
		if(myStacks.size()==0)
			return null;
		else
			return myStacks.get(myStacks.size()-1);
	}
	
	public void push(int value){
		//Stack myStack = getLastStack();
		
	}
	
	public int pop(){
		return 0;
	}
	
	public int popAt(int stackNum){
		return 0;
	}
}
public class Q3_3 {

}
