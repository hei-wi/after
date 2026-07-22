class Counter {
	String name;
	int score;

	static String university = "人間環境大学"; //クラス変数
	static int count = 0;

	Counter() {
		count++;
	}
	
}

public class Count {
public static void main(String[] args) {
	
	Counter con1 =  new Counter();

	con1.name = "太郎";
	con1.score = 85;

	Counter st2 = new Counter();
	st2.name = "花子";
	st2.score = 92;

	System.out.println(con1.name + "さんの大学： " + st2.university);
	System.out.println(con1.name + "さんの大学： " + st2.university);
	
	Counter.university = "NEO 人間環境大学マークⅡ"; //static変数の値を変更
	
									//static変数の中身を確認 ↓ 
	System.out.println(con1.name + "さんの大学： " + st2.university);
	System.out.println(con1.name + "さんの大学： " + st2.university);
	
	System.out.println("現在の学生数：" + Counter.count + "人"); 
	
 }
}
