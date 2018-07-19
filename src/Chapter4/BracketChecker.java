package Chapter4;

public class BracketChecker {
    private String input;
    public BracketChecker(String in){
        input = in;
    }
    public void check(){
        int stackSize = input.length();
        StackX theStack = new StackX(stackSize);

        for(int j = 0; j < input.length();j++){
            char ch = input.charAt(j);
            switch (ch){
                case '{':
                case '[':
                case '(':
                    theStack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!theStack.isEmpty()) {
                        char chX = (char) theStack.pop();
                        if ((ch == '}' && chX != '{') ||
                                (ch == ']' && chX != '{') ||
                                (ch == ')' && chX != '('))
                            System.out.println("Error " + ch + " at " + j);
                    }
                    else
                        System.out.println();
                    System.out.println("Error " + ch + " at " + j);
                    break;
                    default:
                        break;
            }
        }
        if (theStack.isEmpty()){
            System.out.println("Error: missing rigth delimiter");
        }
    }
}
