package Chapter3;

import java.sql.SQLOutput;

public class ArrayIns {
    private long a[];
    private int nElems;

    public ArrayIns(int max){
        a = new long[max];
        nElems = 0;
    }
    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }
    public void display(){
        for (int i=0; i < nElems;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public void insertionSort(){
        int in,out;
        for (out = 1;out < nElems;out++){
            long temp = a[out];
            in = out;
            while (in > 0 && a[in-1] >= temp){
                a[in] = a[in - 1];
                in--;
            }
            a[in] = temp;
        }
    }
    public void anotherInsertionSort(){
        int in,out,copy,compare;
        copy = 0;
        compare = 0;

        for (out = 1;out < nElems;out++){
            long temp = a[out];
            in=out;
            while (in > 0 && a[in - 1] >= temp){
                a[in] = a[in - 1];
                in--;
                compare++;
            }
            a[in] = temp;
            copy++;
        }
        System.out.println("Copy: "+copy );
        System.out.println("Compare: " + compare);
    }

    public void noDupsInsertionSort(){
        int out,in,dups;
        dups = -1;
        for (out = 1;out < nElems;out++){
            long temp = a[out];
            in = out;
            while (in> 0 && a[in -1] >=temp){
                if (a[in] == a[out]){
                    a[in] = dups;
                }
                a[in] =a[in -1];
                in--;
            }
            a[in] = temp;

        }
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

    public void NoDups(){
        for (int i=0;i< nElems;i++){
            if (a[i] == a[i+1]){
                delete(a[i]);
            }
        }
    }
}
