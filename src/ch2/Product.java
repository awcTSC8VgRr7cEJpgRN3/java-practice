//計算三數之積

package ch2;

import java.util.Scanner;

public class Product {
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		int integ3, integ2, integ1;
		
		System.out.print( "Enter integ1: " );
		integ1 = input.nextInt();
		System.out.print( "Enter integ2: " );
		integ2 = input.nextInt();
		System.out.print( "Enter integ3: " );
		integ3 = input.nextInt();
		
		if( integ1%3 == 0 || integ1%5 == 0)
			System.out.printf( "%d ", integ1 );
		if( integ2%3 == 0 || integ2%5 == 0)
			System.out.printf( "%d ", integ2 );
		if( integ3%3 == 0 || integ3%5 == 0)
			System.out.printf( "%d ", integ3 );
	}
}
