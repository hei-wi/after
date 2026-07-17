
class Task1 {
	String title;
	String deadline;
	int priority;// 1 = 低 , 2 = 中 , 3 = 高

	void showTask() {
		System.out.println("[タスク] " + title + " / 締め切り： " + deadline +
				" / 優先度： " + priority);
	}
	
	Task1(String title){
		this.title = title;
		this.deadline = "未定";
		this.priority = -1;
	}
	
	Task1(int priority){
		this.title = "未定";
		this.deadline = "未定";
		this.priority = priority;
	}
	
	Task1(String title , int priority){
		this.title = title;
		this.deadline = "未定";
		this.priority = priority;
	}
	
	Task1(String title, String deadline){
		this.title = title;
		this.deadline = deadline;
		this.priority = -1;
	}
	
	

	Task1(String title, String deadline, int piority) {
		this.title = title;
		this.deadline = deadline;
		this.priority = piority;
	}

	 Task1() {
		 this.title = "未設定";
		 this.deadline = "未定";
		 this.priority = -1; //	何も設定してないインスタンスであることを自明にする
		 System.out.println("※未設定のタスクを作成しました");
	}

}

public class Task {
	public static void main(String[] args) {
		Task1 t1 = new Task1();
		Task1 t2 = new Task1("レポート構成案作り");
		Task1 t3 = new Task1(3);
		Task1 t4 = new Task1("発表練習",2);
		Task1 t5 = new Task1("提出物まとめ","11月10日");
		Task1 t6 = new Task1("アンケート集計","11月05日",1);		
		
		
		t1.showTask();
		System.out.println();
		t2.showTask();
		System.out.println();
		t3.showTask();
		System.out.println();
		t4.showTask();
		System.out.println();
		t5.showTask();
		System.out.println();
		t6.showTask();
	}
}
