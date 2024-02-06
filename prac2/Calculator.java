class Calculator {
	public static void main(String[] args) {
		int a=5, b=2;
		System.out.println(add(a,b));
		System.out.println(sub(a,b));
		System.out.println(mul(a,b));
		System.out.println(div(a,b));		
		
	}
	
	// Addition
	
	public static int add(int x, int y) {
		return x+y;
	}
	
	// Subtraction
	
	public static int sub(int x, int y) {
		return x-y;
	}
	
	// Multiplication
	
	public static int mul(int x, int y) {
		return x*y;
	}
	
	// Division
	
	public static int div(int x, int y) {
		if(y!=0) {
			return y;
		}
		else {
			return x/y;
		}
	}
}
