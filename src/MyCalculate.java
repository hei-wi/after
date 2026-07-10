import java.util.Scanner;

public class MyCalculate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("☆☆ My 電卓 ☆☆");
		System.out.println("計算対象となる演算番号（１：加算、２：減算、３：乗算、"
				+ "４：除算)");
		
		int inputNumber = sc.nextInt();
		
		if(inputNumber == 1) {
			System.out.println("１つ目の数値を入力してください");
			int num1 = sc.nextInt();
			System.out.println("２つ目の数値を入力してください");
			int num2 = sc.nextInt();
			System.out.println("結果は" + (num1  + num2) + "です。");
		
		}else if (inputNumber == 2) {
			System.out.println("１つ目の数値を入力してください");
			int num1 = sc.nextInt();
			System.out.println("２つ目の数値を入力してください");
			int num2 = sc.nextInt();
			System.out.println("結果は" + (num1  - num2) + "です。");
		
		}else if (inputNumber == 3) {
			System.out.println("１つ目の数値を入力してください");
			int num1 = sc.nextInt();
			System.out.println("２つ目の数値を入力してください");
			int num2 = sc.nextInt();
			System.out.println("結果は" + (num1  * num2) + "です。");
		
		}else if(inputNumber == 4) {
			System.out.println("１つ目の数値を入力してください");
			int num1 = sc.nextInt();
			System.out.println("２つ目の数値を入力してください");
			int num2 = sc.nextInt();
			System.out.println("結果は" + (num1  / num2) + "です。");
		}
		
		System.out.println("計算を終了します。");
		sc.close();
	}
}
