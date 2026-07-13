import java.util.Scanner;

class CalculatoApp {

	void showStart() {
		System.out.println("************");
		System.out.println("*電卓アプリ*");
		System.out.println("************");

		System.out.println("実行したい計算を選んでください");
		System.out.println("1：足し算");
		System.out.println("2：引き算");
		System.out.println("3：かけ算");
		System.out.println("4：わり算");
		
		System.out.println("番号：");

	}

	int add(int a, int b) {
		System.out.println("結果：" + (a + b));
		return a + b;
	}

	int sub(int num1, int num2) {
		System.out.println("結果：" + (num1 - num2));
		return num1 - num2;
	}

	int mul(int num1, int num2) {
		System.out.println("結果：" + (num1 * num2));
		return num1 * num2;
	}

	double div(double num1, double num2) {
		System.out.println("結果：" + (num1 / num2));
		return num1 / num2;
	}
}

public class Calculato {
	public static void main(String[] args) {
		CalculatoApp calcu = new CalculatoApp();
		Scanner sc = new Scanner(System.in);

		calcu.showStart();
		
		int num = sc.nextInt();

		if (num == 1) {
			System.out.print("1 つ目の数値を入力してください：");
			int num1 = sc.nextInt();
			System.out.print("2 つ目の数値を入力してください：");
			int num2 = sc.nextInt();
			calcu.add(num1, num2);

		} else if (num == 2) {
			System.out.print("1 つ目の数値を入力してください：");
			int num1 = sc.nextInt();
			System.out.print("2 つ目の数値を入力してください：");
			int num2 = sc.nextInt();
			calcu.sub(num1, num2);
			
		} else if (num == 3) {
			System.out.print("1 つ目の数値を入力してください：");
			int num1 = sc.nextInt();
			System.out.print("2 つ目の数値を入力してください：");
			int num2 = sc.nextInt();
			calcu.mul(num1, num2);
			
		} else if (num == 4) {
			System.out.print("1 つ目の数値を入力してください：");
			double num1 = sc.nextDouble();
			System.out.print("2 つ目の数値を入力してください：");
			double num2 = sc.nextDouble();
			calcu.div(num1, num2);
			
		}

		System.out.println("計算を終了します。");
		sc.close();
	}
}
