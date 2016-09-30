/* 
   Mark Porter
   Program: Poker Game Part 1
   Assignment: Create the hand of 5 different numbers bewteen 1-52
   October 30, 2015
*/


import java.util.Scanner ;


public class Poker

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
	int counthands = 0 ; 




	//CREATE NEW SCANNER CLASS

	Scanner input = new Scanner (System.in) ;


	System.out.print ("\n        GET READY TO GAMBLE!\n") ;
	System.out.print ("        ====================") ;

	//GET INPUT

	System.out.print ("\n\n    Hit ENTER to play, or type exit to quit!:   ") ;

	//ACCEPT INPUT

	play = input.nextLine(); 



	//WHILE LOOP IF THEY DON'T EXIT

	while(!play.equalsIgnoreCase("Exit")) ;


	{//opening of while loop

	//NO NEED TO NMPORT MATH CLASS BECAUSE THIS IS ALREADY IN THE JAVA.LANG API WHICH IS IMPORTED BY DEFAULT


	//GENERATE FIRST CARD NUMBER BETWEEN 1 AND 52


	card1 = (int)(Math.random() * 52) + 1 ;

	System.out.printf("\n   First card is:  %d\n", card1) ;

	//GENERATE SECOND CARD NUMBER

	card2 = (int)(Math.random() * 52) + 1 ;

	while(card2 == card1) 

	{
	
	//IF THEY ARE THE SAME MAKE NEW VALUE
	
	card2 = (int)(Math.random() * 52) + 1 ;
	

	}

	//PRINT THE "DIFFERENT"  CARD TO SCREEN

	System.out.printf("\n   Second card is:  %d\n", card2) ;



	//GENERATE THIRRD


	card3 = (int)(Math.random() * 52) + 1 ;

	while((card3 == card1) || (card3 == card2))

	{
	
	//IF THEY ARE THE SAME MAKE NEW VALUE
	
	card3 = (int)(Math.random() * 52) + 1 ;
	

	}

	//PRINT THE "DIFFERENT" CARD TO SCREEN

//	System.out.printf("\n   Third card is:  %d\n", card3) ;



	//GENERATE FOURTH

	card4 = (int)(Math.random() * 52) + 1 ;

	while((card4 == card1) || (card4 == card2) || (card4 == card3))

	{
	
	//IF THEY ARE THE SAME MAKE NEW VALUE
	
	card4 = (int)(Math.random() * 52) + 1 ;
	

	}

	//PRINT THE "DIFFERENT"  CARD TO SCREEN

	//System.out.printf("\n   Fourth card is:  %d\n", card4) ;

	
		

	card4 = (int)(Math.random() * 52) + 1 ;

	while((card5 == card1) || (card5 == card2) || (card5 == card3) || (card5 == card4))

	{
	
	//IF THEY ARE THE SAME MAKE NEW VALUE
	
	card5 = (int)(Math.random() * 52) + 1 ;
	

	}

	//PRINT THE "DIFFERENT"  CARD TO SCREEN

	//System.out.printf ("\n   Fifth card is:  %d\n", card5) ;


		

	
	//INCREMENT COUNThadns

	counthands = counthands + 1 ; 

	System.out.printf ("   Total hands played : %d", counthands) ;









	

}//closing of while loop	


	

}//closing of main

}//closing of class poker