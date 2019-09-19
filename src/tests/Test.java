package tests;



import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import stackroute.*;
class Test {

	
	@org.junit.jupiter.api.Test
	void question_1_test() {
		Q1 q = new Q1("chinmay");
	    assertEquals("Palindrome test",q.reverse,"yamnihc");
	}
	@org.junit.jupiter.api.Test
	void question_2_test() {
		Q2 q = new Q2(64);
	    assertEquals("Four power test",q.isPower,true);
	}
	@org.junit.jupiter.api.Test
	void question_3_test() {
		Q3 q = new Q3(1000,20,"chinmay");
	    assertEquals("member class test",q.age,20);
	}
	@org.junit.jupiter.api.Test
	void question_4_test() {
		Q4 q = new Q4();
	    assertEquals("even test",q.isEven(100),true);
	}
	@org.junit.jupiter.api.Test
	void question_5_test() {
		Q5 q = new Q5(new int[]{50,50,50,50});
	    assertEquals("average test",50.0,q.average,0);
	}
	@org.junit.jupiter.api.Test
	void question_6_test() {
		Q6 q = new Q6();
	    assertEquals("factorial test",120,q.factorial_int(5),0);
	}
	@org.junit.jupiter.api.Test
	void question_7_test() {
		User q = null;
		try {
			q = new User("chinmay","k",22,1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    assertEquals("age test",q.isValidAge(67),false);
	}
	
}
