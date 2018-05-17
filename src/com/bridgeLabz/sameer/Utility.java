/******************************************************************************

 *  
 *  Purpose: 
 *
 *  @author  Sameer Saurabh
 *  @version 1.0
 *  @since   17-05-2018
 *
 ******************************************************************************/
package com.bridgeLabz.sameer;

import java.util.Random;
import java.util.Scanner;

public class Utility {
	 

	/*
	 * Static Variable is declared to count the number of distinct elements added to array.
	 */
	static int distinctElementcount=0;
	
	/*
	 * Static Variable is declared to count the number of times of Wins.
	 */
	static double mstakeWinCount=0;
	
	/*
	 * Static Variable is declared to count the number of times of Loss.
	 */
	static double mstakeLossCount=0;
	
		/*
	    * Function to calculate the Percentage of Heads vs Tails.
	    *
	    * @param number the number to flip the coins for number times.
	    */
		void flipCoinMethod(){
		   
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the number of times to Flip the coin");
		   int n=sc.nextInt();
		   int tails=0;
	       int heads=0;
		   
		   for(int i=1;i<=n;i++) {
	          double value=Math.random();
	          
	          if(value<0.5) {
	        	  tails++;
	          }
	          else {
	        	  heads++;
	          }
	        	  
		   }
		   double per=(heads*100)/n;
		   System.out.println("PERCENTAGE OF HEAD vs TAILS "+per);
		   sc.close();
	    }
		
		/*
		    * Function to find whether year is leap or not.
		    *
		    * @param number the number to find the leap year.
		    */
		void leapYearMethod() {
			
			Scanner sc=new Scanner(System.in);
			
		    System.out.println("Enter the year to check");
			int year=sc.nextInt();	
			
			if(year>999 && year<=9999) {
		         if( (year%4==0 && year%100!=0) || (year%100==0 && year%400==0) ) {
		            System.out.println("Leap Year");
		         }
			     else {
		            System.out.println( "NOT A LEAP YEAR");
			     }
		     }
		     else {
		    	  System.out.println("NOT A VALID YEAR");
		     }	 
			 sc.close();
		}
		
		/*
		    * Function to print the power of table 2.
		    *
		    * @param number the number to print the power of table 2 till number.
		    */
		void powerOf2Method(int n) {
		   int value=1;		
	       for(int i=1;i<=n;i++) {
	    	  for(int j=1;j<=i;j++) {
	    		  value*=2;
	    	  }
	    	  System.out.println(value);
	         value=1;
	      }
	    }
		
		/*
		    * Function to find the harmonic value of nth term.
		    *
		    * @param number the number to find the harmonic value till number.
		    */
		void harmonicValueMethod() {
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER THE HARMONIC VALUE OF N");
			
			int n=sc.nextInt();
			
			double sum=0;
			
			for(double i=1;i<=n;i++) {
			   sum+=1/i;	   
		    }
			   
		    System.out.print(n+"th HARMONIC VALUE IS "+sum);
		    sc.close();   
		}
		
		/*
		    * Function to find the Prime factors of given number.
		    *
		    * @param number the number to find the prime factor.
		    */
		void primeFactorMethod() {
			String s="";
			
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER THE NUMBER TO FIND THE PRIME FACTORS");
			int num=sc.nextInt();
			int newNum=num;

	        for(int i=2;i*i<=newNum;i++) {
			   while(num%i==0) {
				  num=num/i;
				  s+=i+" ";
				
			   }
	        }
	        if(num>1) {
	        	s+=num;
	        }
			System.out.println("PRIME FACTOR(S) OF "+newNum+" : "+s);
		    sc.close();
		}
		
		/*
		 *Function is written to determines number of times of Wins and Percentage of Win And Loss
		 *@param three numbers to take the value of $Stake, $Goal, number of times to play a game
		 */
		void gamblerMethod(){
			//Gambler g=new Gambler();
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Your Stake");
			int stake=sc.nextInt();
			
			System.out.println("Enter Your Goal");
			int goal=sc.nextInt();
			
			System.out.println("Mention how many times you want to play this game");
			int numberOfTimes=sc.nextInt();
			
			for(int i=1;i<=numberOfTimes;i++) {
			double generatedRandomNumber=Math.random();
			
			if(generatedRandomNumber>0.5) {
				Utility.mstakeWinCount++;
				stake++;
			}
			else {
				Utility.mstakeLossCount++;
				stake--;
			}
			if(stake==goal) {
				break;
			}
			else
				if(stake==0) {
					break;
				}
		}
			System.out.println("Number of wins are : "+mstakeWinCount);
			System.out.println("Wins percentage is : "+(mstakeWinCount*100)/mstakeWinCount+mstakeLossCount);
			System.out.println("Loss percentage is : "+(mstakeLossCount*100)/mstakeWinCount+mstakeLossCount);
			sc.close();
	}
		
		/*
		 *Function is written to get the total random number method  needed to call, to store distinct random number in given array size.
		 *
		 */	
		   void coupanNumberMethod() {

		    Scanner sc=new Scanner(System.in);
			
		    System.out.println("Enter the value of Distinct coupan numbers");
		    int distinctCoupanNumber=sc.nextInt();
			
		    System.out.println("distinctCoupanNumber is : "+distinctCoupanNumber);
		    
		    Random rand = new Random();
			
		    int a[]=new int[distinctCoupanNumber];
		    
			int rand_int;
			
			int arrayIndex=0;
			
			int totalRandomNumber=0;
			
		  	while(distinctElementcount<distinctCoupanNumber) {
		  		
		  		totalRandomNumber++;
		  		
		  		rand_int= rand.nextInt(20);
		  		
		  		//System.out.println("rand_int is : "+rand_int);
		  		
				if(distinctElementcount==0) {
					a[arrayIndex]=rand_int;
					arrayIndex++;
					distinctElementcount++;
				}
				else {
		  		   if( (Utility.checkDistinctElement(a,distinctElementcount,rand_int)==true) ){
		  			   distinctElementcount++;
		  			   a[arrayIndex]=rand_int;
		  			   arrayIndex++;
		  		   }
				}	
			}
			
		  	System.out.println("Total random number needed to store "+distinctCoupanNumber+" distinct random numbers in array is : "+totalRandomNumber);
		  	sc.close();
		}
		
		/*
		 *Function is written to whether the generated random number is distinct or not.
		 *@param three variables array, distinctElementcount, generated random number.
		 */	
		 static boolean checkDistinctElement(int a[],int distinctElementcount,int rand_int) {
			for(int i=0;i<distinctElementcount;i++) {
				if(a[i]==rand_int) {
					return false;
				}
			}
			return true;
		}
}
