package DSA;

public class fibonacciSeries {

	public int fibonacciEquationValue(int n )
	{
		if(n ==0)
		{
			return 0;
		}
		
		if(n==1)
		{
			return 1;
		}
		
		// this is to get 0 first Iteration
		int leftEquation_Node = fibonacciEquationValue(n-1);
		
		//this is to get 1 for first Iteration 
		int RightEquation_Node = fibonacciEquationValue(n-2);
		
		return leftEquation_Node + RightEquation_Node;
		
		
	}
	
	
	public void printFibonacciSeries(int getRequiredNumber)
	{
		int result = this.fibonacciEquationValue(getRequiredNumber);
		System.out.print(result + " ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fibonacciSeries f = new fibonacciSeries();
		f.printFibonacciSeries(0);
		f.printFibonacciSeries(1);
		f.printFibonacciSeries(2);
		f.printFibonacciSeries(3);
		f.printFibonacciSeries(4);
		f.printFibonacciSeries(10);
		

	}

}
