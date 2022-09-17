import java.util.Random;
import java.util.Scanner;

public class RockPaperSciccsor 
{

	public static void main(String[] args) 
	{
		System.out.println("\n***+******+******+******+******+******+******+******+**");
		System.out.println("                       WELCOME                        ");
		System.out.println("\t\t\t TO");	
	    System.out.println           ("\t\tRock---Paper---Scissor");	
	    System.out.println("\t\t        Game");	
	    System.out.println("******+******+******+******+******+******+******+******\n");	
		
	    
	    System.out.println(" 0 == Rock");	
	    System.out.println(" 1 == Paper");	
	    System.out.println(" 2 == Scissor\n");
	    
	    int cop_move;
	    int my_move;
	    int cop_win=0; 
	    int my_win=0;
	    int draw=0;
	    int play=1;
	   
	    /*
	          Its a 5 match tournament.
	     */
	    String na[]= {"0","1","2"};															//String			
	    while(true) 
	     { 
	    	while(play<=5)																    //while loop
	     	{
	           try { 																	 	// try
	           cop_move=new Random().nextInt(na.length);
	    	   System.out.println(" Please Enter your Move( 0 or 1 or 2 ): ");
	    	   my_move=new Scanner(System.in).nextInt();                                    // Input Statement
	    	   
	    	  
	    	  
	    	   
	    	   
	    	   if (!(my_move==0 || my_move==1 || my_move==2) )
	    	   {
	    		   System.out.println(" Invalid input,Please Enter valid input");
	    		   break;
	    	   }
	    	 

	    	  
	    	   
	    	   
	    	   
	    	   
	    	    switch (my_move)															 //Conditional Statement (switch case)
	            {
	     	      case 0 -> System.out.println(" Player pick : Rock");
	     	      case 1 -> System.out.println(" Player pick : Paper");
	     	      case 2 -> System.out.println(" Player pick : Scissor");
	     	      
	     	    }
	    	    switch (cop_move)
	    	    {
	     	      case 0 -> System.out.println(" Computer pick : Rock");
	     	      case 1 -> System.out.println(" Computer pick : Paper");
	     	      case 2 -> System.out.println(" Computer pick : Scissor");
	    	    }
	    	   /*
	                         >  R=0   	         
	                  P=win /  / \  \  
	                       /  /   \  \ 	         
	                      /  /_____\  \> R=win	         
	                        P =1   S =2
	                         <-- S=win      	         
	           */
	    	     if (my_move==cop_move)
	    	    {
	    		    System.out.println(" The game is Tie,");
	    	        System.out.println(" You both choose same Item\n");
	    	        draw++;
	    	    }
	    	     else if(my_move == 0 && cop_move == 2 || my_move == 2 && cop_move == 1 || my_move ==1 && cop_move == 0)
	    	    {    
	    	       	System.out.println(" Player win the Game \n"); 
	    	        my_win++;
	    	    }
	    	     else if(cop_move == 0 && my_move == 2 || cop_move == 2 && my_move == 1 || cop_move ==1 && my_move == 0)
	     	    {    
	     	    	System.out.println(" Computer win the Game \n "); 
	     	    	cop_win++;
	            } 
	    	     else
		            {
		    	     	System.out.println(" Invalid input given by Player \n"); 
		    	    }
	    	     if(play==5)
	    	    {
	    	       	break;
	            }
	    	       play++;
	    	       
	           } 
	           		catch(Exception e)
	           {
	           			System.out.println("Error unwanted input");
	           			System.out.println(e);
	           }
	        	   
	         
	           
	    	 }
	    	
	    	   
		  
	    	 
	     	 System.out.println("/////-----/////-----/////-----/////-----/////-----/////-----/////---\n"); 
	     	 
	         System.out.print(" The Tournament is Over and Results are:");
	     	 System.out.println(" Computer win : "+cop_win+ " Game");
	    	 System.out.println(" \t\t\t\t         Player win   : "+my_win+" Game");
	    	 System.out.println(" \t\t\t\t         The Game was Tie: "+draw +"\n");
	    	 
	    	 System.out.println("-----/////-----/////-----/////-----/////-----/////-----/////-----///\n");
	    	 try {
	         	if(my_win==cop_win) 
	    	 {
	    		 System.out.println(" The Tournament was Draw.\n");
	    	 }
	          	
	    	    else if(my_win>cop_win) 
	    	 {
	    		 System.out.println(" Player win The Tournament.\n");
	    	 }
	   	
	    	    else
	    	 {
	    		 System.out.println(" Computer win  The Tournament.\n");
	         }
	         	
	     	
	            System.out.print(" Do you want to play again ? ( if -- Yes=1 || No=0): \n");         // For repeating the loop multiple time
	    																							
	    		int again =new  Scanner(System.in).nextInt();						            	 // you can you sting here (if comfortable)
	    			
	    		
	    		
	    		 
		    	
		    	
	    		       if( !(again==1 ))
		    		 { 
		    		 	System.out.println();
		    		 	break;
		    		 }
		    		  
	    		   
	             
		    	     }catch(Exception e)
		    	        {
		    	    	 System.out.println("Error unwanted input");
		           			System.out.println(e); 	    	 
		    	        }
	    		
	     }
	   
		
	    		
	}
	}
