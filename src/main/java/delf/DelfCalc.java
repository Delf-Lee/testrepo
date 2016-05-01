package delf;

public class DelfCalc {
	private int result;

	public void add(int a, int b) {
		result = a + b;
	}
	
	public void sub(int a, int b) {
		result = a - b;
	}
	
	public int getResult() {
		return result;
	}
}
