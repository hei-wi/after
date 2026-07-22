class Asver {

	static int add(int a, int b) {
		return a + b;
	}

	static int sub(int a, int b) {
		return a - b;
	}

	static int mul(int a, int b) {
		return a * b;
	}

	static double div(double a, double b) {
		return a / b;
	}
}

public class Calcu {
	public static void main(String[] args) {
		System.out.println("加算：" + Asver.add(10, 5));
		System.out.println("減算：" + Asver.sub(8, 2));
		System.out.println("乗算：" + Asver.mul(3, 4));
		System.out.println("除算：" + Asver.div(9, 3));
		//インスタンスをつくってない！！ 
	}
}
