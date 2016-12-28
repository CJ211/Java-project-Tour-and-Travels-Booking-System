import java.io.*;
import java.util.*;
import p1.*;
import p2.*;

class datamain
{
	public static void main(String args[])
	{

		
		int i;
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		System.out.println();
		System.out.println("                            *******WELCOME TO S&J TRAVELS*******");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Please give us the following details to enable us to expedite your reservation");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("ENTER NUMBER OF INDIVIDUAL/S");
		int n=sc1.nextInt();
		customer c[]=new customer[n];
		System.out.println();
		for(i=0;i<n;i++)
		{
			System.out.println("ENTER YOUR NAME");
			String nm=sc.nextLine();
			System.out.println();
			System.out.println("ENTER DATE OF BIRTH");
			String dob=sc.nextLine();			
			System.out.println();
			System.out.println("ENTER ADDRESS");
			String ad=sc.nextLine();
			System.out.println();
			System.out.println("ENTER COUNTRY");
			String cc=sc.nextLine();
			System.out.println();
			System.out.println("ENTER CITY");
			String ci=sc.nextLine();
			System.out.println();
			System.out.println("ENTER CONTACT NUMBER");
			long cn=sc2.nextLong();
			System.out.println();
			System.out.println("ENTER YOUR email id ");
			String em=sc.nextLine();
			System.out.println();
			System.out.println("ENTER MEDICAL ISSUE IF ANY ");
			String mi=sc.nextLine();
			System.out.println();
			System.out.println("ANY SPECIFIC REQUIREMENT");
			String cr=sc.nextLine();
			System.out.println();			
			c[i]=new customer();
			c[i].acceptdata(nm,dob,ad,cc,ci,cn,em,mi,cr);
			System.out.println();
		
		}

		destination d1=new destination();
		d1.acceptnum(n);
		d1.dest();	
		System.out.println(); 
		
		for(i=0;i<n;i++)
		{
			c[i].display_customer();	
		
		}
			
		System.out.println("                     ***********THANK YOU FOR VISTING US************");
		System.out.println();
		System.out.println();
		System.out.println("                                For more details contact : 8652251112/9167167055");	}
}

