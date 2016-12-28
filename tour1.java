package p1;
public class tour1 extends destination implements tourdetails
{	int ch;
	double cost;
	
	public void accept_choice(int choice)
	{
		ch=choice;
	}
	public void display_package()
	{
	
	switch(ch)
	{
	case 1:
		{	cost =144499;
			System.out.println("\n\nITENARY for 8N/9D\nCities Covered :-\nCAPE TOWN\nOUDTSHOORN (THE FEATHER CAPITAL)\nKNYSNA (PEARL OF SCENIC GARDEN ROUTE)\nJOHANNESBURG\nSUN CITY\nDate : 21/12/15 to 29/12/15\nAccomadation :-\nCape Town - Capetonian Hotel\nOudtshoorn - Pearl Of Oudtshoorn Hotel\nKnysna - Gray wood Hotel\nSun City - Sun City Cabanas\nEmperor Palace - \nPeermont Metcourt\nTour Cost-INR 1,44,499/-\nArrive - Cape Town International Airport\nDeparture-Johannesburg Airport\nFlight- Economy Class");   
	
		}
	break;	
	case 2:
	{
		cost=160000;
		System.out.println("\n\nITENARY for 8N/9D\nCities Covered :-\nMelbourne\nCanberra\nSydney\n\nDate : 21/12/15 to 29/12/15\nAccomadation :-\nMelbourne - CapeTravelodge Southbank\nSydney - Rendezvous Studio Hotel Sydney Central\nTour Cost-INR 1,60,000/-\nArrive - Melbourne Airport\nDeparture- Sydney Airport\nFlight- Economy Class");  
	
	}
	break;
	case 3:
	{
		cost=81900;
		System.out.println("\n\nITENARY for 6N/7D\nCities Covered :-\nCappadocia\nIstanbul\nDate : 21/12/15 to 27/12/15\nAccomadation :-\nCappadocia -Yiltok Hotel\nIstanbul - Grand Hotel Halic\nTour Cost-INR 81,900/-\nArrive - Cappadocia Airport\nDeparture- Istanbul Airport\nFlight- Economy Class");
	
	}
	break;	
	case 4:
	{
		cost=114990;
		System.out.println("\n\nITENARY for 8N/9D\nCities Covered :-\nBudapest\nVienna\nPrague\nDate : 21/12/15 to 29/12/15\nAccomadation :-\nBudapest - BEST WESTERN Hotel Orion\nVienna - Hotel Mozart\nPrague - Ibis Praha Wenceslas Square\nTour Cost-INR 1,14,990/-\nArrive - Budapest Airport\nDeparture- Prague Airport\nFlight- Economy Class");
	
	}
	break;	
	case 5:
	{
		cost=100000;
		System.out.println("\n\nITENARY for 8N/9D\nCities Covered :-\nLondon\nEdinburgh\nGlasgow\nInverness\nDate : 21/12/15 to 29/12/15\nAccomadation :-\nLondon - Central Park Hotel\nEdinburg - Royal Terrace\nGlasgowHoliday Inn Express City Riverside\nInverness - Royal Highland Hotel\nTour Cost-INR 1,00,000/-\nArrive - London Heathrow Airport\nDeparture - Inverness Airport\nFlight- Economy Class");

	
	}
	break;
	default:System.out.println("Invalid choice");	
	}
	}
	public double calc()
	{
		return cost;
	} 
}