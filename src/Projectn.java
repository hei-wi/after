class Projectn1 {
	private String name;
	private int price;

	private static double taxRate = 0.1;
	private static int productCount = 0;

	public Projectn1(String n, int p) {
		name = n;
		price = p;
		productCount++;
	}

	public double getPriceWuthTax() {
		return price * (1 + taxRate);
	}

	public void showInfo() {
		System.out.println("----------------------");
		System.out.println("商品名：" + name);
		System.out.println("税抜き価格：" + price + "円");
		System.out.println("税込価格：" + (int) getPriceWuthTax() + "円");
		System.out.println("----------------------");
	}

	public static void showTaxRate() {
		System.out.println("現在の消費税率：" + (taxRate * 100) + "%");
	}

	public static void showProductCount() {
		System.out.println("登録されている商品数：" + productCount + "点");
	}
}

public class Projectn {
	public static void main(String[] args) {

		System.out.println("=== 商品登録と税率確認 ===");
		System.out.println();
		Projectn1.showTaxRate();
		Projectn1.showProductCount();

		Projectn1 p1 = new Projectn1("ノート", 120);
		Projectn1 p2 = new Projectn1("ボールペン", 180);
		Projectn1 p3 = new Projectn1("USBメモリ", 980);

		p1.showInfo();
		p2.showInfo();
		p3.showInfo();

		System.out.println("\n === 商品登録数と税率 ===");
		System.out.println();
		Projectn1.showTaxRate();
		Projectn1.showProductCount();
	}
}
