package FilesPractice;

import java.util.ArrayList;
import java.util.Scanner;

class Atm extends Exception
{
	public Atm(String s)
	{
		super(s);
	}
}

public class ExceptionforATM {
public static void main(String[] args) {
	
	ArrayList<String> cardno=new ArrayList<>();
	cardno.add("1122334455");
	cardno.add("2233445566");
	
	ArrayList<String> password = new ArrayList<>();
	password.add("12333");
	password.add("12344");
	
	ArrayList<Integer> balence=new ArrayList<>();
	balence.add(150000);
	balence.add(200000);
	
	Scanner sc = new Scanner(System.in);
	
  try
  {
	  System.out.println("Enter your cardno: ");
	  String card=sc.nextLine();
	  if(cardno.contains(card))
	  {
		  int index = cardno.indexOf(card);
		  System.out.println("choose 1-for cash withdraw"+"2-for Balence enquiry"+"3-for Money deposit"+"4-for Exit");
	  
	  int n=sc.nextInt();
	  sc.nextLine();
	  switch(n)
	  {
	  case 1:
	System.out.println("Enter amount to withdraw :");
	int withdraw=sc.nextInt();
	sc.nextLine();
	if(balence.get(index)>=withdraw)
	{
		System.out.println("Enter your password:");
		String pass=sc.nextLine();
		if(password.get(index).equals(pass))
		{
			int cutbal=balence.get(index)-withdraw;
			System.out.println(withdraw+"is Debited ");
			balence.set(index, cutbal);
			System.out.println("Current balence is : "+balence.get(index));		
		}
		else
		{
			throw new Atm ("Password incorrect");
		}
	}
	else
	{
		throw new Atm("Insufficient funds");
	}
	break;
	  case 2 :
		  System.out.println("Enter your password :");
		  String ps=sc.nextLine();
		 if(password.get(index).equals(ps))
		 {
			 System.out.println("Your account balence is :"+balence.get(index));
		 }
		 else
		 {
			 throw new Atm("Incorrect Password");
		 }
		 break;
	  case 3 :
		  System.out.println("Enter amount to deposit : ");
		  int dep=sc.nextInt();
		  sc.nextLine();
		  System.out.println("Enter your password :");
		  String ps1=sc.nextLine();
		  if(password.get(index).equals(ps1))
		  {
			  int upbal=balence.get(index)+dep;
			  balence.set(index, upbal);
			  System.out.println("Current balence is :"+balence.get(index));
		  }
		  else
		  {
			  throw new Atm("password incorrect ");
		  }
		  break;
	  case 4:
		  System.exit(0);
		  default:
			  System.out.println("choose valid option");		 
	  }	  
	  }
	  else
	  {
		  throw new Atm("Card not Valid");
	  }
  }
  catch(Exception e)
  {
	  System.out.println(e);
  }
}
}
