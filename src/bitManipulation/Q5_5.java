package bitManipulation;

public class Q5_5 {
	
	public static boolean getBit(int n){
		return ((n&(1))>0);//Check if this index has a zero or one
	}
	
	public static int noOfBits(int a, int b){
		int c = a^b;
		int count = 0;
		while(c>0){
			if(getBit(c))
				count++;
			c = c>>1;
		}
		return count;
	}
	
	public static int noOfBits2(int a, int b){
		int count = 0;
		for(int c = a^b; c!=0; c = c>>1)
		{
			//c&1 checks if the last digit is 1 or not
			count+= c & 1;
		}
		return count;
	}

}
