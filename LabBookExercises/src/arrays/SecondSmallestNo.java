package arrays;

public class SecondSmallestNo {

	public static void main(String[] args) {
		int arr[]= {2,6,7,3,4,1};
		SecondSmallestNo project = new SecondSmallestNo();
		int secondSmallestNo=project.getSecondSmallest(arr); 
		System.out.println("Second Smallest No is "+secondSmallestNo);
	}
	public int getSecondSmallest(int array[]) {
		int temp;
		for(int i=0;i<array.length;i++) {
			for(int j=1;j<array.length-i;j++) {
				if(array[j-1]>array[j]) {
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}
		return array[1];
	}

}
