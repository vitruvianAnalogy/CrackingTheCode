package bitManipulation;

public class Q5_2 {
	
	public String convertToBinary(String decimal){
		int intPart = Integer.parseInt(decimal.substring(0,decimal.indexOf('.')));
		double decPart = Double.parseDouble(decimal.substring(decimal.indexOf('.'),decimal.length()));
		
		String intString = "";
		//Converting the int part of the string to binary is straightforward
		
		while(intPart>0){
			intString = intString + intPart%2;
			intPart = intPart/2;
		}
		
		StringBuffer decString = new StringBuffer();
		
		while(decPart>0){
			//If length is more than 32 then we return error
			if(decString.length()>32)
				return "ERROR";
			//If decimal part is just 1 then append it
			if(decPart == 1){
				decString.append((int)decPart);
				break;
			}
			//Otherwise it means it is more than 1,
			//we multiply it with 2, it is the opposite of what we did in the int part
			double r = decPart * 2;
			
			//If it becomes 1, then we concatenate 1 or else we concatenate 0
			if(r>=1){
				decString.append(1);
				decPart = r -1;
			}
			else{
				decString.append(0);
				//after concatenating 0 we assign the double part to r, so
				//that it can test the next digit
				decPart = r;
			}
		}
		
		return intString + "." + decString.toString();

	}

}
