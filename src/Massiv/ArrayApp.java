package Massiv;

public class ArrayApp {
    public static void main(String[] args) {
        long[] arr;
        arr = new long[100];
        int nElems = 0;
        int j;
        long SearchKey;

        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 33;
        arr[3] = 44;
        arr[4] = 55;
        arr[5] = 66;
        arr[6] = 88;
        arr[7] = 22;
        arr[8] = 11;
        arr[9] = 00;
        nElems = 10;

        for (j = 0; j< nElems;j++){
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        SearchKey = 66;
        for ( j = 0; j < nElems; j++){
            if (arr[j] == SearchKey)
                break;
        }
        if ( j == nElems)
            System.out.println("Can't find " + SearchKey);
        else
            System.out.println("Found " + SearchKey);

        SearchKey = 55;
        for (j=0; j<nElems;j++){
            if (arr[j]== SearchKey)
                break;
        }
        for (int k = j; k < nElems-1;k++){
            arr[k] = arr[k+1];
        }
        nElems--;
        for (j = 0; j< nElems;j++){
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }
}
