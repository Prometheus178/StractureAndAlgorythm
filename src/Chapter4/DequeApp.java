package Chapter4;

public class DequeApp {
    public static void main(String[] args) {
        Deque theQueue = new Deque(10);
        theQueue.insertLeft(10);
        theQueue.insertLeft(20);
        theQueue.insertLeft(30);
        theQueue.insertLeft(40);

        theQueue.insertRight(50);
        theQueue.insertRight(60);
        theQueue.insertRight(70);
        theQueue.insertRight(80);
        theQueue.display();

    }


}
