
public class FactorialRecursive {
	
	public int FactorialRecursive1(int n) {
		
		if(n == 1)
			return 1;
		else
			return n * FactorialRecursive1(n-1);
		
	}
}
