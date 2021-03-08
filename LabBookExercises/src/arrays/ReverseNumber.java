package arrays;

public class ReverseNumber {

	public static void main(String[] args) {
		ReverseNumber project= new ReverseNumber();
		int arr[]= {2,6,7,3,4,1};
		ReverseNumber project1 = new ReverseNumber();
		int A[]=project1.getSorted(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(A[i]+" ");
		}
	}
	public int[] getSorted(int array[]) {
		int Array[]= new int[array.length];
		for(int i=0;i<array.length;i++) {
			Array[i]=array[array.length-i-1];
		}
		return Array;
	}
}