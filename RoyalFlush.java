/* 
   Mark Porter
   Program: Poker Game Part ROYAL FLUSH
   Assignment: DETERMINE WHETHER IT'S A ROYAL FLUSH
   November 5, 2015
*/


import java.util.Scanner ;


public class RoyalFlush

{//opening of class RoyalFlush


 public int displayRoyalFlush(int card1, int card2, int card3, int card4, int card5, int winner)

	{
	


	//IF CARDS ARE SORTED 

	if ((card1 == 1) & (card2 == 10) & (card3 == 11) & (card4 == 12) & (card5 ==13))
	{
	
	System.out.println("\n   It is a Spades ROYAL FLUSH\n") ;
	winner =  1 ;
	}

	else if ((card1 == 14) & (card2 == 23) & (card3 == 24) & (card4 == 25) & (card5 == 26))
	{
	System.out.println("\n   It is a Clubs ROYAL FLUSH\n") ;
	winner =  1 ;
	}

	else if ((card1 == 27) & (card2 == 36) & (card3 == 37) & (card4 == 38) & (card5 == 39))
	{
	System.out.println("\n   It is a Diamonds ROYAL FLUSH\n") ;
	winner =  1 ;
	}
	
	else if ((card1 == 40) & (card2 == 49) & (card3 == 50) & (card4 == 51) & (card5 == 52))
	{
	System.out.println("\n   It is a Hearts ROYAL FLUSH\n") ;
	winner =  1 ;
	}


	{
	return winner ;
	}
	


	

}//closing of main

}//closing of class RoyalFlush