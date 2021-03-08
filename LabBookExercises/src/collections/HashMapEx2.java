package collections;

import java.util.*;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMapEx2 app = new HashMapEx2();
		app.start();

	}
	void start() {
		char[] arr= {'a','c','e','g','c','b','e','a','e','b','d'};
		Map<Character,Integer>map=countChars(arr);
		List<Character>list=new ArrayList<>(map.keySet());
		List<Integer>list1=new ArrayList<>(map.values());
		for(char element:list) {
			System.out.println(element+" "+map.get(element));
			
		}
	}
	Map<Character,Integer> countChars(char arr[]){
		Map<Character,Integer>map=new HashMap<>();
		for(char element:arr) {
			if(map.containsKey(element)) {
				map.put(element, map.get(element)+1);
			}
			else {
				map.put(element,1);
			}
		}
		return map;
	}

}
