package Massiv;

public class lowArray {
    private long[] a;

    public lowArray(int size){
        a = new long[size];
    }
    public void setElem(int index, long value){
        a[index] = value;
    }
    public long getElem(int index){
        return a[index];
    }
}