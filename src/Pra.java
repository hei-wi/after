class Pra1 {
	String name;
	int score;
	static String university = "人間環境大学"; //クラス変数

	void showInfo() {
		System.out.println(name + "さんの点数は " + score + "点です。");
	}
}

public class Pra {
	public static void main(String[] args) {
		Pra1 st1 = new Pra1();
		st1.name = "太郎";
		st1.score = 85;

		Pra1 st2 = new Pra1();
		st2.name = "花子";
		st2.score = 92;

		//		st1.showInfo();
		//		st2.showInfo();
		
		System.out.println(st1.name + "さんの大学： " + st1.university);
		System.out.println(st2.name + "さんの大学： " + st1.university);
		
		Pra1.university = "NEO 人間環境大学マークⅡ"; //static変数の値を変更
		
										//static変数の中身を確認 ↓ 
		System.out.println(st1.name + "さんの大学： " + st2.university);
		System.out.println(st1.name + "さんの大学： " + st2.university);
		
	}
}
