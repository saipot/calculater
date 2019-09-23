package Calculations;

public class Addition {
	int c;

	public void testOne(int a, int b) {
		c = a + b;
		System.out.println("The answer is:" + c);
	}

	public static void main(String[] args) {
		Addition obj = new Addition();
		obj.testOne(5, 6);

	}

}
