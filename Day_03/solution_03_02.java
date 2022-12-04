import java.io.File;  // To read text files.
import java.io.FileNotFoundException;  // To handle errors.
import java.util.regex.*;
import java.util.*;

public class solution {
    public static void main ( String[] args ) {
        try {
            File puzzleInput = new File( "input_03.txt" );
            Scanner myReader = new Scanner( puzzleInput );
            // Setup:
            char[] contents1;
            char[] contents2;
            char[] contents3;
            int total = 0;
            while ( myReader.hasNextLine() ) {
                String rucksack1 = myReader.nextLine();
                contents1 = rucksack1.toCharArray();
                String rucksack2 = myReader.nextLine();
                contents2 = rucksack2.toCharArray();
                String rucksack3 = myReader.nextLine();
                contents3 = rucksack3.toCharArray();
                OUTER: for (char i1 : contents1) {
                    for (char i2 : contents2) {
                        if ( i1 == i2 ) {
                            for (char i3 : contents3 ) {
                                if ( i1 == i3 ) {
                                    if ( Pattern.compile( "[A-Z]" ).matcher( Character.toString( i1 ) ).matches() ) {
                                        // Upper case A-Z = 27-52
                                        // Get ASCII value and subtract 38. (Subtract 64 for base then add 26 for upper letters).
                                        int i = (int) i1 - 38;
                                        total = total + i;
                                    } else if ( Pattern.compile( "[a-z]" ).matcher( Character.toString( i1 ) ).matches() ) {
                                        // Lower case a-z = 1-26
                                        // Get ASCII value and subtract 96 (to get 1-26).
                                        int i = (int) i1 - 96;
                                        total = total + i;
                                    }
                                    System.out.println( i1 );
                                    break OUTER;
                                }
                            }
                        }
                    }
                }
                
//                System.out.println( rucksack );
//                System.out.println( contents1 );
//                System.out.println( contents2 );
            }
            myReader.close();
            // Solution Output here:
            System.out.println( total );
        } catch ( FileNotFoundException e ) {
            System.out.println( "File not found." );
            e.printStackTrace();
        }
    }
}
