package map_Interface;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) 
	{
		HashMap<Integer,Employee> hm = new HashMap<Integer,Employee>();
		Employee e1 = new Employee("Harsha",23,"QA");
		Employee e2 = new Employee("Shree",28,"Dev");
		Employee e3 = new Employee("Harsha",29,"SystemAdmin");
		Employee e4 = new Employee("Harsha",30,"Software");

		hm.put(0,e1);
		hm.put(1,e2);
		hm.put(2,e3);
		hm.put(3, e4);
		
		for(Entry<Integer,Employee> e:hm.entrySet())
		{
			int key = e.getKey();
			Employee value = e.getValue();
			System.out.println("Employee info"+key);
			System.out.println(value.name+" "+value.age+" "+value.dept);
		}
		

	}

}
