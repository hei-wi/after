class Student{
	String name;
	int grade;
	
	
	public Student(String n, int g) {
		name = n;
		grade = g;
	}
}

public class StudentApp {
	public static void main(String[] args) {
		Student s1 = new Student("太郎",2);
		Student s2 = new Student("花子",3);

		System.out.println(s1.name + ":" + s1.grade + "年生");
		System.out.println(s2.name + ":" + s2.grade + "年生");
	}
}
