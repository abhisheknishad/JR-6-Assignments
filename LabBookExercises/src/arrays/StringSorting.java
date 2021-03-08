package arrays;
public class StringSorting {

	public static void main(String[] args) {
		String arrayStrings[]= {"ABHISHEK","john","anil","RAM","SHYAM",};
		StringSorting project = new StringSorting();
		project.sortString(arrayStrings);
		System.out.println("Sorted Elements are of String:");
		for(String element:arrayStrings) {
			System.out.print(element+" ");
		}

	}
	public String[] sortString(String StringArr[]) {
		int length=StringArr.length;
		for(int i=0;i<length;i++) {
			for(int j=1;j<length-i;j++) {
				if((StringArr[j-1].compareTo(StringArr[j]))>=1) {
					String temp;
					temp=StringArr[j-1];
					StringArr[j-1]=StringArr[j];
					StringArr[j]=temp;
				}
			}
		}
		return StringArr;
	}

}
