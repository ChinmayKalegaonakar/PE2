package stackroute;
import java.util.*;

public class Exercise_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		Exercise_2 ex2 = new Exercise_2();
		while(true) {
			ex2.drawMenu();
			n = sc.nextInt();
			ex2.selector(n);
		}
		
	}
	public void selector(int input) {
		Scanner sc = new Scanner(System.in);
		String inputString="";
		int n=0,m=0;
		long l =0;
		int[] intArray;
		switch(input) {
		
		case 1:System.out.print("Enter a String to check for palindrome");
				inputString = sc.nextLine();
				Q1 question1 = new Q1(inputString);
				//Q1 answer1 = question1.question1(question1);
				System.out.println("Normal String : "+question1.normal+"\nReversed String : "+question1.reverse+"\n Is it a palindrome? "+question1.palindrome);
				break;
		case 2:System.out.print("Enter a number to check for power of four");
				n = sc.nextInt();
				Q2 question2 = new Q2(n);
				System.out.println("Is it a power of four : "+question2.isPower);break;
		case 3:System.out.println("Enter name");
				inputString = sc.nextLine();
				System.out.println("Enter age");
				n = sc.nextInt();
				System.out.println("Enter Salary");
				m = sc.nextInt();
				Q3 question3 = new Q3(m,n,inputString);break;
		case 4: System.out.print("Enter a number to check for even");
				n = sc.nextInt();
				Q4 question4 = new Q4();
				System.out.println("Is it Even : "+question4.isEven(n));break;
		case 5: System.out.print("Enter size : ");
				n = sc.nextInt();
				intArray = new int[n];
				m=0;
				while(n-->0) {
					System.out.print("Enter marks of student "+m+" : ");
					intArray[m++]=sc.nextInt();
				}
				Q5 question5 = new Q5(intArray);
				System.out.println("Average marks "+question5.average+" Minimum Marks "+question5.min+" Maximum Marks "+ question5.max);break;
		case 6: System.out.println("Enter for int : ");
				n = sc.nextInt();
				System.out.println("Enter for long : ");
				l = sc.nextLong();
				Q6 question6 = new Q6();
				System.out.println("Factorial for int : "+ question6.factorial_int(n));
				System.out.println("Factorial for long : "+ question6.factorial_long(l));break;
		case 7:System.out.println("Enter name : ");
				inputString = sc.nextLine();
				System.out.println("Enter age : ");
				n = sc.nextInt();
				System.out.println("Enter salary : ");
				m = sc.nextInt();
			try {
				User question7 = new User(inputString.split(" ")[0],inputString.split(" ")[1],n,m);
				System.out.println(question7.getFullName());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); 
			}
			break;
		default:System.out.println("Wrong input ------- exiting");break;
		}
	}
	public void drawMenu() {
		System.out.println("---------EXERCISE 2------------");
		System.out.println("| 1 - Question 1 palindrome   |");
		System.out.println("| 2 - Question 2 four power   |");
		System.out.println("| 3 - Question 3 member class |");
		System.out.println("| 4 - Question 4 isEven       |");
		System.out.println("| 5 - Question 5 grades       |");
		System.out.println("| 6 - Question 6 factorial    |");
		System.out.println("| 7 - Question 7 user class   |");
		System.out.println("-------------------------------");
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("| ENTER YOUR CHOICE           |");
		System.out.println("-------------------------------");
	}
}
