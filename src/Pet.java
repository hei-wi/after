class Pets{
	String name;
	int age;
	String type;
	
	Pets(String n) {
		name = n;
		age = 0;
		type = "不明";
	}
	
	 Pets() {
		 name = "未設定";
		 age = 0;
		 type = "不明";
		 
	 }
	 
	 Pets(String n, int a){
		 name = n;
		 age = a;
		 type = "不明";
	 }
	 
	 Pets(String n,int a,String t){
		 name = n;
		 age = a;
		 type = t;
	 }
	
	void showInfo() {
		
		System.out.println(type + "の" + name + "：" + age + "歳");
		
	}
}

public class Pet {
	public static void main(String[] args) {
		Pets pe1 = new Pets("ポチ");
		Pets pe2 = new Pets("ミケ");
		Pets pe3 = new Pets();
		Pets pe4 = new Pets("ハナ",3);
		Pets pe5 = new Pets("モモ",2,"うさぎ");
		
		System.out.println("ペットの登録をしました（未設定）");
		pe1.showInfo();
		pe2.showInfo();
		pe3.showInfo();
		pe4.showInfo();
		pe5.showInfo();
	}
}
