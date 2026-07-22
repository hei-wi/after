class Produc {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int p) {
		if (p >= 0) {
			price = p;
		}
	}
}

public class Produ {
	public static void main(String[] args) {

		Produc p = new Produc();

		p.setPrice(1200); //正しい値
		System.out.println(p.getPrice());
		
		p.setPrice(-500); //不正な値（無視される）
		System.out.println(p.getPrice());
	}
}
