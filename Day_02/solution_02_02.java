import java.io.File;  // To read text files.
import java.io.FileNotFoundException;  // To handle errors.
import java.util.Scanner; // To read text files.
import java.util.ArrayList; // To make ArrayList.
import java.util.Collections; // To find largest element.

public class solution {
    public static void main ( String[] args ) {
        try {
            File puzzleInput = new File( "input_02.txt" );
            Scanner myReader = new Scanner( puzzleInput );
            // Setup:
            int ROCK = 1; // A && X
            int PAPER = 2; // B && Y
            int SCISSORS = 3; // C && Z
            int LOSE = 0;
            int DRAW = 3;
            int WIN = 6;
            int total = 0;
            while ( myReader.hasNextLine() ) {
                String line = myReader.nextLine();
                switch (line) {
                    case "A X":
                        //ROCK/LOSE = SCISSORS
                        total = total + SCISSORS + LOSE;
                        break;
                    case "A Y":
                        //ROCK/DRAW = ROCK
                        total = total + ROCK + DRAW;
                        break;
                    case "A Z":
                        //ROCK/WIN = PAPER
                        total = total + PAPER + WIN;
                        break;
                    case "B X":
                        //PAPER/LOSE = ROCK
                        total = total + ROCK + LOSE;
                        break;
                    case "B Y":
                        //PAPER/DRAW = PAPER
                        total = total + PAPER + DRAW;
                        break;
                    case "B Z":
                        //PAPER/WIN = SCISSORS
                        total = total + SCISSORS + WIN;
                        break;
                    case "C X":
                        //SCISSORS/LOSE = PAPER
                        total = total + PAPER + LOSE;
                        break;
                    case "C Y":
                        //SCISSORS/DRAW = SCISSORS
                        total = total + SCISSORS + DRAW;
                        break;
                    case "C Z":
                        //SCISSORS/WIN = ROCK
                        total = total + ROCK + WIN;
                        break;
                }
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
