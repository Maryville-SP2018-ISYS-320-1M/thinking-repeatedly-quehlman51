/*
  	ISYS 320
  	Name(s): Anthony Quehl
  	Date: 
*/

// 1. Your predicted output 
/* How many lines
 * are printed?
 * How many lines
 * are printed?

*/
public class P2_HowManyLines {

	public static void main(String[] args) {
		for( int i = 1; i <= 3; i++ ) 
		    System.out.println( "How many lines" );
		    System.out.println( "are printed?" );
	}

}



// 3. Were you correct? Explain any differences and what you learned.
// 	  	I was incorrect. I did not see there was no curly bracket after the
//      for loop, therefore it only considered the first line as part of 
//      the loop and executed that line.