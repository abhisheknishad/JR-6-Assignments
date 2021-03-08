package arrays;

public class DuplicateElementInArray {
	public static void main(String[] args) {
		int arr[]= {2,6,7,3,4,1,2,5,3,4};
		DuplicateElementInArray project1 = new DuplicateElementInArray();
		int A[]=project1.modifyArray(arr);
		
	}
	public int[] modifyArray (int array[]) {
		int Array[]= new int[array.length];
		for(int i=0;i<array.length;i++) {
			for(int j=1;j<array.length-1;j++) {
				if(array[j-1]>array[j]) {
					int temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;				
				}
			}
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(Array[i]+" ");
		}
		int j=0;
		for(int i=1;i<array.length;i++) {
			if(array[i-1]!=array[i]) {
				Array[j]=array[i-1];
				j++;
			}
		}
		
		return Array;
	}
}

