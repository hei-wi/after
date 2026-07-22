class Employee {
	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public int getId() {
		return id;

	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}
}

public class EmployeApp {
	public static void main(String[] args) {
		Employee e = new Employee(1001, "Taro");
		System.out.println(e.getId());
		System.out.println(e.getName());
		e.setName("Hanako");
		System.out.println(e.getName());
		
	}
}
