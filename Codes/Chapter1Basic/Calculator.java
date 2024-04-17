//Program to add 2 integers. if those 2 integers are negative numbers throw exception(IllegalArgumentException) with error message don't pass negative numbers.
//If given values are positive numbers add those two numbers and return result.


class  Calculator {
	public static void main(String[] args) {
		try{
			int res = Addition.add(-5,6);
			System.out.println("Result: " + res);
			
		}catch (IllegalArgumentException e){
			System.out.println("Error: " +e.getMessage());
		}
	}
}
