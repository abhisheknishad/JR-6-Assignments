package collections;

import java.util.*;

public class GetSecondSmallestEx5 {

	public static void main(String[] args) {
		GetSecondSmallestEx5 app = new GetSecondSmallestEx5();
		app.start();
	}
	void start() {
		Integer Array[]= {56,89,42,32,78,10,19,78};
		int secondSmallest=getSecondSmallest(Array);
		System.out.print("Second Smallest Number is: "+ secondSmallest);
	}
	int getSecondSmallest (Integer[] array) {
		List<Integer>list= new ArrayList<>(Arrays.asList(array));
		Collections.sort(list);
		return list.get(1);
	}

}
