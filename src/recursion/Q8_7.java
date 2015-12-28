package recursion;
/*NO IDEA HOW TO DO THIS PROBLEM*/
public class Q8_7 {
	
	public enum Money{
		PENNY, NICKEL, DIME, QUARTER
	}
	public static int coinRepresentation(int n, int ways){
		if(n==0){
			return ways;
		}
		if(n>=25){
			ways++;
			ways = coinRepresentation(n-25,ways);
		}
		if(n>=10){
			ways++;
			ways = coinRepresentation(n-10,ways);
		}
		if(n>=5){
			ways++;
			ways = coinRepresentation(n-5,ways);
		}
		if(n>=1){
			ways++;
			ways = coinRepresentation(n-1,ways);
		}
		return ways;
	}
}
