/* 
   Mark Porter
   Program: Poker Game Part THREE OF A KIND
   Assignment: DETERMINE WHETHER IT'S A THREE OF A KIND
   November 5, 2015
*/


import java.util.Scanner ;


public class ThreeKind

{//opening of class ThreeKind


 public int displayThreeKind(int card1, int card2, int card3, int card4, int card5, int winner)

	{
			int card1suit ;
	int card2suit ;
	int card3suit ;
	int card4suit ;
	int card5suit ;
	String card1num ;
	String card2num ; 
	String card3num ;
	String card4num ;
	String card5num ;
	String suitname ;
	
	Suitsorter sortsomesuits = new Suitsorter();
	
	card1suit = sortsomesuits.getSuitsorter (card1) ;
	card2suit = sortsomesuits.getSuitsorter (card2) ;
	card3suit = sortsomesuits.getSuitsorter (card3) ;
	card4suit = sortsomesuits.getSuitsorter (card4) ;
	card5suit = sortsomesuits.getSuitsorter (card5) ;

	card1num = sortsomesuits.getNumsorted(card1, card1suit) ;
	card2num = sortsomesuits.getNumsorted(card2, card2suit) ;
	card3num = sortsomesuits.getNumsorted(card3, card3suit) ;
	card4num = sortsomesuits.getNumsorted(card4, card4suit) ;
	card5num = sortsomesuits.getNumsorted(card5, card5suit) ;
 

	//IF CARDS ARE SORTED 

	if	((card1num.equalsIgnoreCase(card2num)) & (card1num.equalsIgnoreCase(card3num))  )
	{
	
	System.out.printf("\n   It is a %sS THREE OF A KIND\n", card1num) ;
		winner =  sortsomesuits.getNumsortedint(card1,card1suit) ;
	}

	else if ((card1num.equalsIgnoreCase(card2num)) & (card1num.equalsIgnoreCase(card4num)) )
	{
	System.out.printf("\n   It is a %sS THREE OF A KIND\n", card1num) ;
		winner =  sortsomesuits.getNumsortedint(card1,card1suit) ;
	}

	else if ((card1num.equalsIgnoreCase(card4num)) & (card1num.equalsIgnoreCase(card3num)) )
	{
	System.out.printf("\n   It is a %sS THREE OF A KIND\n", card1num) ;
		winner =  sortsomesuits.getNumsortedint(card1,card1suit) ;
	}
	
	else if ((card2num.equalsIgnoreCase(card4num)) & (card2num.equalsIgnoreCase(card3num)) )
	{
	System.out.printf("\n   It is a %sS THREE OF A KIND\n", card2num) ;
		winner =  sortsomesuits.getNumsortedint(card1,card1suit) ;
	}
	
	else if ((card1num.equalsIgnoreCase(card2num)) & (card1num.equalsIgnoreCase(card5num)) )
	{
	System.out.printf("\n   It is a %sS THREE OF A KIND\n", card1num) ;
		winner =  sortsomesuits.getNumsortedint(card1 ,card1suit) ;
	}
	else if ((card1num.equalsIgnoreCase(card3num)) & (card1num.equalsIgnoreCase(card5num)) )
	{
	System.out.printf("\n   It is a %sS THREE OF A KIND\n", card1num) ;
		winner =  sortsomesuits.getNumsortedint(card1 ,card1suit) ;
	}
	else if ((card2num.equalsIgnoreCase(card3num)) & (card2num.equalsIgnoreCase(card5num)) )
	{
	System.out.printf("\n   It is a %sS THREE OF A KIND\n", card2num) ;
		winner =  sortsomesuits.getNumsortedint(card2,card2suit) ;
	}
	else if ((card1num.equalsIgnoreCase(card4num)) & (card1num.equalsIgnoreCase(card5num)) )
	{
		System.out.printf("\n   It is a %sS THREE OF A KIND\n", card1num) ;
		winner =  sortsomesuits.getNumsortedint(card1 ,card1suit) ;
	}
	else if ((card2num.equalsIgnoreCase(card4num)) & (card2num.equalsIgnoreCase(card5num)) )
	{
		System.out.printf("\n   It is a %sS THREE OF A KIND\n", card2num) ;
		winner =  sortsomesuits.getNumsortedint(card2 ,card2suit) ;
	}
	else if ((card3num.equalsIgnoreCase(card4num)) & (card3num.equalsIgnoreCase(card5num)) )
	{
		System.out.printf("\n   It is a %sS THREE OF A KIND\n", card3num) ;
		winner =  sortsomesuits.getNumsortedint(card3 ,card3suit) ;
	}
	{
	return winner ;
	}
	


	

}//closing of main

}//closing of class ThreeKind