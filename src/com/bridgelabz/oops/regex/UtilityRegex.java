package com.bridgelabz.oops.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtilityRegex {
	

	/*
	 * Function is written to replace the particular string by entered string
	 * using regular expression.
	 * 
	 * @param regex
	 * @param input
	 * @param replace
	 * 
	 * @returntype input is a string after replacing particular string 
	 * 			   with input String.
	 */
	static String regexReplace(String regex,String input,String replace) {
	    	Pattern p = Pattern.compile(regex);
	        Matcher m = p.matcher(input);
	        input= m.replaceAll(replace);
	      
	        return input;
	    }
}
