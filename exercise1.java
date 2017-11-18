import javax.swing.JOptionPane;

/*
 * Filename: exercise1.java
 * Purpose: Modification of Ex1.java and should allow the user to enter any number and display 
 * average stock price
 */

import javax.swing.*;

public class exercise1 
{
	// main method
	public static void main (String[] args ) 
	{
		
		
		
		// declare required variables
		String openingMessage, outputMessage, a1String, b2String, c3String, d4String, e5String,
		averageString, a1Message, b2Message, c3Message, d4Message, e5Message, averageMessage,nameOutputMessage ;
		
		double a1, b2, c3, d4, e5, average, stockPrice;
	
		
				
			
		// displaying opening message
		openingMessage = "Welcome to StockPrice 2.0";
		JOptionPane.showMessageDialog( null, openingMessage );
		
		// get required input using dialog boxes
		a1Message      = "Please enter first number";
		a1String       = JOptionPane.showInputDialog( a1Message );
		a1             = Double.parseDouble( a1String );// converts string to double
		
		b2Message      = "Please enter second number";
		b2String       = JOptionPane.showInputDialog( b2Message );
		b2             = Double.parseDouble( b2String );// converts string to double
		
		c3Message      = "Please enter third number";
		c3String       = JOptionPane.showInputDialog( c3Message );
		c3             = Double.parseDouble( c3String );// converts string to double
		
		d4Message      = "Please enter fourth number";
		d4String       = JOptionPane.showInputDialog( d4Message );
		d4             = Double.parseDouble( d4String );// converts string to double
		
		e5Message      = "Please enter final number";
		e5String       = JOptionPane.showInputDialog( e5Message );
		e5             = Double.parseDouble( e5String );// converts string to double
		
		averageMessage = "Please enter how many numbers you've entered in total.";
		averageString  = JOptionPane.showInputDialog( averageMessage );
		average        = Double.parseDouble( averageString );
		
		
		
		// perform calculations
		stockPrice = (a1 + b2 + c3 + d4 + e5) / (average);
		
		// build output strings
		nameOutputMessage   = "The average for the stock prices are:  " + stockPrice  +"\n";
		
		
		
		// create output String
		outputMessage = nameOutputMessage;
		
		
		
		
		JOptionPane.showMessageDialog( null, outputMessage );
		
		System.exit(0);
		
	} // end main

} // end class
