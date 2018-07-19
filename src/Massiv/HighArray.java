package Massiv;

public class HighArray {
    private long[] a;
    private int nElems;

    public HighArray(int max){
        a = new long[max];
        nElems = 0;
    }
    public boolean find(long searchKey){
        int j;
        for ( j =0;j < nElems;j++){
            if (a[j] == searchKey){
                break;
            }
        }
        if (j == nElems){
            return false;
        }else{
            return true;
        }
    }
    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }
    public void getMax(){
        int i;
        long max = a[0];
        for (i = 0;i < nElems;i++) {
            if (a[i] > max) {
                max = a[i];

            }
        }
        System.out.println(max);
        if(i == 0){
            System.out.println(-1);
        }
    }

    public void removeMax(){
        int i;
        long max = a[0];
        for (i = 0;i < nElems;i++){
            if (a[i] > max){
                max = a[i];

            }

        }
        for (int k = i;k < nElems-1;k++){
            a[k] = a[k+1];
        }
        nElems--;
    }
    public long size(){
        return nElems;
    }
    public int getValue(int index){
        return (int) a[index];
    }

    public boolean delete(long value){
        int j;
        for (j = 0; j < nElems;j++){
            if (value == a[j]){
                break;
            }
        }
        if (j == nElems){
            return false;
        }
        else{
            for (int k = j;k < nElems;k++){
                a[k] = a[k+1];
            }
            nElems--;
            return true;
        }
    }

    public void display(){
        for (int j = 0;j < nElems;j++){
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }

    public void noDups(){
        int i,k = 0;
        for (i = 0; i < nElems;i++) {
            if (a[i] == a[i + 1]) {
                delete(a[i]);
            }
        }
    }


}
