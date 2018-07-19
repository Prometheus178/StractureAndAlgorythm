package Chapter4;

class StackX2 {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackX2(int size)
// Конструктор
    {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    //--------------------------------------------------------------
    public void push(int j)
// Размещение элемента на вершине стека
    {
        stackArray[++top] = j;
    }

    //--------------------------------------------------------------
    public int pop()
// Извлечение элемента с вершины стека
    {
        return stackArray[top--];
    }

    //--------------------------------------------------------------
    public int peek()
// Чтение элемента на вершине стека
    {
        return stackArray[top];
    }

    //--------------------------------------------------------------
    public boolean isEmpty()
// true, если стек пуст
    {
        return (top == -1);
    }

    //--------------------------------------------------------------
    public boolean isFull()
// true, если стек заполнен
    {
        return (top == maxSize - 1);
    }

    //--------------------------------------------------------------
    public int size()
// Текущий размер стека
    {
        return top + 1;
    }

    //--------------------------------------------------------------
    public int peekN(int n)
// Чтение элемента с индексом n
    {
        return stackArray[n];
    }

    //--------------------------------------------------------------
    public void displayStack(String s) {
        System.out.print(s);
        System.out.print("Stack (bottom-->top): ");
        for (int j = 0; j < size(); j++) {
            System.out.print(peekN(j));
            System.out.print(' ');
        }
        System.out.println("");
    }
//--------------------------------------------------------------
}

public class ParsePost {
    private StackX2 theStack;
    private String input;

    public ParsePost(String s) {
        input = s;
    }

    public int doParse() {
        theStack = new StackX2(20);
        char ch;
        int j;
        int num1, num2, interAns;
        for (j = 0; j < input.length(); j++) {
            ch = input.charAt(j);
            theStack.displayStack("" + ch + " ");
            if (ch >= '0' && ch <= '9') {
                theStack.push((int) (ch - '0'));
            } else {
                num2 = theStack.pop();
                num1 = theStack.pop();
                switch (ch) {
                    case '+':
                        interAns = num1 + num2;
                        break;
                    case '-':
                        interAns = num1 - num2;
                        break;
                    case '*':
                        interAns = num1 * num2;
                        break;
                    case '/':
                        interAns = num1 / num2;
                        break;
                    default:
                        interAns = 0;
                }
                theStack.push(interAns);

            }
        }
        interAns = theStack.pop();
        return interAns;
    }
}
