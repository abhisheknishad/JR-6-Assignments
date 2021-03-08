package collections;

import java.util.*;

public class HashMapEx3 {

	public static void main(String[] args) {
		HashMapEx3 app = new HashMapEx3();
		app.start();

	}
	void start() {
		List<Integer>list= new ArrayList<>();
		list.add(2);
		list.add(5);
		list.add(8);
		list.add(4);
		list.add(7);
		list.add(4);
		Map<Integer,Integer>map=getSquares(list);
		List<Integer>list1=new ArrayList<>(map.keySet());
		for(Integer element:list1) {
			System.out.println("Element:"+element+" Squared Value:"+map.get(element));
		}
	}
	Map<Integer,Integer> getSquares(List<Integer>list){
		Map<Integer,Integer>map=new HashMap<>();
		for(Integer element:list) {
			map.put(element, element*element);
		}
		return map;
		
	}

}
