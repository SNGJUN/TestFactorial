
public class FactorialLoop {

	public void FactorialLoop1(int n) {
		
		int factorial = 1;
		
		for(int i = 1 ; i < n+1 ; i ++) {
			factorial *= i;
		}
		
		System.out.println(factorial);
	}

}
