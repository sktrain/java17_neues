package sk.train.interfaces;

public class Overloading {
	
	public static int f(int i) {
		return 1;
	}
	
	public static int f(int... i) {
		return 2;
	}
	
	public static String f(double i) {
		return "Hallo";
	}
	
	public static void main(String[] args) {
		System.out.println(f());
		System.out.println(f(1));
		System.out.println(f(1, 2));
	}

}
