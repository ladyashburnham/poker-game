	/* 
   Mark Porter
   Program: Poker Game Part checker
   Assignment: DETERMINE WHETHER IT'S A weiner
   November 5, 2015
*/


import java.util.Scanner ;


public class Checker

{//opening of class HIGH CARD


 public int displayChecker(int card1, int card2, int card3, int card4, int card5, int winner)

 
	{
	
	int score = 0 ;
	
			//DECLARE AND INITIALIZE SORTING VARIABLES

	//==================================================

	//VAR LIST
	//========
	
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
	
	
		if (card2 < card1)

	{
		ac1 = card2 ;
		ac2 = card1 ;

	}

	else
	

	{
		ac1 = card1 ; 
		ac2 = card2 ; 
	}

		//SORT FIRST THREE CARDS INTO ORDER

	if (card3 < ac1)

	{
		bc1 = card3 ;
		bc2 = ac1 ;
		bc3 = ac2 ;
	}

	else if (card3<ac2)

	{
		bc1 = ac1 ;
		bc2 = card3 ;
		bc3 = ac2 ;
	}
			
	else
	
	{
		bc1 = ac1 ;
		bc2 = ac2 ;
		bc3 = card3 ; 
	}

		//SORT FIRST FOUR CARDS INTO ORDER

	if (card4 < bc1)

	{
		cc1 = card4 ;
		cc2 = bc1 ;
		cc3 = bc2 ;
		cc4 = bc3 ;
	}

	else if (card4 < bc2)
	
	{
		cc1 = bc1 ;
		cc2 = card4 ;
		cc3 = bc2 ; 
		cc4 = bc3 ;
	}

	else if (card4 < bc3)

	{
		cc1 = bc1 ;
		cc2 = bc2 ;
		cc3 = card4 ;
		cc4 = bc3 ;
	}


	else

	{
		cc1 = bc1 ;
		cc2 = bc2 ; 
		cc3 = bc3 ;
		cc4 = card4 ;
	}

		//SORT FIRST FIVE CARDS INTO ORDER

	if (card5 < cc1)

	{

		dc1 = card5 ; 
		dc2 = cc1 ; 
		dc3 = cc2 ; 
		dc4 = cc3 ; 
		dc5 = cc4 ;

	}

	else if (card5 < cc2)

	{
		dc1 = cc1 ;
		dc2 = card5 ; 
		dc3 = cc2 ; 
		dc4 = cc3 ;
		dc5 = cc4 ;
	}

	else if (card5 < cc3)

	{
		dc1 = cc1 ; 
		dc2 = cc2 ; 
		dc3 = card5 ; 
		dc4 = cc3 ; 
		dc5 = cc4 ; 
	}  

	else if (card5 < cc4)

	{

		dc1 = cc1 ; 
		dc2 = cc2 ; 
		dc3 = cc3 ;
		dc4 = card5 ; 
		dc5 = cc4 ; 
	}

	else 

	{
		dc1 = cc1 ; 
		dc2 = cc2 ; 
		dc3 = cc3 ;
		dc4 = cc4 ; 
		dc5 = card5 ; 

	}

	//PUT BACK INTO OLD VARIABLES

	card1 = dc1 ; 
	card2 = dc2 ;
	card3 = dc3 ;
	card4 = dc4 ;
	card5 = dc5 ; 
	
	
	if (winner == 0)
	
	{
		//1. ROYAL FLUSH

	RoyalFlush getRoyalFlush = new RoyalFlush();
	
	winner = getRoyalFlush.displayRoyalFlush (card1, card2, card3, card4, card5, winner) ;
	if (winner > 0)
	{
	score = 900 ; 

	}
	}
	
	if (winner == 0)
	
	{
		//2.  STRAIGHT FLUSH

	StraightFlush getStraightFlush = new StraightFlush();
	
	winner = getStraightFlush.displayStraightFlush (card1, card2, card3, card4, card5, winner) ;
	if (winner > 0)
	{
	score = 800 ; 

	}
	
	}
	
		if (winner == 0)
	
	{
		//3. FOUR OF A KIND

	FourKind getFourKind = new FourKind();
	
	winner = getFourKind.displayFourKind (card1, card2, card3, card4, card5, winner) ;
		if (winner > 0)
	{
	score = 700 + winner; 

	}
	
	}
	
			if (winner == 0)
	
	{
		//4. FULL HOUSE

	FullHouse getFullHouse = new FullHouse();
	
	winner = getFullHouse.displayFullHouse (card1, card2, card3, card4, card5, winner) ;
		if (winner > 0)
	{
	score = 600 + winner; 

	}
	} 
	if (winner == 0)
		{
		//5. FLUSH

	Flush getFlush = new Flush();
	
	winner = getFlush.displayFlush (card1, card2, card3, card4, card5, winner) ;
		if (winner > 0)
	{
	score = 500 + winner; 

	}
	} 
	if (winner == 0)
			{
		//6. STRAIGHT

	Straight getStraight = new Straight();
	
	winner = getStraight.displayStraight (card1, card2, card3, card4, card5, winner) ;
		if (winner > 0)
	{
	score = 400  + winner; 

	}
	} 
	
	if (winner == 0)
		{
		//7. ThreeKind

	ThreeKind getThreeKind = new ThreeKind();
	
	winner = getThreeKind.displayThreeKind (card1, card2, card3, card4, card5, winner) ;
		if (winner > 0)
	{
	score = 300 + winner; 

	}
	} 
	if (winner == 0)
	{
			//8. TwoPair

	TwoPair getTwoPair = new TwoPair();
	
	winner = getTwoPair.displayTwoPair (card1, card2, card3, card4, card5, winner) ;
		if (winner > 0)
	{
	score = 200  + winner; 

	}
	} 
	if (winner == 0)
	{
			//9. Pair

	Pair getPair = new Pair();
	
	winner = getPair.displayPair (card1, card2, card3, card4, card5, winner) ;
		if (winner > 0)
	{
	if (winner == 1)
	{
	winner = 14 ;
	}
	score = 100 + winner ; 

	}
	}
	
	
	if (winner == 0)
	
	{
			//10. HighCard

	HighCard getHighCard = new HighCard();
	
	score = getHighCard.displayHighCard (card1, card2, card3, card4, card5, winner) ;
	

	
	}
	
	winner = 0 ;
	Cards getcards = new Cards() ; 
	
	getcards.displaycards(card1);
	getcards.displaycards(card2);
	getcards.displaycards(card3);
	getcards.displaycards(card4);
	getcards.displaycards(card5);
	
	 return score;
	
	
	} 
	
	

	

	

	
}//closing of main

