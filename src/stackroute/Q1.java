package stackroute;

//import java.lang.*; 

public class Q1 {
	
	public String reverse;
	public String normal;
	public boolean palindrome;
	
	public Q1(String input) {
		normal = input;
		StringBuffer sb = new StringBuffer(input);
		reverse = sb.reverse().toString();
		if(normal.equals(reverse)) {
			palindrome=true;
		} else {
			palindrome=false;
		}
	}
	
	public Q1 question1(Q1 input) {
		StringBuffer sb = new StringBuffer(""+input.normal);
		input.reverse = sb.reverse().toString();
		if(input.normal.equals(input.reverse)) {
			input.palindrome=true;
		} else {
			input.palindrome=false;
		}
		return input;
	}
}
