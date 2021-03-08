package collections;

import java.util.*;

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMapEx1 app = new HashMapEx1();
		app.start();

	}
	void start() {
		Map<Integer,String>map= new HashMap<>();
		map.put(4, "Anil");
		map.put(2, "Abhishek");
		map.put(1, "Raghav");
		map.put(3, "Akash");
		List<String>sortedList=getValues(map);		
		System.out.println(sortedList);
	}
	
	List<String> getValues(Map map){
		Collection<String>values=map.values();
		List<String>list=new ArrayList<>(values);
		Collections.sort(list);
		return list;
	}

}
