package arraylist;

import java.util.ArrayList;

public class arrayList{
	public static void main(String[] args) {
		ArrayList<Employee> arraylist=new ArrayList<Employee>();
		arraylist.add(new Employee(101,"Ep1",30000));
		arraylist.add(new Employee(102,"Ep2",40000));
		arraylist.add(new Employee(103,"Ep3",80000));
		for(Employee i:arraylist)
		{
			System.out.println(i);
		}
		
	}
	
}
