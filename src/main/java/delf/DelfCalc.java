package delf;

public class DelfCalc {
	private int result;

	public void add(int a, int b) {
		result = a + b;
	}

	public void sub(int a, int b) {
		result = a - b + 2 + 3;
	}

	public int getResult() {
		return result;
	}
}
