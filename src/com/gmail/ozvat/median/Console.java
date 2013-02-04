/**
 * 
 */
package com.gmail.ozvat.median;

/**
 * @author mozvat - Entry point into our project
 *
 */
public class Console {
	
	public static void main (String args[]) {
	    System.out.println("Welcome to the wonderful world of finding the Median from an array of values");
		//Create an array of doubles
		double[] values = {10,1,14,3,15,4};  
		//Instance our Calculate class
		Calculate calc = new Calculate();
		//Call the FindMedian function passing in the declared array.
		double median = calc.FindMedian(values);
		//Print out the result.
	    System.out.println("Median of the values is: " + String.valueOf(median) );
	}
}