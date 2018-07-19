package Massiv;

import java.util.Random;

public class OrderedApp {
    public static void main(String[] args) {
        int maxSize = 100;
        int size = 10;
        orderedArray array = new orderedArray(maxSize);
        array.insert(11);
        array.insert(32);
        array.insert(53);
        array.insert(24);
        array.insert(75);
        array.insert(20);
        array.insert(17);
        array.insert(89);
        array.insert(9);
        array.insert(0);
        int SearchKey = 10;
        if (array.find(SearchKey) != array.size()){
            System.out.println("Found " + SearchKey);
        }
        else{
            System.out.println("Can't find " + SearchKey);
        }
        array.display();

        array.delete(75);
        array.delete(11);
        array.delete(24);
        array.display();

        orderedArray array1 = new orderedArray(size);
        orderedArray array2 = new orderedArray(size);
        Random random = new Random();
        for (int i = 0;i < size;i++) {
            array1.insert(random.nextInt(100));
        }
        for (int j = 0;j < size;j++) {
            array2.insert(random.nextInt(100));
        }
        array1.display();
        array2.display();
        orderedArray array3 = orderedArray.merge(array1,array2);
        array3.display();








    }
}
