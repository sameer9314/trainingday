package com.bridgelabz.datastructure;

import com.bridgeLabz.Utility.Utility;
/******************************************************************************
*  Purpose: To validate whether the entered expression is valid or not by using stack.
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   26-05-2018
*
******************************************************************************/
public class ValidateExpression {

	public static void main(String[] args) {
		Utility obj=new Utility();
		Stack s=Stack.stack();
		System.out.println("Enter the expression to validate");
		String exp=Utility.getString();
		for(int i=0;i<exp.length();i++) {
			if(exp.charAt(i)=='(') {
				s.push(i);
			}
			else if(exp.charAt(i)==')') {
				s.pop();
			}
		}
		if(s.isEmpty()==true) {
			System.out.println("Expression is balanced");
		}else {
			System.out.println("Expression is not balanced");
		}
		
	}

}
