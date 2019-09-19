package stackroute;

public class Q6 {

	public int factorial_int( int n) 
	{ 
	    if (n == 0) 
	    return 1; 
	    return n * factorial_int(n - 1); 
	}
	
	public long factorial_long(long n)
	{
		 if (n == 0) 
			 return 1; 
		 return n * factorial_long(n - 1); 
	}
}
