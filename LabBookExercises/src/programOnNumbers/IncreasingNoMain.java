package programOnNumbers;

public class IncreasingNoMain {

	public static void main(String[] args) {
		IncreasingNoMain project = new IncreasingNoMain();
		boolean result = project.checkNumber(123456);
		if(result) {
			System.out.println("Given number is not an incresing number");
		}
		else {
			System.out.println("Given number is an increasing number");
		}

	}
	public boolean checkNumber(int val) {
		boolean flag=false;
		int i=0;
		int valArray[]=new int[6];
		while(val!=0) {
			valArray[i]=val%10;
			val/=10;
		}
		for(int j=1;j<valArray.length;j++ ) {
			if(valArray[j-1]>valArray[j]) {
				flag=true;
				break;
			}
		}
		return flag;
	}

}
