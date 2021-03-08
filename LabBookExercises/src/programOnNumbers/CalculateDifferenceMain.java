package programOnNumbers;

public class CalculateDifferenceMain {
	public static void main(String args[]) {
		CalculateDifferenceMain calculatedifference = new CalculateDifferenceMain();
		long difference = calculatedifference.calculateDifference(10);
		System.out.println("The difference is :" + difference);
	}

	public int calculateDifference(int value) {
		int squareSum = 0, sumSquare = 0;
		for (int i = 1; i <= value; i++) {
			squareSum += (i * i);
			sumSquare += i;
		}
		sumSquare *= sumSquare;
		System.out.println("The squareSum is :" + squareSum);
		System.out.println("The sumSqaure is :" + sumSquare);
		int diff = squareSum - sumSquare;
		return diff;
	}

}
