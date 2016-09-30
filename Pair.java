/* 
   Mark Porter
   Program: Poker Game Part PAIR
   Assignment: DETERMINE WHETHER IT'S A PAIR
   November 5, 2015
*/


import java.util.Scanner ;


public class Pair

{//opening of class Pair


 public int displayPair(int card1, int card2, int card3, int card4, int card5, int winner)

	{
	//SWEET SWEET VARIABLES
	int card1suit ;
	int card2suit ;
	int card3suit ;
	int card4suit ;
	int card5suit ;
	
	int card1num ;
	int card2num ; 
	int card3num ;
	int card4num ;
	int card5num ;
	String cardname ; 
	
	
	Suitsorter sortsomesuits = new Suitsorter();
	
	card1suit = sortsomesuits.getSuitsorter (card1) ;
	card2suit = sortsomesuits.getSuitsorter (card2) ;
	card3suit = sortsomesuits.getSuitsorter (card3) ;
	card4suit = sortsomesuits.getSuitsorter (card4) ;
	card5suit = sortsomesuits.getSuitsorter (card5) ;

	card1num = sortsomesuits.getNumsortedint(card1, card1suit) ;
	card2num = sortsomesuits.getNumsortedint(card2, card2suit) ;
	card3num = sortsomesuits.getNumsortedint(card3, card3suit) ;
	card4num = sortsomesuits.getNumsortedint(card4, card4suit) ;
	card5num = sortsomesuits.getNumsortedint(card5, card5suit) ;
	

	//IF CARDS ARE SORTED 

	
	
	
	
	if	(card4num==(card5num))
	{
	cardname = sortsomesuits.getNumsorted(card4num, 1) ;
	System.out.printf("\n   It is a PAIR OF %sS\n", cardname) ;
	winner =  card5num ;
	}

	else if (card3num==(card5num))
	{
	cardname = sortsomesuits.getNumsorted(card3num, 1) ;
	System.out.printf("\n   It is a PAIR OF %sS\n", cardname) ;
	winner =  card5num ;
	}

	else if (card2num==(card5num))
	{
	cardname = sortsomesuits.getNumsorted(card2num, 1) ;
	System.out.printf("\n   It is a PAIR OF %sS\n", cardname) ;
	winner =  card5num ;
	}
	else if (card1num==(card5num))
	{
	cardname = sortsomesuits.getNumsorted(card1num, 1) ;
	System.out.printf("\n   It is a PAIR OF %sS\n", cardname) ;
	winner =  card5num ;
	}
	else if (card3num==(card4num))
	{
	cardname = sortsomesuits.getNumsorted(card3num, 1) ;
	System.out.printf("\n   It is a PAIR OF %sS\n", cardname) ;
	winner =  card4num ;
	}
	else if (card2num==(card4num))
	{
	cardname = sortsomesuits.getNumsorted(card2num, 1) ;
	System.out.printf("\n   It is a PAIR OF %sS\n", cardname) ;
	winner =  card4num ;
	}
	else if (card1num==(card4num))
	{
	cardname = sortsomesuits.getNumsorted(card1num, 1) ;
	System.out.printf("\n   It is a PAIR OF %sS\n", cardname) ;
	winner =  card4num ;
	}
	else if (card2num==(card3num))
	{
	cardname = sortsomesuits.getNumsorted(card3num, 1) ;
	System.out.printf("\n   It is a PAIR OF %sS\n", cardname) ;
	winner =  card3num ;
	}
	else if (card1num==(card3num))
	{
	cardname = sortsomesuits.getNumsorted(card3num, 1) ;
	System.out.printf("\n   It is a PAIR OF %sS\n", cardname) ;
	winner =  card3num ;
	}
	else if (card1num == card2num)
	{
	cardname = sortsomesuits.getNumsorted(card1num, 1) ;
	System.out.printf("\n   It is a PAIR OF %sS\n", cardname) ;
	winner =  card2num ;
	}
	if (winner == 1)
	{
	winner = 14 ;
	}
	
	return winner ;
	
	


	

}//closing of main

}//closing of class Pair