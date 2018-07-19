package Massiv;

public class lowArrayApp {
    public static void main(String[] args) {
        lowArray array = new lowArray(100);
        int nElems = 0;
        int j;

        array.setElem(0, 77);
        array.setElem(1, 71);
        array.setElem(2, 72);
        array.setElem(3, 74);
        array.setElem(4, 76);
        array.setElem(5, 75);
        array.setElem(6, 78);
        array.setElem(7, 79);
        array.setElem(8, 70);
        array.setElem(9, 73);
        nElems = 10;

        for (j = 0; j< nElems;j++)
            System.out.print(array.getElem(j) + " ");
        System.out.println();

        int searchKey = 75;
        for (j = 0; j< nElems;j++){
            if (array.getElem(j) == searchKey){
                break;
            }
        }
        if (j == nElems){
            System.out.println("Can't find " + searchKey);
        }
        else{
            System.out.println("Found " + searchKey);
        }
        searchKey = 74;
        for (j = 0; j < nElems;j++){
            if (array.getElem(j) == searchKey){
                break;
            }
        }
        for (int k = j; k < nElems-1;k++){
            array.setElem(k,array.getElem(k+1));
        }
        nElems--;
        for (j = 0; j<nElems;j++){
            System.out.print(array.getElem(j) + " ");
        }
        System.out.println();






    }
}
