package collections;

import java.util.*;

public class StudentMedalsEx4 {

	public static void main(String[] args) {
		StudentMedalsEx4 app = new StudentMedalsEx4();
		app.start();

	}
	void start() {
		Map<Integer,Integer>map=new HashMap<>();
		map.put(1, 95);
		map.put(2, 70);
		map.put(3,85);
		map.put(4, 78);
		map.put(5, 95);
		Map<Integer,String>result2=getStudents(map);
		List<Integer>list= new ArrayList<>(map.keySet());
		for(Integer regNo:list) {
			System.out.println("RegNo:"+regNo+"    MedalType:"+result2.get(regNo));
		}
	}
	Map<Integer,String> getStudents(Map<Integer,Integer> map){
		Map<Integer,String>students=new HashMap<>();
		List<Integer>list= new ArrayList<>(map.keySet());
		for(Integer regNo:list) {
			if(map.get(regNo)>=90) {
				students.put(regNo, "Gold");
			}
			else if(map.get(regNo)>=80 && map.get(regNo)<90) {
				students.put(regNo, "Silver");
			}
			else if(map.get(regNo)>=70 && map.get(regNo)<80) {
				students.put(regNo, "Bronze");
			}
			else {}
		}
		return students;
	}

}
