package stackAndQueues;

/*We need two stacks for this. We pop one element and then push it into another
 * stack, while simultaneously checking if it is GREATER than the element already
 * on top of it. We pop enough elements from this auxiliary stack as to have the larges
 * element at the bottom and smallest in the top. For that we pop elements from
 * the auxiliary stack if they are smaller than the element we are checking and push them
 * into our main stack in that order. After doing this we push our element in the 
 * auxiliary stack and then put back all the elements in the auxiliary stack again*/
public class Q3_6 {
	
	public void sort(Stack myStack){
/*		if(myStack.isEmpty()){
			System.out.println("Stack is empty");
		}
		Stack temp = new Stack();
		while(myStack!=null){
			Node data = myStack.pop();
			if(temp.isEmpty())
				temp.push(data);
			else
			{
				if(temp.peek().data<data.data){
					swap(temp.pop().data, data.data);
				}
			}
		}*/
		
	}

}
