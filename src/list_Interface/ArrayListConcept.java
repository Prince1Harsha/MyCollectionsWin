package list_Interface;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) 
	{
		//1.Without generics
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Harsha");
		al.add(true);
		System.out.println(al);
		System.out.println("**************");
		System.out.println("Elements of Array list are:");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		//2.Set Arraylist value using set works only for existing to replace or else arrayindexoutofbounds exception
		al.set(2, "Suraj");
		System.out.println(al);
		
		Employee e1=new Employee("Harsha",28,"CSE");
		Employee e2= new Employee("Shree",27,"ECE");
		Employee e3 = new Employee("Suraj",30,"TCE");
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		Iterator<Employee> it = emp.iterator();
		while(it.hasNext())
		{
			Employee e = it.next();
			System.out.println(e.name+" "+e.age+" "+e.dept);
		}
	}

}
