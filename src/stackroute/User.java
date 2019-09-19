package stackroute;

public class User {
	
		 String firstName;
		 String lastName;
		 int age;
		 int salary;
		 public User(String fn, String ln, int a, int s) throws Exception {
			 firstName = fn;
			 lastName = ln;
			 age = a;
			 salary = s;
			 if(!isValidAge(age)) {
				 throw new Exception("age is invalid");
			 }
			 
		 }
		 public boolean isValidAge(int n) {
			 return (n>=18 && n<=60)?true:false;
		 }
		 public String getFullName() {
			 return firstName+" "+lastName;
		 }
	

}

