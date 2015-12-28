package objectOrientedDesign;
import java.util.*;

import objectOrientedDesign.Call.priority;

class Call{
	public enum priority{
		LOW,MEDIUM,HIGH;
	};
	//Priority of call
	public priority p; 
}

class CallCenter{
	
	private ArrayList<Fresher> emp;
	private TL lead = new TL();
	private PM mng = new PM();
	
	public Employee getCallHandler(Call c){
		if(c.p == priority.LOW)
			return new Fresher();
		else if(c.p == priority.MEDIUM)
			return lead;
		else
			return mng;
	}

}

class Employee{
	
}

class TL extends Employee{
	
}

class PM extends Employee{
	
}

class Fresher extends Employee{
	
}

public class Q7_2 {

}
