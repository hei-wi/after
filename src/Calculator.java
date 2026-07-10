
 class Calculator1 {
	
	 
	int add(int a, int b) {
		return a + b;
	}

	double add(double a, double b) {
		return a - b;
	}
	
	int add (byte a, byte b) {
		return a*b;
	}
	
	void add(String a, String b) {
		System.out.println(a + "しかし" + b);
	}
	
//	int add(int a, int b, int c) {
//		return a + b + c;
//}
 }
 class Calculator{
	 public static void main(String[] args) {
		
	
	  Calculator1 calc = new Calculator1();
	 
	  calc.add(1,3);
	  calc.add(1.5,3.14);
	  calc.add(10,12);
	  calc.add("hane","tubasa");
	  
	 }
	 }
