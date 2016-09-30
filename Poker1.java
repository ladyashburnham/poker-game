/* 
   Mark Porter
   Program: Poker Game Part 2
   Assignment: Create the hand of 5 different numbers bewteen 1-52
   October 30, 2015
*/


import java.util.Scanner ;


public class Poker1

{//opening of class poker


	public static void main (String[]args)

{//opening of main

		//DECLARE AND INITIALIZE VARIABLES


	//===========================================
	
	//VAR LIST
	//========

	String play;
	int card1 = 0 ;
	int card2 = 0 ;
	int card3 = 0 ;
	int card4 = 0 ;
	int card5 = 0 ;
	int card6 = 0 ;
	int card7 = 0 ;
	int card8 = 0 ;
	int card9 = 0 ;
	int card10 = 0 ;
	double counthands = 0 ; 
	int winner1 = 0 ;
	int winner2 = 0 ;
	int score1 = 0;
	int score2 = 0 ;
	double money = 0 ; 
	double bet = 0 ; 

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
	
		//DECLARE AND INTITIALIZE SOME COUNTING VARIABLES
		//================================================
		
		//VAR LIST
		//========
		
		double avghands = 0 ;
		double timeswon = 0 ;
		double totalhands = 0 ;
		



	


	//CREATE NEW SCANNER CLASS

	Scanner input = new Scanner (System.in) ;


	System.out.print ("\n        GET READY TO GAMBLE!\n") ;
	System.out.print ("        ====================") ;

	//GET INPUT

	System.out.print ("\n\n    Hit ENTER to play, or type exit to quit!:   ") ;

	//ACCEPT INPUT

	play = input.nextLine() ; 


	System.out.print ("\n    How much are you bringing to the table?:   ") ;
	
	money = input.nextDouble() ; 


	//WHILE LOOP IF THEY DON'T EXIT

	while (!play.equalsIgnoreCase("Exit")) 


	{//opening of while loop

	//NO NEED TO NMPORT MATH CLASS BECAUSE THIS IS ALREADY IN THE JAVA.LANG API WHICH IS IMPORTED BY DEFAULT


	//GENERATE FIRST CARD NUMBER BETWEEN 1 AND 52

	//KEEP PRODUCING NEW HANDS UNTIL A WINNER OCCURS


	
	//opening of generateing hands loops


	card1 = (int)(Math.random() * 52) + 1 ;

	//System.out.printf("\n   First card is:  %d\n", card1) ;

	//GENERATE SECOND CARD NUMBER

	card2 = (int)(Math.random() * 52) + 1 ;



	while(card2 == card1) 

	{
	
	//IF THEY ARE THE SAME MAKE NEW VALUE
	
	card2 =  (int)(Math.random() * 52) + 1 ;
	

	}

	//PRINT THE "DIFFERENT"  CARD TO SCREEN

	//System.out.printf("\n   Second card is:  %d\n", card2) ;



	//GENERATE THIRRD


	card3 = (int)(Math.random() * 52) + 1 ;

	while((card3 == card1) || (card3 == card2))

	{
	
	//IF THEY ARE THE SAME MAKE NEW VALUE
	
	card3 = (int)(Math.random() * 52) + 1 ;
	

	}

	//PRINT THE "DIFFERENT" CARD TO SCREEN

	//System.out.printf("\n   Third card is:  %d\n", card3) ;



	//GENERATE FOURTH

	card4 = (int)(Math.random() * 52) + 1 ;

	while((card4 == card1) || (card4 == card2) || (card4 == card3))

	{
	
	//IF THEY ARE THE SAME MAKE NEW VALUE
	
	card4 = (int)(Math.random() * 52) + 1 ;
	

	}

	//PRINT THE "DIFFERENT"  CARD TO SCREEN

	//System.out.printf("\n   Fourth card is:  %d\n", card4) ;

	
	//GENERATE FIFTH

	card5 = (int)(Math.random() * 52) + 1 ;

	while((card5 == card1) || (card5 == card2) || (card5 == card3) || (card5 == card4))

	{
	
	//IF THEY ARE THE SAME MAKE NEW VALUE
	
	card5 = (int)(Math.random() * 52) + 1 ;
	

	}
	
	//GENERATE SIXTH
		card6 = (int)(Math.random() * 52) + 1 ;

	while((card6 == card1) || (card6 == card2) || (card6 == card3) || (card6 == card4) || (card6 == card5))

	{
	
	//IF THEY ARE THE SAME MAKE NEW VALUE
	
	card6 = (int)(Math.random() * 52) + 1 ;
	

	}
	//GENERATE SEVENTH
		card7 = (int)(Math.random() * 52) + 1 ;

	while((card7 == card1) || (card7 == card2) || (card7 == card3) || (card7 == card4) || (card7 == card5) || (card7 == card6))

	{
	
	//IF THEY ARE THE SAME MAKE NEW VALUE
	
	card7 = (int)(Math.random() * 52) + 1 ;
	

	}
	
		//GENERATE EIGHTH
		card8 = (int)(Math.random() * 52) + 1 ;

	while((card8 == card1) || (card8 == card2) || (card8 == card3) || (card8 == card4) || (card8 == card5) ||(card8 == card6) || (card8 == card7))

	{
	
	//IF THEY ARE THE SAME MAKE NEW VALUE
	
	card8 = (int)(Math.random() * 52) + 1 ;
	

	}
			//GENERATE NINTH
		card9 = (int)(Math.random() * 52) + 1 ;

	while((card9 == card1) || (card9 == card2) || (card9 == card3) || (card9 == card4) || (card9 == card5) || (card9 == card6) || (card9 == card7) || (card9 == card8))

	{
	
	//IF THEY ARE THE SAME MAKE NEW VALUE
	
	card9 = (int)(Math.random() * 52) + 1 ;
	

	}
	
				//GENERATE TENTH
		card10 = (int)(Math.random() * 52) + 1 ;

	while((card10 == card1) || (card10 == card2) || (card10 == card3) || (card10 == card4) || (card10 == card6) || (card10 == card7) || (card10 == card8) || (card10 == card9))

	{
	
	//IF THEY ARE THE SAME MAKE NEW VALUE
	
	card10 = (int)(Math.random() * 52) + 1 ;
	

	}
	
				//get score

	Checker getChecker = new Checker();
	
	System.out.print ("\n    Player hand:\n\n") ; 
	
	score1 = getChecker.displayChecker (card1, card2, card3, card4, card5, winner1) ;
	
	System.out.print("\n\n   How much would you like to bet?(Type 0 to fold):   ") ; 

	bet = input.nextDouble() ;
	
	
	if (bet == 0)
	{
	System.out.print ("\n   Ok!   \n") ; 
	}
	else
	
	{
	
	
	
	
	System.out.print ("\n    Computer hand:\n\n") ; 
	
	score2 = getChecker.displayChecker (card6, card7, card8, card9, card10, winner2) ;
	
	if (score2 > score1)
	{
	System.out.print("\n\n   +++++++++++++++++++++++++++++\n") ;
	System.out.print("   +  Computer is the winner!  +\n") ;
	System.out.print("   +++++++++++++++++++++++++++++\n\n") ; 
	money = money - bet ; 
	}
	else if (score1 > score2)
	{
	System.out.print("\n\n   +++++++++++++++++++++++++++\n") ;
	System.out.print("   +  Player is the winner!  +\n") ;
	System.out.print("   +++++++++++++++++++++++++++\n\n") ;
	money = money + bet ; 
	}
	else 
	{
	System.out.print("\n\n   ++++++++++++++++++++++++++++++++++++\n") ;
	System.out.print("   +  It's a tie.. everybody win! :)  +\n") ;
	System.out.print("   ++++++++++++++++++++++++++++++++++++\n\n") ;
	money = money + (bet/2) ;
	}
	System.out.print ("\n\n****************************************************\n\n") ; 
	System.out.printf ("\n\n    You now have $%.2f to gamble with.\n\n", money )  ; 
	//PRINT THE "DIFFERENT"  CARD TO SCREEN

	//System.out.printf ("\n   Fifth card is:  %d\n", card5) ;



	//PUT 5 NUMBERS IN ORDER FROM LOW TO HIGH

		//SORT FIRST TWO CARDS INTO ORDER


	//TEST NUMBERS

	/*
	card1 = 1;
	card2 = 10;
	card3 = 11;
	card4 = 12;
	card5 = 13;


	*/

	//PRINT IT
/*
	System.out.printf ("\n   First card is:  %d\n", card1) ;

	System.out.printf ("\n   Second card is:  %d\n", card2) ;

	System.out.printf ("\n   Third card is:  %d\n", card3) ;
	
	System.out.printf ("\n   Fourth card is:  %d\n", card4) ;

	System.out.printf ("\n   Fifth card is:  %d\n", card5) ;

		*/

	
	//INCREMENT COUNThadns

	//counthands = counthands + 1 ; 

	

	
	/*if (winner == 0)
	
	{
		//1. ROYAL FLUSH

	RoyalFlush getRoyalFlush = new RoyalFlush();
	
	winner = getRoyalFlush.displayRoyalFlush (card1, card2, card3, card4, card5, winner) ;
	
	}
	
	if (winner == 0)
	
	{
		//2.  STRAIGHT FLUSH

	StraightFlush getStraightFlush = new StraightFlush();
	
	winner = getStraightFlush.displayStraightFlush (card1, card2, card3, card4, card5, winner) ;
	
	}
	
		if (winner == 0)
	
	{
		//3. FOUR OF A KIND

	FourKind getFourKind = new FourKind();
	
	winner = getFourKind.displayFourKind (card1, card2, card3, card4, card5, winner) ;
	
	}
	
			if (winner == 0)
	
	{
		//4. FULL HOUSE

	FullHouse getFullHouse = new FullHouse();
	
	winner = getFullHouse.displayFullHouse (card1, card2, card3, card4, card5, winner) ;
	
	} 
	if (winner == 0)
		{
		//5. FLUSH

	Flush getFlush = new Flush();
	
	winner = getFlush.displayFlush (card1, card2, card3, card4, card5, winner) ;
	
	} 
	if (winner == 0)
			{
		//6. STRAIGHT

	Straight getStraight = new Straight();
	
	winner = getStraight.displayStraight (card1, card2, card3, card4, card5, winner) ;
	
	} 
	
	if (winner == 0)
		{
		//7. ThreeKind

	ThreeKind getThreeKind = new ThreeKind();
	
	winner = getThreeKind.displayThreeKind (card1, card2, card3, card4, card5, winner) ;
	
	} 
	if (winner == 0)
	{
			//8. TwoPair

	TwoPair getTwoPair = new TwoPair();
	
	winner = getTwoPair.displayTwoPair (card1, card2, card3, card4, card5, winner) ;
	
	} 
	if (winner == 0)
	{
			//9. Pair

	Pair getPair = new Pair();
	
	winner = getPair.displayPair (card1, card2, card3, card4, card5, winner) ;
	
	} 
	if (winner == 0)
		{
			//10. HighCard

	HighCard getHighCard = new HighCard();
	
	winner = getHighCard.displayHighCard (card1, card2, card3, card4, card5, winner) ;
	
	} 
	}//closing of generate hands loop
	
	timeswon = timeswon + 1 ;
	totalhands = totalhands + counthands ;
	avghands = totalhands / timeswon ;
	
	winner = 0 ;
		Cards getcards = new Cards() ; 
	
	getcards.displaycards(card1);
	getcards.displaycards(card2);
	getcards.displaycards(card3);
	getcards.displaycards(card4);
	getcards.displaycards(card5);
	
	
	
	System.out.printf ("\n   Total hands played : %.2f", counthands) ;
	System.out.printf ("\n    Times Won:  %.2f", timeswon) ;
	System.out.printf("\n     Average Hands Played: %.2f", avghands) ;
	counthands = 0 ;
	//AGAIN?
	*/
	}
	System.out.print ("\n\n    Hit ENTER to play, or type exit to quit!:   ") ;

	//ACCEPT INPUT
	score1 = 0 ;
	score2 = 0 ;
	bet = 0 ;
	play = input.nextLine(); 
	play = input.nextLine() ; 
	
	
	


		


	
}//closing of while loop	

	if (money < 0)
	System.out.print ("\n   YOU STILL OWE THE HOUSE MONEY!\n\n") ;
	else 
	System.out.print ("\n   Goodbye!\n\n") ;
}//closing of main

}//closing of class poker