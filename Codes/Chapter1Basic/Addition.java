class Addition {
	static int add(int a, int b)
		        throws IllegalArgumentException {

		if(a<0 || b<0){
			throw new IllegalArgumentException("Do Not Pass Negative Numbers");
		} else {
			return a + b;
		}
	}
	
}
