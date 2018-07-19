package Chapter5.FirstLast;

public class FirstLastApp {
    public static void main(String[] args)
    {
// Создание нового списка
        FirstLastList theList = new FirstLastList();
        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66); // Вставка в начало списка
        theList.insertLast(11);
        theList.insertLast(33);
        theList.insertLast(55); // Вставка в конец списка
        theList.displayList(); // Вывод содержимого списка
        theList.deleteFirst();
        theList.deleteFirst();
        // Удаление первых двух элементов
        theList.displayList();
// Повторный вывод
    }
}
