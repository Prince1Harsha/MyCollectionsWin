package comparable_comparator;

public class Employee implements Comparable<Employee>
{
	String name;
	int rollno;
	int age;
	
	public Employee(String name,int rollno,int age)
	{
		this.name=name;
		this.age=age;
		this.rollno=rollno;
	}
	
	public int compareTo(Employee e)
	{
		if(age==e.age)
			return 0;
		else if(age>e.age)
			return 1;
		else 
			return -1;
	}
}
