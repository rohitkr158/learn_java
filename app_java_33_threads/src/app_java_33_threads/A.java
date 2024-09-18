package app_java_33_threads;

public class A extends Thread {
	String name;

	A(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(name);
		}
	}
}