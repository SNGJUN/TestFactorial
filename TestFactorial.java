import java.util.Scanner;

public class TestFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("N°ª ÀÔ·Â : ");
		int n = sc.nextInt();
		
		FactorialLoop fl = new FactorialLoop();
		//fl.FactorialLoop(n);
	
		FactorialRecursive f2 = new FactorialRecursive();
		System.out.println(f2.FactorialRecursive1(n));
		
	}

}
