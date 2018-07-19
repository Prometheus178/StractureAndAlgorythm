package Chapter4;

import java.io.IOException;

import static Chapter4.ReverserApp.getString;

public class BrecketsApp {
    public static void main(String[] args) throws IOException {
        String input;
        while (true){
            System.out.print(" Enter string containing delimiters: ");
            System.out.flush();
            input = getString();
            if (input.equals(" "))
                break;
            BracketChecker theChecker = new BracketChecker(input);
            theChecker.check();
        }
    }
}
