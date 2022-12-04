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
                        //Rock/Rock = DRAW
                        total = total + DRAW + ROCK;
                        break;
                    case "A Y":
                        //Rock/Paper = WIN
                        total = total + WIN + PAPER;
                        break;
                    case "A Z":
                        //Rock/Scissors = LOSE
                        total = total + LOSE + SCISSORS;
                        break;
                    case "B X":
                        //Paper/Rock = LOSE
                        total = total + LOSE + ROCK;
                        break;
                    case "B Y":
                        //Paper/Paper = DRAW
                        total = total + DRAW + PAPER;
                        break;
                    case "B Z":
                        //Paper/Scissors = WIN
                        total = total + WIN + SCISSORS;
                        break;
                    case "C X":
                        //Scissors/Rock = WIN
                        total = total + WIN + ROCK;
                        break;
                    case "C Y":
                        //Scissors/Paper = LOSE
                        total = total + LOSE + PAPER;
                        break;
                    case "C Z":
                        //Scissors/Scissors = DRAW
                        total = total + DRAW + SCISSORS;
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
