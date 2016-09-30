/*
   Mark Porter
   Leo Hayes High School
   Teacher: Mr. Brannon
   Assignment: make a method that assigns numbers 1-52 to card names
   November 3, 2015
*/


public class Cards
{//opening of class Cards

	
	//THE FOLLOWING IS THE VERY POINT OF CREATING YOUR OWN CLASSES AND METHODS
	//========================================================================

	//THIS CAN BE USED IN ANY FUTURE CARD GAMES

	//VAR LIST
	//========

	String suit ; 
	String number ; 
	int basenum ; 
	
	
	public void displaycards(int card) // 

	{//OPENING OF displaycards
	
	if (card <= 13) 
	
	suit = "Spades" ;

	else if (card <= 26)

	suit = "Clubs" ;

	else if (card <= 39)

	suit = "Diamonds" ; 

	else if (card <= 52)

	suit = "Hearts" ; 

	//end of suit sorting

	if (suit == "Spades") 
	
	{
	if (card == 0 + 1)
	
	number = "ACE";


	else if (card == 0 + 2)
	
	number = "2";


	else if (card == 0 + 3)
	
	number = "3";


	else if (card == 0 + 4)
	
	number = "4";


	else if (card == 0 + 5)
	
	number = "5";


	else if (card == 0 + 6)
	
	number = "6";


	else if (card == 0 + 7)
	
	number = "7";


	else if (card == 0 + 8)
	
	number = "8";

	else if (card == 0 + 9)
	
	number = "9" ;

	else if (card == 0 + 10)
	
	number = "10";

	else if (card == 0 + 11)
	
	number = "JACK";

	else if (card == 0 + 12)
	
	number = "QUEEN";

	else if (card == 0 + 13)
	
	number = "KING";
	}

	else if (suit == "Clubs") 

	{

	if (card == 13 + 1)
	
	number = "ACE";

	else if (card == 13 + 2)
	
	number = "2";

	else if (card == 13 + 3)
	
	number = "3";

	else if (card == 13 + 4)
	
	number = "4";

	else if (card == 13 + 5)
	
	number = "5";

	else if (card == 13 + 6)
	
	number = "6";

	else if (card == 13 + 7)
	
	number = "7";

	else if (card == 13 + 8)
	
	number = "8";

	else if (card == 13 + 9)
	
	number = "9";

	else if (card == 13 + 10)
	
	number = "10";

	else if (card == 13 + 11)
	
	number = "JACK";

	else if (card == 13 + 12)
	
	number = "QUEEN";

	else if (card == 13 + 13)
	
	number = "KING";

	}

	else if (suit == "Diamonds")

	{

	if (card == 26 + 1)
	
	number = "ACE" ;

	else if (card == 26 + 2)
	
	number = "2" ;

	else if (card == 26 + 3)
	
	number = "3" ;

	else if (card == 26 + 4)
	
	number = "4" ;

	else if (card == 26 + 5)
	
	number = "5" ;

	else if (card == 26 + 6)
	
	number = "6" ;

	else if (card == 26 + 7)
	
	number = "7";

	else if (card == 26 + 8)
	
	number = "8" ;

	else if (card == 26 + 9)
	
	number = "9";

	else if (card == 26 + 10)
	
	number = "10";

	else if (card == 26 + 11)
	
	number = "JACK" ;

	else if (card == 26 + 12)
	
	number = "QUEEN";

	else if (card == 26 + 13)
	
	number = "KING";
	}

	else if (suit == "Hearts")

	{

	if (card == 39 + 1)
	
	number = "ACE";


	else if (card == 39 + 2)
	
	number = "2";

	else if (card == 39 + 3)
	
	number = "3";

	else if (card == 39 + 4)
	
	number = "4";

	else if (card == 39 + 5)
	
	number = "5";

	else if (card == 39 + 6)
	
	number = "6";

	else if (card == 39 + 7)
	
	number = "7";

	else if (card == 39 + 8)
	
	number = "8";

	else if (card == 39 + 9)
	
	number = "9";

	else if (card == 39 + 10)
	
	number = "10";

	else if (card == 39 + 11)
	
	number = "JACK";

	else if (card == 39 + 12)
	
	number = "QUEEN";

	else if (card == 39 + 13)
	
	number = "KING";
	}

	System.out.printf ("\n\n     %s of %s\n\n", number, suit) ;
 
	

	}//closing of displaycards



}//CLOSING OF CLASS CARDS



		
		