/* 
   Mark Porter
   Program: Poker Game Part  FLUSH
   Assignment: DETERMINE WHETHER IT'S A STRAIGHT FLUSH
   November 5, 2015
*/


import java.util.Scanner ;


public class StraightFlush

{//opening of class StraightFlush


 public int displayStraightFlush(int card1, int card2, int card3, int card4, int card5, int winner)

	{
	int card1suit ;
	int card2suit ;
	int card3suit ;
	int card4suit ;
	int card5suit ;
	String card5num ;


	//IF CARDS ARE SORTED

		//SORT SUITS
	Suitsorter sortsomesuits = new Suitsorter();
	
	card1suit = sortsomesuits.getSuitsorter (card1) ;
	card2suit = sortsomesuits.getSuitsorter (card2) ;
	card3suit = sortsomesuits.getSuitsorter (card3) ;
	card4suit = sortsomesuits.getSuitsorter (card4) ;
	card5suit = sortsomesuits.getSuitsorter (card5) ;

	if ( (card2 == (card1 + 1)) & (card3 == (card1 + 2)) & (card4 == (card1 + 3)) & (card5 ==(card1 + 4)) & (card1suit == card2suit)& (card1suit == card3suit)& (card1suit == card4suit)& (card1suit == card5suit) & (card1suit == 1) )
	{
	card5num = sortsomesuits.getNumsorted(card5, card5suit) ;
	System.out.printf("\n   It is a Spades STRAIGHT FLUSH %s HIGH\n", card5num) ;
	winner =  1 ;
	
	}

	else if ( (card2 == (card1 + 1)) & (card3 == (card1 + 2)) & (card4 == (card1 + 3)) & (card5 ==(card1 + 4)) & (card1suit == card2suit)& (card1suit == card3suit)& (card1suit == card4suit)& (card1suit == card5suit) & (card1suit == 2) )
	{
	card5num = sortsomesuits.getNumsorted(card5, card5suit) ; 
	System.out.printf("\n   It is a Clubs STRAIGHT FLUSH %s HIGH\n", card5num) ;
	winner =  1 ;
	}

	else if ( (card2 == (card1 + 1)) & (card3 == (card1 + 2)) & (card4 == (card1 + 3)) & (card5 ==(card1 + 4)) & (card1suit == card2suit)& (card1suit == card3suit)& (card1suit == card4suit)& (card1suit == card5suit) & (card1suit == 3) )
	{
	card5num = sortsomesuits.getNumsorted(card5, card5suit) ; 
	System.out.printf("\n   It is a Diamonds STRAIGHT FLUSH %s HIGH\n", card5num) ;
	winner =  1 ;
	}
	
	else if ( (card2 == (card1 + 1)) & (card3 == (card1 + 2)) & (card4 == (card1 + 3)) & (card5 ==(card1 + 4)) & (card1suit == card2suit)& (card1suit == card3suit)& (card1suit == card4suit)& (card1suit == card5suit) & (card1suit == 4) )
	{
	card5num = sortsomesuits.getNumsorted(card5, card5suit) ; 
	System.out.printf("\n   It is a Hearts STRAIGHT FLUSH %s HIGH\n", card5num) ;
	winner =  1 ;
	}


	
	return winner ;
	
	


	

}//closing of main

}//closing of class STRAIGHTFlush