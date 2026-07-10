
class Printer1 {
	void print(int x)	{ System.out.println("整数：" + x);}
	void print(double x)	{ System.out.println("小数：" + x);}
	void print(String x)	{ System.out.println("文字列：" + x);}
}

class Printer{
	public static void main(String[] args) {
		Printer1 p = new Printer1();
		p.print(10);
		p.print(3.14);
		p.print("Hello");
			
	}
}
