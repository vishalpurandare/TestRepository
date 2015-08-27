package main.java;



public class StringCalculator {

	public static int add(final String numbers) {
		int returnVal = 0;
		
		String[] numArr = numbers.split(",");
		
		//if(numArr.length > 2) {
		//	throw new RuntimeErrorException(null, "Up to 2 numbers separated by comma are allowed!");
		//} else {
		for(String numStr : numArr) {
			int n = Integer.parseInt(numStr.trim());
			if(n < 0) {
				throw new RuntimeException("No Negative number is allowed");
			}
			returnVal = returnVal + n;
		}
		//}
		
		
		return returnVal;
	}
	
}
