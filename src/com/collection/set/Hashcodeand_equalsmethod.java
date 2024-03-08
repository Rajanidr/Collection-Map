package com.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
class Employee{
	
	
	int empId;
	String empName;
	float empsalary;
	public Employee(int empId, String empName, float empsalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empsalary = empsalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empsalary=" + empsalary + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(empId, empName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(empName, other.empName);
	}
	
	
}

public class Hashcodeand_equalsmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set=new HashSet<String>();
		set.add("Rajani");
		set.add("Roni");
		set.add(null);
		set.add("bujju");
		set.add("Rajani");
		set.add(null);
		System.out.println("HashSet:"+set);
		
		Employee emp1=new Employee(1,"Eshwar",5000f);
		Employee emp2=new Employee(1,"Venky",6000f);
		Employee emp3=new Employee(2,"Arun",7000f);
		Employee emp4=new Employee(2,"Padam",5000f);
		Employee emp5=new Employee(1,"Eshwar",5000f);
		
		System.out.println("emp1 and emp2:"+emp1.equals(emp2));
		System.out.println("emp1 hashcode:"+emp1.hashCode());
		System.out.println("emp2 hashcode:"+emp2.hashCode());
		
		System.out.println("emp1 and emp4:"+emp1.equals(emp4));
		System.out.println("emp1 hashcode:"+emp1.hashCode());
		System.out.println("emp4 hashcode:"+emp4.hashCode());
		System.out.println("emp1 and emp5:"+emp1.equals(emp5));
		//System.out.println("emp5 hashcode:"+emp5.hashCode());
		
		Set<Employee> emps=new HashSet<Employee>();
		
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		emps.add(emp4);
		emps.add(emp5);
		
		System.out.println("Employee Values:"+emps.size());
		
		Iterator<Employee> i=emps.iterator();
		while(i.hasNext()) {
			System.out.println("print all values one by one:"+i.next());
			
		}
		
		
		
		
	}

	
}
