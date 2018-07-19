package Chapter4;

import java.io.IOException;

import static Chapter4.InfixApp.getString;

public class PostFixApp {
    public static void main(String[] args) throws IOException {
        String input;
        int output;
        while (true){
            System.out.println("Enter postfix: ");
            System.out.flush();
            input = getString();
            if (input.equals(""))
                break;
            ParsePost aParser = new ParsePost(input);
            output = aParser.doParse();
            System.out.println("Evalutes to "+ output);


        }
    }
}
