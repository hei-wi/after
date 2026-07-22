class Prac {
	private int price;

	public int getPrice() {
		return (int) (price / 1.1);

	}

	public void setPrice(int p) {
		if (p >= 0) {
			price = (int) (p * 1.1);
		}
	}
}

public class Practice {
	public static void main(String[] args) {
		Prac p = new Prac();
		
		p.setPrice(1200);
		System.out.println(p.getPrice());
	}
}
