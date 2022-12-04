import java.io.File;  // To read text files.
import java.io.FileNotFoundException;  // To handle errors.
import java.util.Scanner; // To read text files.
import java.util.ArrayList; // To make ArrayList.
import java.util.Collections; // To find largest element.

public class solution {
    public static void main ( String[] args ) {
        try {
            //int[] elves;
            ArrayList< Integer > elves = new ArrayList< Integer >();
            int i = 0;
            elves.add( 0 );
            File puzzleInput = new File( "input_01.txt" );
            Scanner myReader = new Scanner( puzzleInput );
            while ( myReader.hasNextLine() ) {
                String line = myReader.nextLine();
                if ( line != "" ) {
                    elves.set( i, elves.get(i) + Integer.parseInt( line ) );
                } else {
                    i = i + 1;
                    elves.add( 0 );
                }
                //System.out.println( line );
            }
            myReader.close();
            System.out.println( "Elf with most calories: " + Collections.max( elves ) );
            Collections.sort( elves );
            int total = elves.get( elves.size() - 1 ) + elves.get( elves.size() - 2 ) + elves.get( elves.size() - 3 );
            System.out.println( "Top Three Elves' calories: " + total );
        } catch ( FileNotFoundException e ) {
            System.out.println( "File not found." );
            e.printStackTrace();
        }
    }
}
