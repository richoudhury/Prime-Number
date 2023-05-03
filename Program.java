public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 11;
		int flag = 0;
		for (int i = 2; i <= num/2; i++)
		{
			if (num%i == 0)
			{
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.println("The entered number is a prime number: " + num);
		}
		else
		{
			System.out.println("The entered number is not a prime number: " + num);
		}
	}
}
