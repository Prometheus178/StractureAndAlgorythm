package Chapter4;

public class StackX {
    private int maxSize;
    private int[] stack;
    private int top;



    public StackX(int maxSize){
        stack = new int[maxSize];
        top = -1;
    }
    public void push(int j){
        stack[++top] = j;
    }
    public int pop(){
        return stack[top--];
    }
    public int peek(){
        return stack[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == maxSize-1);
    }
    public int size(){
        return top+1;
    }
    public char peekN(int n){
        return (char) stack[n];
    }
    public void displayStack(String s){
        System.out.print(s);
        System.out.print("Stack (bottom--> top): ");
        for (int j= 0;j<size();j++){
            System.out.print( peekN(j));
            System.out.print(" ");
        }
        System.out.println();
    }
}
