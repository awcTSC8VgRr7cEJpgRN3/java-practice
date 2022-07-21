package ch2;

//import java.util.Scanner;
import javax.swing.JOptionPane;

public class Addition {
	public static void main( String[] args )
	{
		//Scanner input = new Scanner( System.in );
		
		int num1,//1
			num2,//2
			sum;//1+2
		
		num1 = Integer.parseInt( JOptionPane.showInputDialog( "Enter first integer: " ) );
		
		num2 = Integer.parseInt( JOptionPane.showInputDialog( "Enter second integer: " ) );
		
		sum = num1 + num2;
		
		JOptionPane.showMessageDialog( null, String.format( "Sum is %d", sum) );
	}
}
