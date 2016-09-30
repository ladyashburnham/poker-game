/* 
   Mark Porter
   Program: Poker Game Part FLUSH
   Assignment: DETERMINE WHETHER IT'S A FLUSH
   November 5, 2015
*/


import java.util.Scanner ;


public class Flush

{//opening of class Flush


 public int displayFlush(int card1, int card2, int card3, int card4, int card5, int winner)

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
	String suitname = " ";
	
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

	if ((card1suit == card2suit) & (card1suit == card3suit) & (card1suit == card4suit) & (card1suit == card5suit))
	{
	if (card1suit == 1)
	suitname = "SPADES" ;
	else if  (card1suit == 2)
	suitname = "CLUBS" ;
	else if (card1suit == 3)
	suitname = "DIAMONDS" ;
	else if (card1suit == 4)
	suitname = "HEARTS" ;
	System.out.printf("\n   It is a %s FLUSH\n", suitname) ;
	winner =  1 ;
	}


	{
	return winner ;
	}
	


	

}//closing of main

}//closing of class Flush