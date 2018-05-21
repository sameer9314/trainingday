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
import java.util.Scanner;
import java.util.Random;


public class Utility {
	
	// private constructor to create scanner object;
	private static Scanner scnObj=null;
	Utility(){		
	scnObj=new Scanner(System.in);
	}
	
	
	
	
/*******************************************************************************************************************************/	
		/*
	    * Function to calculate the Percentage of Heads vs Tails.
	    *
	    * @param n the integer to flip the coins for n times.
	    */
		void findPercentage(int n){
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
		   System.out.println("PERCENTAGE OF HEAD vs TAILS is : "+per);
		   scnObj.close();
	    }
/*******************************************************************************************************************************/		
		/*
		    * Function to find whether year is leap or not.
		    *
		    * @param year the integer to find the leap year.
		    */
		void findLeapYear(int year) {
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
			scnObj.close();
		}
/******************************************************************************************************************************/		
		/*
		    * Function to print the power of table 2.  
		    *
		    * @param n the intger to print the power of table 2 till n.
		    */
		void generateTableOfPower2(int n) {
		   int value=1;		
	       for(int i=1;i<=n;i++) {
	    	  for(int j=1;j<=i;j++) {
	    		  value*=2;
	    	  }
	    	  System.out.println(value);
	         value=1;
	      }
	    }
/******************************************************************************************************************************/		
		/*
		    * Function to find the harmonic value of nth term.
		    *
		    * @param n the integer to find the harmonic value till n.
		    */
		void findHarmonicValue(int n) {
			double sum=0;
			for(double i=1;i<=n;i++) {
			   sum+=1/i;	   
		    }
			System.out.print(n+"th HARMONIC VALUE IS : "+sum);
		    scnObj.close();   
		}
/******************************************************************************************************************************/		
		/*
		    * Function to find the Prime factors of given number.
		    *
		    * @param num the integer to find the prime factor.
		    */
		void findPrimeFactor(int num) {
			String s="";
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
			scnObj.close();
		}
/********************************************************************************************************************************/		
		/*
		 *Function is written to determines number of times of Wins and Percentage of Win And Loss
		 *
		 *@param stake the integer to take the stake input.
		 *@param goal the integer to take the goal input.
		 *@param numberOfTimes the integer to take the input for number Of Times to play.
		 */
		void playGambler(int stake,int goal,int numberOfTimes){
			for(int i=1;i<=numberOfTimes;i++) {
				double generatedRandomNumber=Math.random();
				if(generatedRandomNumber>0.5) {
					Gambler.mstakeWinCount++;
					stake++;
				}
				else {
					Gambler.mstakeLossCount++;
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
			System.out.println("Number of wins are : "+Gambler.mstakeWinCount);
			System.out.println("Wins percentage is : "+(Gambler.mstakeWinCount*100)/Gambler.mstakeWinCount+Gambler.mstakeLossCount);
			System.out.println("Loss percentage is : "+(Gambler.mstakeLossCount*100)/Gambler.mstakeWinCount+Gambler.mstakeLossCount);
			scnObj.close();
	}
/****************************************************************************************************************************/
		/*
		 *Function is written to get the total number of times
		 *random number method  needed to call
		 *to store distinct random number in given array size.
		 *
		 *@param distinctCoupanNumber the integer is to get how many distinct coupan needed to generate.
		 */	
		   void generateCoupan(int distinctCoupanNumber) {
			  System.out.println("distinctCoupanNumber is : "+distinctCoupanNumber);
			  Random rand = new Random();
			  int a[]=new int[distinctCoupanNumber];
			  int rand_int;
			  int arrayIndex=0;
			  int totalRandomNumber=0;
			  while(CoupanNumber.distinctElementcount<distinctCoupanNumber) {
		  			totalRandomNumber++;
		  			rand_int= rand.nextInt(20);
		  			if(CoupanNumber.distinctElementcount==0) {
		  				a[arrayIndex]=rand_int;
		  				arrayIndex++;
		  				CoupanNumber.distinctElementcount++;
				    }
				    else {
				    	if( (Utility.checkDistinctElement(a,CoupanNumber.distinctElementcount,rand_int)==true) ){
				    		CoupanNumber.distinctElementcount++;
				    		a[arrayIndex]=rand_int;
				    		arrayIndex++;
				    	}
				    }	
		      } 
			  System.out.println("Total random number needed to store "+distinctCoupanNumber+" distinct random numbers in array is : "+totalRandomNumber);
		  	  scnObj.close();
		    }
/******************************************************************************************************************************/		
		/*
		 *Function is written to whether the generated random number is distinct or not.
		 *
		 *@param array the integer array to get currently initialised elements in array.
		 *@param distinctElementcount the integer to know number of distinct element added in array.
		 *@param  randInt the integer is generate random number.
		 */	
		 static boolean checkDistinctElement(int a[],int distinctElementcount,int randInt) {
			for(int i=0;i<distinctElementcount;i++) {
				if(a[i]==randInt) {
					return false;
				}
			}
			return true;
		 }
/******************************************************************************************************************************/		 
		 /*
		  *Function is written to generate one integer number.
		  */	
		 static int getInt()
		 {
			 return scnObj.nextInt();
		 }
 /******************************************************************************************************************************/		 
		 /*
		  *Function is written to generate one String.
		  */	
		 static String getString()
		 {
			 return scnObj.nextLine();
		 }
		 
/******************************************************************************************************************************/		 
	/*
	 *Function is written to generate one Char.
	 */	
	 static char getChar()
	 {
		 return scnObj.next().charAt(0);
	 }		 		 
/******************************************************************************************************************************/		 
		 /*
		  *Function is written to initialise 2D- Array index with integer value.
		  *
		  *@param array the 2-D integer Array  to initialise its element.
		  */	
		 void arrayInit(int[][] a) {
			 for(int i=0;i<a.length;i++) {
				 for(int j=0;j<a.length;j++) {
					 a[i][j]=Utility.getInt();
				 }
			 }
		 }
/********************************************************************************************************************************/		 
		 /*
		  *Function is written to display 2D- Array elements
		  *@param array the 2-D integer Array to display its elemnts.
		  */	
		void displayArray(int[][] a) {
			System.out.println("Displaying your Array");
			for(int i=0;i<a.length;i++) {
			   for(int j=0;j<a.length;j++) {
				 System.out.print( a[i][j]+" ");
					  
			   }
				   System.out.println();
		    }
	    }
/*********************************************************************************************************************************/		
		 /*
		  *Function is written to initialise Array index with integer value.
		  *
		  *@param array the 1-D integer array to initiaise its element.
		  */	
		 void arrayInit(int[] a) {
			 for(int i=0;i<a.length;i++) {
				 a[i]=Utility.getInt();
			}
		 }
		 
/**********************************************************************************************************************************/		 
		 /*
		  *Function is written to display Array elements
		  *@param array the 1-D integer array to display its element.
		  */	
		void displayArray(int[] a) {
			System.out.println("Displaying your Array");
			for(int i=0;i<a.length;i++) {
			    System.out.print(a[i]+" ");
			}
		}	
/***********************************************************************************************************************************/		
		/*
		  *Function is written to find the number of triplets whose sum is equal to zero.
		  * And to display triplets combinations and number of triplets.
		  * 
		  * @param array the 1-D Array to find all the distinct triplets element in the array.
		  */
		void findDistinctTriplet(int[] array) {
			System.out.println("Finding the combination of triplets whose sum is equal to zero......");
			int tripletCount=0;
			for(int i=0;i<array.length;i++) {
				if(i<array.length-2) {
					for(int j=i+1;j<array.length-1;j++) {
						for(int k=j+1;k<array.length;k++) {
							if(array[i]+array[j]+array[k]==0) {
								tripletCount++;
								System.out.println(array[i]+" "+array[j]+" "+array[k]+" = "+0);
							}
						}
					}
				}
			}
			if(tripletCount==0) System.out.println("No triplet combination found : ");
			else System.out.println("Combination found : ");
			System.out.println("Total number of triplets found is : "+tripletCount);
		}
/*************************************************************************************************************************************/		
		/*
		  *Function is written to find the Euclidean distance from the given point (x,y) .
		  * And to display Euclidean distance from the given point.
		  * 
		  * @param x and y the integers to get the find the distance from the origin.
		  */
		void findDistance(int x,int y) {
			System.out.println("Euclidean distance from the given point("+x+","+y+") is : "+Math.sqrt(Math.pow(x,2)+Math.pow(y,2)) );
		}
/*************************************************************************************************************************************/		

		/*
		  *Function is written to find  the roots of the quadratic equation.
		  * And to display Euclidean distance from the given point.
		  * 
		  * @param a,b,c the integers number.
		  */
		void findQuadraticRoots(int a,int b,int c)
		{
			 double delta=b*b-4*a*c;
			   
			    double roots1=(-b+Math.sqrt(delta))/(2*a); 
			    double roots2=(-b-Math.sqrt(delta))/(2*a);
			      	
			    System.out.println("Root 1 of x is :"+roots1);
			    System.out.println("Root 2 of x is :"+roots2);
		}
/*************************************************************************************************************************************/		
		
		/*
		  *Function is written to find the wind chill.
		  *
		  * @param t the integer input for temperature.
		  * @param v the integer input for wind speed.
		  */
		void findWindChill(double t,double v) {
			   if(t<50 && v<120&&v>3) {
				  double w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16);	
				  System.out.println("Given temperature is : "+t);
				  System.out.println("Given wind speed is : "+v);
				  System.out.println("Wind chill is : "+w);
			   }
			   else {
				   System.out.println("Wrong Inputs");
			   }
		    }
/*************************************************************************************************************************************/		
		/*
		  *Function is written to find the elapsed time between starting time and ennding time.
		  *
		  * @param t the integer input for temperature.
		  * @param v thr integer input for wind speed.
		  */
		void findElapsedTime(int choice) {
	    	long startTime =0;
	    	long endTime=0;
	    	int flag=0;
	    	while(flag==0) {
	    		switch(choice) {
	    			case 1 : startTime= System.nanoTime(); // Get the current system time in nano second.
	    				     System.out.println("Press 0 to stop the Stopwatch");
	    				     choice=Utility.getInt();
	    					 break;
	    					 
	    			case 0 : endTime= System.nanoTime();   // Get the current system time in nano second.
	    			         flag=1;
	    		}
	    	}
	    	System.out.println("Start time is : "+startTime);
	    	System.out.println("End time is : "+endTime);
	        System.out.println("Elapsed Time is : "+ (endTime - startTime));
	    }
		
/*************************************************************************************************************************************/		
		/*
		  *Function is written to replace the <<username>> from the given template.
		  *	board[0][0]='x';
		board[0][0]='x';
		  * @param  userName the String input for <<username>>.
		  * 
		  * @return templates after replacing the <<userName>> from the template with the entered String.
		  */
		 String replaceString(String userName) {
			String template = "Hello <<username>>, How are you?";
			String output="";
			if (userName.length() < 3) {
				System.out.println("username should contain minimum three character atleast !");
			} 
			else {
				output = template.replaceAll("<<username>>", userName);
			}
			return output;
		}
/*************************************************************************************************************************************/		
	/*
	  *Function is written to find all permutation of a given String.
	  *
	  * @param  inputString the String input to permute the String.
	  * 
	  */		
		 public  void findStringPermutation(String inputString)
	        {
			 findStringPermutation("", inputString);
	        }
	     static void findStringPermutation(String permute, String inputString)
	        {   
	            if(inputString.length() == 0)
	            {
	                System.out.println(permute);
	            }
	            else
	            {
	                for (int i = 0; i < inputString.length(); i++)
	                {   
	                	Utility.findStringPermutation(permute+inputString.charAt(i), inputString.substring(0, i)+inputString.substring(i+1, inputString.length()));
	                }
	            }
	        }	
/**************************************** TIC TAC TOE *************************************************************************************************/		 

}
