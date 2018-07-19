package Chapter4;

public class QueueApp {
    public static void main(String[] args) {
        Queue theQueue = new Queue(5); // Очередь из 5 ячеек

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
        theQueue.insert(80); // Вставка еще 4 элементов
                                //с циклическим    переносом)

        theQueue.display();
    }
}
