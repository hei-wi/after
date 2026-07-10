import java.util.Scanner;

public class latorApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		lator calc = new lator();
		
		
		calc.showStart();
		System.out.println();
		
		System.out.println("番号：");
		int input = sc.nextInt();
		
		if(input == 1) {
			
			System.out.println("１つ目の数字を入力してください");
			double argument1 = sc.nextDouble();
			System.out.println("２つ目の数値を入力してください");
			double argument2 = sc.nextDouble();
			calc.add(argument1, argument2);
			
		}else if(input == 2) {
			
			System.out.println("１つ目の数字を入力してください");
			double argument1 = sc.nextDouble();
			System.out.println("２つ目の数値を入力してください");
			double argument2 = sc.nextDouble();
			calc.sub(argument1, argument2);
		
		}else if(input == 3) {
			
			System.out.println("１つ目の数字を入力してください");
			double argument1 = sc.nextDouble();
			System.out.println("２つ目の数値を入力してください");
			double argument2 = sc.nextDouble();
			calc.mul(argument1, argument2);
			
		}else if(input == 4) {
			
			System.out.println("１つ目の数字を入力してください");
			double argument1 = sc.nextDouble();
			System.out.println("２つ目の数値を入力してください");
			double argument2 = sc.nextDouble();
			calc.div(argument1, argument2);	
			
		}else if(input == 5) {
			
			System.out.println("数字を１つ入力してください");
			double argument = sc.nextDouble();
			
			calc.squareNumber(argument);
		
		}else if(input == 6) {
			
			System.out.println("正の整数を一つ入力してください");
			int argument1 = sc.nextInt();
			calc.factorial(argument1);
			
		}else if(input == 7) {
			
			System.out.println("正の整数を一つ入力してください");
			int argument2 = sc.nextInt();
			calc.primeNumber(argument2);
			
		}
		
		sc.close();
	}
}
