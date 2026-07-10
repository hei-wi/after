class lator {

	void showStart() {
		System.out.println("**************");
		System.out.println("*電卓アプリ*");
		System.out.println("**************");

		System.out.println("実行したい計算を選んでください");
		System.out.println("１：足し算");
		System.out.println("２：引き算");
		System.out.println("３：掛け算");
		System.out.println("４：割り算");
		System.out.println("５：平方根を求める");
		System.out.println("６：階乗");
		System.out.println("７：素数判定");

	}

	void add(double decimalAdd1, double decimalAdd2) {
		double answerAdd = decimalAdd1 + decimalAdd2;
		System.out.println(answerAdd);
	}

	void sub(double decimalSub1, double decimalSub2) {
		double answeSub = decimalSub1 - decimalSub2;
		System.out.println(answeSub);

	}

	void mul(double decimalMul1, double decimalMul2) {
		double answerMul = decimalMul1 * decimalMul2;
		System.out.println(answerMul);
	}

	void div(double decimalDiv1, double decimalDiv2) {
		double answerDiv = decimalDiv1 / decimalDiv2;
		System.out.println(answerDiv);
	}

	void squareNumber(double decimal) {
		double answer = decimal * decimal;
		System.out.println(answer);
	}

	void factorial(int number) {
		int answer = 1;
		while (number != 1) {
			answer *= number;
			number--;
		}
		System.out.println(answer);
	}

	void primeNumber(int number) {
		boolean primeFlag = true;

		for (int i = 2; i < number; i++) {
			if (number % 1 == 0) {
				primeFlag = false;
			}
		}

		if (primeFlag == true) {
			System.out.println(number + "は素数です");
		} else {
			System.out.println(number + "は素数ではありません");
		}
	}
}