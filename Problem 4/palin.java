public class palin
{ 

	private static int check_palin(int num)
	{	
		int backup = num;
		int reverse = 0;
		if(num<10)
			return 1;
		if(num%10 == 0)
			return 0;
		while(num >= 1)	
		{
			reverse = reverse*10 + num%10;
			num = num/10;
		}
		if(backup == reverse)
			return 1;
		else
			return 0;	
	}

	public static void main(String[] agrs)
	{
		int test1 = 100;
		int test2 = 999;
		int largest = 0;

		for(int i = test1; i <= test2; i++)		
		{
			for(int j = test1; j <= test2; j++)
			{
				if(check_palin(i*j) ==  1)
					{
					 if(largest <= i*j)					
					 	largest = i*j;
					}
			}
		}
		System.out.printf("%d is the largest palindrome found in the test range.\n", largest);
	}
}
