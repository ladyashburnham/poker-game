/* 
   Mark Porter
   Program: Poker Game Part  SUIT SORTER
   Assignment: DETERMINE WHAT SUIT
   November 5, 2015
*/


import java.util.Scanner ;


public class Suitsorter

{//opening of class SUITSORTER
	int basenum = 0 ;
	String number ;
	int intnumber = 0;
 public int getSuitsorter(int card)
	{
	String suit ; 
	int suitnum = 0 ;
	
	if (card <= 13) 
	{
	suit = "Spades" ;
	suitnum = 1;

	}
	else if (card <= 26)
	{
	suit = "Clubs" ;
	suitnum = 2 ;

	}
	else if (card <= 39)
	{
	suit = "Diamonds" ; 
	suitnum = 3 ;

	}
	else if (card <= 52)
	{
	suit = "Hearts" ; 
	suitnum = 4 ;

	}

	return suitnum ;

	}
	
public String getNumsorted(int card, int suitnum)
	
	 
		{
		if (suitnum == 1)
		basenum = 0;
		else if (suitnum == 2)
		basenum = 13 ; 
		else if (suitnum == 3)
		basenum = 26 ; 
		else if (suitnum == 4)
		basenum = 39 ; 

	if (card == basenum + 1)
	
	number = "ACE";

	else if (card == basenum + 2)
	
	number = "2";

	else if (card == basenum + 3)
	
	number = "3";

	else if (card == basenum + 4)
	
	number = "4";

	else if (card == basenum + 5)
	
	number = "5";

	else if (card == basenum + 6)
	
	number = "6";

	else if (card == basenum + 7)
	
	number = "7";

	else if (card == basenum + 8)
	
	number = "8";

	else if (card == basenum + 9)
	
	number = "9";

	else if (card == basenum + 10)
	
	number = "10";

	else if (card == basenum + 11)
	
	number = "JACK";

	else if (card == basenum + 12)
	
	number = "QUEEN";

	else if (card == basenum + 13)
	
	number = "KING";
	
	return number ; 
	}
public int getNumsortedint(int card, int suitnum)
{

		
		if (suitnum == 1)
		basenum = 0;
		else if (suitnum == 2)
		basenum = 13 ; 
		else if (suitnum == 3)
		basenum = 26 ; 
		else if (suitnum == 4)
		basenum = 39 ; 

	if (card == basenum + 1)
	
	intnumber = 1;

	else if (card == basenum + 2)
	
	intnumber = 2;

	else if (card == basenum + 3)
	
	intnumber = 3;

	else if (card == basenum + 4)
	
	intnumber = 4;

	else if (card == basenum + 5)
	
	intnumber = 5;

	else if (card == basenum + 6)
	
	intnumber = 6;

	else if (card == basenum + 7)
	
	intnumber = 7;

	else if (card == basenum + 8)
	
	intnumber = 8;

	else if (card == basenum + 9)
	
	intnumber = 9;

	else if (card == basenum + 10)
	
	intnumber = 10;

	else if (card == basenum + 11)
	
	intnumber = 11;

	else if (card == basenum + 12)
	
	intnumber = 12;

	else if (card == basenum + 13)
	
	intnumber = 13;
	
	{
	return intnumber ; 
	}
}

}//closing of class suitsorter