/*
 * Figure 6.1
 * Filename: Ex1.java
 * Copied: 11/13/2017 by Symuel Gaynor
 * Purpose: Demonstrate array access with a loop
 */

public class Ex1 
{
	public static void main( String[] args ) 
	{
		double[] stockPrice = {23.75, 24.19, 28.88, 25.92, 27.26 };
		double sum = 0, average;
		
		for ( int i = 0; i < stockPrice.length; i++ ) 
		{
			System.out.println
			( "Stock price number " + (i + 1) + ": " + stockPrice[ i ] );
			sum += stockPrice[ i ];
		}
		average = sum / stockPrice.length;
		
		System.out.println( "\nThe average stock price is: " + average);
		
	} // end main

} // end class
