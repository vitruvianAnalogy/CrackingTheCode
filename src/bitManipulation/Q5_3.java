package bitManipulation;

public class Q5_3 {
	
//	public int returnLargest(int n){
//		String strN = Integer.toBinaryString(n);
//		int flag = 0;
//		for(int i = strN.length()-1; i>=0; i--){
//			if(strN.charAt(i)==1){				
//				if(flag==0){
//					flag=1;
//					strN=strN.substring(0,i+1)+"0"+strN.substring(i+2);
//					continue;
//				}				
//			}
//			if(strN.charAt(i)==0){
//				if(flag==1){
//					strN=strN.substring(0,i+1)+"1"+strN.substring(i+2);
//					break;
//				}
//			}
//		}
//		return Integer.parseInt(strN);
//	}
	
	/*public int returnSmallest(int n){
		String strN = Integer.toBinaryString(n);
		int flag = 0;
		for(int i = strN.length()-1; i>=0; i--){
			if(strN.charAt(i)==0){				
				if(flag==0){
					flag=1;
					strN=strN.substring(0,i+1)+"0"+strN.substring(i+2);
					continue;
				}				
			}
			if(strN.charAt(i)==1){
				if(flag==0){
					strN=strN.substring(0,i+1)+"1"+strN.substring(i+2);
					break;
				}
			}
		}
		return Integer.parseInt(strN);
	}*/

	public static boolean getBit(int n, int index){
		return ((n&(1<<index))>0);//Check if this index has a zero or one
	}
	
	public static int setBit(int n, int index, boolean b){
		if(b){
			return (n|(1<<index)); //put one at this index
		}
		else
		{
			//Maintain the state of all the bits that are not at index
			//and change the bit at index to zero
			
			int mask = ~(1<<index);//~ flips bits
			return n & mask;//turn bits that are not at index to 1
		}
	}
	
	public static int getNextN(int n){
		
		/*If number is negative then return failure*/
		if(n<=0){
			return -1;
		}
		
		int index = 0;
		int countOnes = 0;
		
		//The first one we get, we stop counting
		while(!getBit(n,index))
			index++;
		//Count ones and look for zero
		while(getBit(n,index)){
			index++;
			countOnes++;
		}
		
		//Sets the first zero encountered to 1
		n = setBit(n,index,true);
		
		//Sets the one before that to 0
		index--;
		n = setBit(n,index,false);
		countOnes--;
		
		//Shift 1s on the right to as right as possible
		for(int i = index-1; i>=countOnes; i--)
		{
			n = setBit(n,i,false);
		}
		for(int i = countOnes-1;i>=0;i--)
		{
			n = setBit(n,i,true);
		}	
		
		return n;
	}
	
	public static int getPreviousN(int n){
		
		/*If number is negative then return failure*/
		if(n<=0){
			return -1;
		}
		
		int index = 0;
		int countZeros = 0;
		
		//The first zero we get
		while(getBit(n,index))
			index++;
		//We look for next one
		while(!getBit(n,index))
		{
			index++;
			countZeros++;
		}
		//Set the one to zero
		n = setBit(n,index,false);

		//Set the previous zero to 1
		index--;
		n = setBit(n,index,true);
		countZeros--;
		
		//Set elements to the left to one. This makes the number as large as possible
		//without letting it become larger than n.
		for(int i = index-1; i>=countZeros; i--)
		{
			n = setBit(n,i,true);
		}
		//Set right most elements to zeros
		for(int i = countZeros-1;i>=0;i--)
		{
			n = setBit(n,i,false);
		}	
		
		return n;
	}
}
