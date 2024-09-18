package b;

public class HRmanager extends Employee {
	public void work() {
		System.out.println("Managing new employee");
	}

	public void addEmployee() {
		System.out.println("adding new Employee");
	}

	public static void main(String[] args) {
		HRmanager hrManager = new HRmanager();
		hrManager.work();
		hrManager.getSalary();
		hrManager.addEmployee();
	}
}
