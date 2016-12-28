package p1;
public class tour2 extends destination implements tourdetails
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
			{
				cost=110000;
				System.out.println("ITENARY for 7N/8D\nCities Covered :-\nCAPE TOWN\nKNYSNA \nJOHANNESBURG\nSUN CITY\nDate : 21/12/15 to 28/12/15\nAccomadation :-\nCape Town - Capetonian Hotel\nKnysna - Gray wood Hotel\nSun City - Sun City Cabanas\nEmperor Palace - Peermont Metcourt\nTour Cost-INR 1,10,000/-\nArrive - Cape Town International Airport\nDeparture-Johannesburg Airport\nFlight- Economy Class");   
			
			}
			break;
			case 2:
			{
				cost=160000;
				System.out.println("ITENARY for 5N/6D\nCities Covered :-\nMelbourne\nBallarat\nWarnambool\nHalls Gap\nDate : 21/12/15 to 26/12/15\nAccomadation :-\nMelbourne - Hotel Grand Mercure \nBallarat - \nHalls Gap - Comfort Inn Country Plaza\nWarrnambool - Hotel Best Western Tudor Motor Inn\nTour Cost-INR 1,60,000/-\nArrive - Melbourne Airport\nDeparture- Sydney Airport\nFlight- Economy Class"); 			
			
			}
			break;
			case 3:
			{
				cost=83900;
				System.out.println("ITENARY for 5N/6D\nCities Covered :-\nCappadocia\nIstanbul\nDate : 21/12/15 to 26/12/15\nAccomadation :-\nCappadocia -Yiltok Hotel\nIstanbul - Grand Hotel Halic\nTour Cost-INR 83,900/-\nArrive - Cappadocia Airport\nDeparture- Istanbul Airport\nFlight- Economy Class");
			
			}
			break;
			case 4:
			{
				cost=94900;
				System.out.println("ITENARY for 6N/7D\nCities Covered :-\nBudapest\nVienna\nPrague\nDate : 21/12/15 to 27/12/15\nAccomadation :-\nBudapest - BEST WESTERN Hotel Orion\nVienna - Hotel Mozart\nPrague - Ibis Praha Wenceslas Square\nTour Cost-INR 94,990/-\nArrive - Budapest Airport\nDeparture-Budapest Airport\nFlight- Economy Class");
			
			}
			break;
			case 5:
			{
				cost=105000;
				System.out.println("ITENARY for 4N/5D\nCities Covered :-\nLondon\nManchester/nCardiff\nDublin\nDate : 21/12/15 to 29/12/15\nAccomadation :-\nLondon - Central Park Hotel\nEdinburg - Royal Terrace\nTour Cost-INR 1,05,000/-\nArrive - London Heathrow Airport\nDeparture - Inverness Airport\nFlight- Economy Class");	
			
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