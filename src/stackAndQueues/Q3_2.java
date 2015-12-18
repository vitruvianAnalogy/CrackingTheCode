package stackAndQueues;

/*Def: Push, Pop and Min in O(1) time*/

/*Approach 1: Each node should keep track of min before. Instead of using
 * a single variable to keep track of min we are using each node to keep track of mins
 * below them because if the min element is popped, there is no where to find
 * which is the next min element*/

/*Approach 2: Maintain a stack of mins which updates stack only if a smaller number
 * is encountered, making the top element min. This saves space if number of elements
 * are large. This also helps against duplication.*/
public class Q3_2 {

}
