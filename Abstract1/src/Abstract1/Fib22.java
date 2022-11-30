package Abstract1;

public class Fib22 {
	static void fibo(int fibo1,int fibo2)
	{int fib3;
	int fib1;
	int fib2;
	System.out.println(fib1+" "+fib2+" ");
	for( int i=1;i<=10;i++)
{
	fib3=fib1+fib2;
	fib1=fib2;
	fib2=fib3;
	System.out.println(fib3+" ");
	

}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
fibo(0,1);
	}

}
