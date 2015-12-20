package treesAndGraphs;

public class Q4_7 {
	
	public static boolean isSubTree(BNode T1, BNode T2){
		
		while(T1!=null){
			T1 = covers(T1, T2);
			if(isSameTree(T1,T2))
				return true;
			
		}
		return false;
	}

	public static boolean isSameTree(BNode t1, BNode t2) {
		if(t2==null)
			return true;
		if(t1==t2)
			return (isSameTree(t1.left,t2.left)&& isSameTree(t1.right,t2.right));
		return false;
	}

	public static BNode covers(BNode t1, BNode t2) {
		if(t1==null)
			return null;
		if(t1==t2)
			return t1;
		else
		{
			return covers(t1.left,t2)==null?covers(t1.right,t2):null;
		}
		
	}

}
