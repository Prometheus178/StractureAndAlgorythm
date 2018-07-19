package Massiv;

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray array = new HighArray(maxSize);
        array.insert(23);
        array.insert(23);
        array.insert(23);
        array.insert(14);
        array.insert(14);
        array.insert(46);
        array.insert(77);
        array.insert(68);
        array.insert(99);
        array.insert(00);

        array.display();
        int searchKey = 33;
        if (array.find(searchKey)){
            System.out.println("Found "+ searchKey);
        }
        else{
            System.out.println("Can't find "+ searchKey);
        }
        /*array.delete(5);
        array.delete(25);
        array.delete(0);
        array.display();
        array.getMax();
        array.removeMax();
        array.display();*/
        array.noDups();
        array.display();

    }

}
