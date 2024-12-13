package Arrays;

public class Perfectnumbers {
public static void main(String[] args) {
	int a[]= {6,7,9,4,88,55,41,28,128};
	for(int num : a)
	{
		int sum=0;
		
		for(int i=1;i<num;i++)
		{
			if(num % i == 0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println(num+ " is Perfect number");
		}
	}
}
}
