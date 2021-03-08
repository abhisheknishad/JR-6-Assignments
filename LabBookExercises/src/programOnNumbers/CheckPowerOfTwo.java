package programOnNumbers;

public class CheckPowerOfTwo {

	public static void main(String[] args) {
		CheckPowerOfTwo start=new CheckPowerOfTwo();
		int input =32;
		boolean isPower=start.checkNumber(input);
		if(isPower) {
			System.out.println(input+" is power of 2");
		}
		else {
			System.out.println(input+" is not power of 2");
		}

	}
	public boolean checkNumber(int number) {
		for(int i=1;i<number;i++) {
			if(number==Math.pow(2, i)) {
				return true;
			}
		}
		return false;
	}

}
