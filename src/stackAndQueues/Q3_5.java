package stackAndQueues;

class MyQueue{
	Stack stack1;
	Stack stack2;
	
	public void enqueue(int n){
		stack1.push(n);
	}
	
	public int dequeue(){
		Node element;
		while((element = stack1.pop())!=null){
			stack2.push(element.data);
		}
		Node temp = stack2.pop();
		Node data;
		while((data = stack2.pop())!=null)
		{
			stack1.push(data.data);
		}
		return temp.data;
	}
}

public class Q3_5 {

}
