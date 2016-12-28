
package p2;

public class customer
{
	String name,address,email,date_birth,medical_issue,specific_requirement,country,city;
	long contact_no;
	public void acceptdata(String nm,String dob,String ad,String cc,String ci,long cn,String em,String mi,String cr)
	{
		name=nm;
		address=ad;
		email=em;
		date_birth=dob;
		medical_issue=mi;
		contact_no=cn;
		specific_requirement=cr;	
		country=cc;
		city=ci;
	}
	
	public void display_customer()
	{
	
		System.out.print("NAME : "+name+"\nDATE OF BIRTH : "+date_birth+"\nADDRESS : "+address+"\nCOUNTRY : "+country+"\nCITY : "+city+"\nCONTACT NUMBER : "+contact_no+"\nEMAIL ID : "+email+"\nMEDICAL ISSUE : "+medical_issue+"\nSPECIAL REQUEST : "+specific_requirement);
			System.out.println();
			System.out.println();
			System.out.println();
	}
}

			