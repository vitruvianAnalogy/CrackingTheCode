package treesAndGraphs;
import java.util.*;
import treesAndGraphs.Q4_2.State;

class Graph{
	private ArrayList<Node> vertices = new ArrayList<Node>();
	
	public ArrayList<Node> getVertices() {
		return vertices;
	}

	public void setVertices(ArrayList<Node> vertices) {
		this.vertices = vertices;
	}

	public Graph(){
		
	}
}

public class Q4_2 {
	
	public enum State{
		Visited, Unvisited, Visiting;
	}
	
	public static boolean search(Graph g, Node start, Node end){
		//Stack for DFS
		LinkedList<Node> stack = new LinkedList<Node>();
		
		//Initialize state of all unvisited nodes
		ArrayList<Node> vertices = g.getVertices();
		for(Node n : vertices){
			n.state = State.Unvisited; 
		}
		
		/*Initialize your starting node. We assign "Visiting" because
		 * a loop might bring our search back to the node that we
		 * are visiting, we need to be able to differentiate them*/
		start.state = State.Visiting;
		stack.add(start);
		
		while(!stack.isEmpty()){
			if(start==end){
				if(end.state==State.Unvisited)
					return true;
			}
			else
			{
				Node popped = stack.pop();
				if(popped.left!=null){
					stack.add(popped.left);
					start.left.state = State.Visiting;
				}
				if(popped.right!=null){
					stack.add(popped.right);
					start.right.state = State.Visiting;	
				}
				popped.state = State.Visited;
				
			}			
		}
		
		return false;
	}
	
	public static void main(String[] args){
		/*Given a graph, to find if there is a route between two nodes
		 * only makes sense if we are provided two node because otherwise
		 * a directed graph with more than one node is definitely connected
		 * to some node and thus there is a route between two nodes*/
		
		/*Therefore we will take this as having two nodes given and then
		 * finding if there exists a route between them*/
	}

}

class Node{
	int data;
	Node left;
	Node right;
	public State state;

	
	
	public Node(int data){
		this.data = data;
	}
}