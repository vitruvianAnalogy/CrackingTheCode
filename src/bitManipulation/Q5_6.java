package bitManipulation;

public class Q5_6 {
	
	public static int swap(int n){
		//mask even bits with 10101010
		//0xaaaaaaaa adds up to 32 bit of 101010 combination....8 a are needed
		int c1 = n & 0xaaaaaaaa;
		c1 = c1>>1;
		//mask odd bits with 01010101
		int c2 = n & 0x55555555;
		c2 = c2<<1;
		
		return c1 | c2;
	}

}
