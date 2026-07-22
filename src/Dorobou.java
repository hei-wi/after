class Bank {
	private int deposit = 0;

	public Bank(int chokin) {
		deposit = chokin;

	}

	protected void showInfo() {
		System.out.println("残高" + deposit + "円");
	}
}

public class Dorobou {
	public static void main(String[] args) {

		Bank myBank = new Bank(10000);
		myBank.deposit = 100;		//privateによって使えない
		System.out.println(myBank.deposit);
	}
}
