package programOnNumbers;

public class CalculateSumMain {

	public static void main(String[] args) {
		CalculateSumMain project = new CalculateSumMain();
		int sum = project.calculateSum(100);
		System.out.println("The sum is :" + sum);

	}

	public int calculateSum(int value) {
		int sum = 0;
		for (int i = 1; i <= value; i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				sum += i;
			} else if (i % 5 == 0 && i % 3 != 0) {
				sum += i;
			} else {
			}
		}
		return sum;

	}

}
