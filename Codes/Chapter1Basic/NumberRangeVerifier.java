class NumberRangeVerifier {
	static int verifyNCalculate(int a)
		   throws IllegalArgumentException {

	if(a<10 || a>20) {
		throw new IllegalArgumentException ("Value must be in between 10 and 20");
	}else{
		return a + 10;
	}
	}
}
