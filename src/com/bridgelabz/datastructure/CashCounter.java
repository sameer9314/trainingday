package com.bridgelabz.datastructure;

import java.util.Random;

import com.bridgeLabz.Utility.Utility;

/******************************************************************************
*  Purpose: To create a panel to add People to Queue to Deposit or Withdraw Money and dequeue.
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   26-05-2018
*
******************************************************************************/
public class CashCounter {

	public static void main(String[] args) {
		Queue q = Queue.queue();
		Utility obj = new Utility();
		//System.out.println(q.isEmpty());
		int amount =5000000;
		Random r=new Random();
		int n=r.nextInt(10); 
		int noOfPersons = n;
		for (int i = 1; i <= noOfPersons; i++) {
			q.enqueue(i);
		}
		System.out.println("Number of Persons in the queue is "+q.size());
		for (int i = 1; i <= noOfPersons; i++) {
			boolean serviceProvided = false;
			while (serviceProvided == false) {
				System.out.println("Person " + i + " is at the counter ");
				System.out.println("Enter your choice : ");
				System.out.println("Enter 1 to deposit the money");
				System.out.println("Enter 2 to withdraw the money");
				int choice = Utility.getInt();
				if (choice == 1) {
					boolean amountDeposited = false;
					while (amountDeposited == false) {
						System.out.println("Enter the amount you want to deposit");
						int depositAmount = Utility.getInt();
						if (depositAmount > 0) {
							amount = amount + depositAmount;
							q.dequeue();
							amountDeposited = true;
							serviceProvided = true;
						} else {
							System.out.println("Amount is not valid ");
						}
					}
				}
				else
				if (choice == 2) {
					boolean amountWithdrawn = false;
					while (amountWithdrawn == false) {
						System.out.println("Enter the amount to withdraw");
						int withdrawAmount = Utility.getInt();
						if (withdrawAmount <= amount) {
							if (withdrawAmount <= 1000000) {
								amount = amount - withdrawAmount;
								q.dequeue();
								System.out.println(withdrawAmount + " Amount withdrawn successfully");
								amountWithdrawn = true;
								serviceProvided = true;
							} else {
								System.out.println("withdraw amount must be less than or equal to 10 lakh");
							}
						} 
						else {
							System.out.println("Sorry Available amount is : "+amount+" only ");
							System.out.println("Enter 1 to exit the counter");
							System.out.println(" Or Enter 2 to withdraw ");
							int exitChoice=Utility.getInt();
							if(exitChoice==1) {
								q.dequeue();
								amountWithdrawn=true;
								serviceProvided=true;
							}
						}
					}
				} 
				else {
					System.out.println("Please enter the valid input to get our best services");
					System.out.println("Enter 1 to exit the counter");
					System.out.println(" Or Enter 2 to continue");
					int exitChoice=Utility.getInt();
					if(exitChoice==1) {
						q.dequeue();
						serviceProvided=true;
					}
				}
			}
		}
		System.out.println("Remaining amount is : "+amount);
		//System.out.println(q.isEmpty());
	}

}
