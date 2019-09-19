package stackroute;

public class Q3 {
	int salary;
	public int age;
	public String name;
	public Q3(int s,int a,String n) {
		salary = s;
		age = a;
		name = n;
		System.out.println("Members name : "+ name +
				" Members age :"+ age +
				" Members salary :"+ salary);
	}
	
	public void display(Q3 input) {
		System.out.println("Members name : "+ input.name +
						"Members age : "+ input.age +
						"Members salary : "+ input.salary);
	}
	
}
