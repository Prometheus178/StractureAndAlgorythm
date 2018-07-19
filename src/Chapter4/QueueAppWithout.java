package Chapter4;

public class QueueAppWithout {
    public static void main(String[] args) {
        QueueWithoutItems theQueue = new QueueWithoutItems(10);
        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40); // Вставка 4 элементов
        theQueue.remove();
        theQueue.remove();
        theQueue.remove(); // Извлечение 3 элементов
        theQueue.insert(50);
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);

        while (!theQueue.isEmpty()){

            long n = theQueue.remove();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println("");

    }
}
