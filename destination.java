package p1;
import java.util.*;

public class destination
{
	int ch,n,ch2;
	double total;
	public void acceptnum(int num)
	{
		n=num;
	}
	public void dest()
	{	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose you preferred destination");
		System.out.println("1.South Africa");
		System.out.println("2.Australia");
		System.out.println("3.Istanbul");
		System.out.println("4.Europe");
		System.out.println("5.United Kingdom");
		ch=sc.nextInt();
		System.out.println("Chose your convenient Tour Package");
		tour1 t1=new tour1();
		tour2 t2=new tour2();
		t1.accept_choice(ch);
		t2.accept_choice(ch);
		System.out.println();
		System.out.println();
		System.out.println("PACKAGE 1");
		System.out.println();
		t1.display_package();
		System.out.println();
		System.out.println();
		System.out.println("PACKAGE 2");
		System.out.println();
		t2.display_package();
		System.out.println();
		System.out.println("Choose preferred package\nPackage 1\nPackage 2");
		int ch1=sc.nextInt();
		System.out.println("You have selected package no "+ ch1);
		
		if (ch1==1)
		{
			
			t1.display_package();
		}
		
		else
		{
			t2.display_package();
		}
		
		switch(ch1)
		{
			case 1:total=n*t1.calc();
			break;
			case 2:total=n*t2.calc();
			break;
			
		}
		System.out.println();
		System.out.println("Additional 5% discount on credit/debit card");
		System.out.println("Do you wish to pay by credit/debit card?\n1.YES\n2.NO");
		ch2=sc.nextInt();
		if(ch2==1)
		total=total-(0.05*total);
		System.out.println("The total cost of your trip is INR "+total+"/-");
	}
}
