package com.bridgeLabz.algorithmprograms;

import java.util.Map;
import java.util.TreeMap;

import com.bridgeLabz.Utility.Utility;

/******************************************************************************
*  Purpose: To convert elapsed time taken by the searching and sorting method
*  			And print that elapsed time list in a sorted list by ascending order.
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   22-05-2018
*
******************************************************************************/
public class SortingElapsedTime {

	public static void main(String[] args) {
	//Creating Utility object
	Utility obj=new Utility();
	
	System.out.println("Enter the size of an array "); 
	int size=Utility.getInt();
	
	int array[]=new int[size];
	Utility.arrayInit(array);
	Utility.displayArray(array); 
	String name="sameer";  
	int last=array.length-1;
	long startTime;
	long endTime;
	
	TreeMap<Long,String> time=new TreeMap<Long,String>();
	startTime=System.nanoTime();
    Utility.binarySearch(array,0,last,2);
	endTime=System.nanoTime();
    time.put(endTime-startTime,"Binary Search integer");
					 
	startTime=System.nanoTime();
    Utility.binarySearch(name,0,name.length()-1,'a');
    endTime=System.nanoTime();
    time.put(endTime-startTime,"Binary Search String ");
					
	startTime=System.nanoTime();
    Utility.insertionSort(array);
	endTime=System.nanoTime();
	time.put(endTime-startTime,"Insertion Sort integer ");
				    
	startTime=System.nanoTime();
    Utility.insertionSort(name);
	endTime=System.nanoTime();
	time.put(endTime-startTime,"Insertion Sort String ");
					
	startTime=System.nanoTime();
    Utility.bubbleSort(array);
	endTime=System.nanoTime();
    time.put(endTime-startTime,"Bubble sort integer ");
					
	startTime=System.nanoTime();
	Utility.bubbleSort(name);
	endTime=System.nanoTime();
	time.put(endTime-startTime,"Bubble sort String ");
			
	
	System.out.println("Prnting elapsed time in ascending order ");
	for(Map.Entry<Long,String>  entry: time.entrySet()) {
		System.out.println(entry.getValue()+" "+entry.getKey());
	}
	
}
}
