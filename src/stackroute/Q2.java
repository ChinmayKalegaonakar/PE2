package stackroute;

public class Q2 {
	public boolean isPower;
	public Q2(int n) { 
		isPower = isPowerOfFour(n);
	}
	static boolean isPowerOfFour(int n) { 
        return n != 0 && ((n&(n-1)) == 0) && (n & 0xAAAAAAAA) == 0; 
    } 
}
