package collections;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;


public class ReverseArrayEx7 {

	public static void main(String[] args) {
		ReverseArrayEx7 app = new ReverseArrayEx7();
		app.start();
	}
	void start() {
		Integer Array[]= {56,89,42,32,78,10,19,78};
		List<Integer> resultArray=getSorted(Array);
		for(Integer ele:resultArray) {
			System.out.print(ele+" ");
			}
		
	}
	List<Integer> getSorted(Integer[] array) {
		List<Integer>list=Arrays.asList(array);
		List<String>list2=list.stream().map(s->s.toString().valueOf(s)).collect(Collectors.toList());
		Collections.sort(list2);
		Collections.reverse(list2);
		/*Collections.sort(Arrays.asList(array));
		Collections.reverse(Arrays.asList(array));
		*/
		list=list2.stream().map(s->Integer.valueOf(s)).collect(Collectors.toList());
		return list;
	}

}
