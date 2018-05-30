package com.bridgelabz.oops.regex;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgeLabz.Utility.Utility;

/**Purpose : To read the following message and replace the particular string with the given string by using Regular expression.
 * @author Sameer Saurabh
 * @version 1.0
 * @since 30/05/2018
 *
 */
public class RegularExpression {
		
	    private static String regexName="(\\<<)name(\\>>)";
	    private static String regexFullName="(\\<<)full name(\\>>)";
	    private static String regexMobileNumber="(91­xxxxxxxxxx)";
	    private static String regexDate="(01/01/2016)";
	    private static String input="Hello <<name>>, We have your full name as <<full name>> in our system.\n"
	       		+ "Your contact number is 91­xxxxxxxxxx.Please,let us know in case of any clarification. \n"
	       		+ "Thank you BridgeLabz 01/01/2016 .";
	    private static String replaceName;
	    private static String replaceFULLName;
	    private static String replaceMobileNumber;
	    private static String replaceDate;
	    public static void main(String[] args) {
	        Utility obj = new Utility();
	        
	        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
	        
	        System.out.println("Enter your name");
	        replaceName=Utility.getString();
	        input=UtilityRegex.regexReplace(regexName,input,replaceName);
	        
	        System.out.println("Enter your full name");
	        replaceFULLName=Utility.getString();
	        input=UtilityRegex.regexReplace(regexFullName,input,replaceFULLName);
	        
	        System.out.println("Enter your mobile number");
	        replaceMobileNumber=Utility.getString();
	        input=UtilityRegex.regexReplace(regexMobileNumber,input,replaceMobileNumber);
	        
	        replaceDate=dateFormat.format(new Date());
	        
	        input=UtilityRegex.regexReplace(regexDate,input,replaceDate);
	        
	        System.out.println(input);
	    }
	}

