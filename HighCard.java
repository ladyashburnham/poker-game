/* 
   Mark Porter
   Program: Poker Game Part HIGH CARD
   Assignment: DETERMINE WHETHER IT'S A HIGH CARD
   November 5, 2015
*/


import java.util.Scanner ;


public class HighCard

{//opening of class HIGH CARD


 public int displayHighCard(int card1, int card2, int card3, int card4, int card5, int winner)

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
	String card5name ; 
	String card1name ; 
	
	int ac1 = 0 ;
	int ac2 = 0 ;

	int bc1 = 0 ;
	int bc2 = 0 ;
	int bc3 = 0 ;

	int cc1 = 0 ;
	int cc2 = 0 ;
	int cc3 = 0 ;
	int cc4 = 0 ;

	int dc1 = 0 ;
	int dc2 = 0 ;
	int dc3 = 0 ;
	int dc4 = 0 ;
	int dc5 = 0 ;
	
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
	
	

		//PUT 5 NUMBERS IN ORDER FROM LOW TO HIGH

		//SORT FIRST TWO CARDS INTO ORDER
	//==========================================================================================================
	if (card2num < card1num)

	{
		ac1 = card2num ;
		ac2 = card1num ;

	}

	else
	

	{
		ac1 = card1num ; 
		ac2 = card2num ; 
	}

		//SORT FIRST THREE CARDS INTO ORDER

	if (card3num < ac1)

	{
		bc1 = card3num ;
		bc2 = ac1 ;
		bc3 = ac2 ;
	}

	else if (card3num<ac2)

	{
		bc1 = ac1 ;
		bc2 = card3num ;
		bc3 = ac2 ;
	}
			
	else
	
	{
		bc1 = ac1 ;
		bc2 = ac2 ;
		bc3 = card3num ; 
	}

		//SORT FIRST FOUR CARDS INTO ORDER

	if (card4num < bc1)

	{
		cc1 = card4num ;
		cc2 = bc1 ;
		cc3 = bc2 ;
		cc4 = bc3 ;
	}

	else if (card4num < bc2)
	
	{
		cc1 = bc1 ;
		cc2 = card4num ;
		cc3 = bc2 ; 
		cc4 = bc3 ;
	}

	else if (card4num < bc3)

	{
		cc1 = bc1 ;
		cc2 = bc2 ;
		cc3 = card4num ;
		cc4 = bc3 ;
	}


	else

	{
		cc1 = bc1 ;
		cc2 = bc2 ; 
		cc3 = bc3 ;
		cc4 = card4num ;
	}

		//SORT FIRST FIVE CARDS INTO ORDER

	if (card5num < cc1)

	{

		dc1 = card5num ; 
		dc2 = cc1 ; 
		dc3 = cc2 ; 
		dc4 = cc3 ; 
		dc5 = cc4 ;

	}

	else if (card5num < cc2)

	{
		dc1 = cc1 ;
		dc2 = card5num ; 
		dc3 = cc2 ; 
		dc4 = cc3 ;
		dc5 = cc4 ;
	}

	else if (card5num < cc3)

	{
		dc1 = cc1 ; 
		dc2 = cc2 ; 
		dc3 = card5num ; 
		dc4 = cc3 ; 
		dc5 = cc4 ; 
	}  

	else if (card5num < cc4)

	{

		dc1 = cc1 ; 
		dc2 = cc2 ; 
		dc3 = cc3 ;
		dc4 = card5num ; 
		dc5 = cc4 ; 
	}

	else 

	{
		dc1 = cc1 ; 
		dc2 = cc2 ; 
		dc3 = cc3 ;
		dc4 = cc4 ; 
		dc5 = card5num ; 

	}

	//PUT BACK INTO OLD VARIABLES

	card1num = dc1 ; 
	card2num = dc2 ;
	card3num = dc3 ;
	card4num = dc4 ;
	card5num = dc5 ; 

	
	//====================================================================
	card5name = sortsomesuits.getNumsorted(card5num, 1) ;
	card1name = sortsomesuits.getNumsorted(card1num, 1) ;
	//IF CARDS ARE SORTED 

	if (card1num == 1)
	{
	System.out.printf("\n   It is a %s HIGH CARD\n", card1name) ;
	winner =  14;
	
	}
	else
	{
	System.out.printf("\n   It is a %s HIGH CARD\n", card5name) ;
	winner =  card5num ;
	}

	
	return winner ; 
	
	

}//closing of main

}//closing of class HIGH CARD