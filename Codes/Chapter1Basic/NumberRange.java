//Develop a program with one parameter method to take integer as argument?
// Inside this method verify whether this argument is between 10 and 20.
// If no, throw exception IAE with an error message "Value must be between 10 and 20"
// If yes, perform calculation -> add 10 to this argument and return result.
// call this method from main method. 
//Display Result and Error Message returning and throwing from this method?


class  NumberRange {
	public static void main(String[] args)  {
		try{
			int res = NumberRangeVerifier.verifyNCalculate(9);
			System.out.println("Result: " + res);
		}
		catch (IllegalArgumentException e){
			System.out.println("Error: " +e.getMessage());
		}
}
}
