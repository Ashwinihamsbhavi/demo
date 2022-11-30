package Abstract1;

public class Prime {

	public static void main(String[] args) {
for(int j=2;j<=10;j++)
{
	int num=j;
	boolean flag = false;
for(int i=2;i<num;i++)	
{
	if(num%2==0)
	{
		flag=true;
		break;
	}
}
if(flag==false)
{
	System.out.println(num+" is a prime number");
	
}
else if(flag==true)
{
	System.out.println(num+" is not a prime number");
	
}
}
	}

}
