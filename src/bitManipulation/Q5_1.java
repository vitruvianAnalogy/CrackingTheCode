package bitManipulation;

public class Q5_1 {
	
	public int setSubString(int n, int m, int i, int j){
		
		//First way
//		String max = Integer.toBinaryString(n);
//		max = max.substring(0,i-1)+Integer.toBinaryString(m)+max.substring(j);
		
		//Second way
		int max = ~0; //All ones...32 of them since it is 32 bit
		
		//1 till position j, then 0, 11111-00011 = 11100
		int left = max - ((1<<j)-1);
		
		//After position i, everything is 1, 00011111
		int right = ((1<<i)-1);
		
		//Between left and right we will get 0, other places it is 1
		int mask = left | right;
		
		n = n & mask;
		n = n | (m<<i);
		
		return n;
		
		
	}
	public static void main(String[] args){
		System.out.println((1<<2)-1);
	}

}
