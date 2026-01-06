package ch10_예외;

public class ex09_main메서드로예외전가 {
	public static void main(String[] args) throws Exception {
		findClass();
	}

	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}
