package com.gmail.ozvat.median;

import java.util.Arrays;

public class Calculate {
	
	//Constructor
	public Calculate(){}
	
	public double FindMedian(double[] values){
		
		double median = -1;
		//First, sort the numbers ascending
		Arrays.sort(values);
		
		//Second, find the middle number(s) by determining if there are is an odd or even number of values
		if( values.length % 2 == 0){
			// If the remainder is 0, then there is an even number of items in our array, so get the two middle items in the array.
			int firstMiddleItemInArray = values.length / 2;
			int secondMiddleItemInArray = firstMiddleItemInArray - 1;
			//Add the two middle numbers together and divide by two to find the median
			median = (values[firstMiddleItemInArray] + values[secondMiddleItemInArray]) / 2;
			
		}
		else {
			// If the remainder is anything but 0, then there is an odd number of items in our array, so get the middle item number
			int middleItemInArray = values.length / 2;
			//Now set the median value from the sorted array list.
			median = values[middleItemInArray];		
		}
		
		// 
			//If there are is an odd number of values return the middle value as the median.
			//Else If, there is an even number of values, find the middle two items, add them, then divide by 2 for the median
		return median;
	}
	
}
