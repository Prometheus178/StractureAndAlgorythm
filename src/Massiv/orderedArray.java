package Massiv;

public class orderedArray {

    private long[] Array;
    private int nElems;

    public orderedArray(int max) {
        Array = new long[max];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    public int find(long Searchkey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;
        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (Array[curIn] == Searchkey) {
                return curIn;
            } else if (lowerBound > upperBound) {
                return nElems;
            } else {
                if (Array[curIn] < Searchkey) {
                    lowerBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }

    public void insert(long value) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (Array[j] > value) {
                break;
            }
        }
        for (int k = nElems; k > j; k--) {
            Array[k] = Array[k - 1];
        }
        Array[j] = value;
        nElems++;
    }

    public long getValue(int index) {
        return Array[index];
    }

    public void setValue(int index, long value) {
        Array[index] = value;
    }

    public boolean delete(long value) {
        int j = find(value);
        if (j == nElems) {
            return false;
        } else {
            for (int k = j; k < nElems; k++) {
                Array[k] = Array[k + 1];
            }
            nElems--;
            return true;
        }
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(Array[j] + " ");
        }
        System.out.println();
    }

    public static orderedArray merge(orderedArray a, orderedArray b) {
        int len = a.size() + b.size();
        orderedArray c = new orderedArray(len*2);

        int i = 0, j = 0, k = 0;
        while (i < a.size() && j < b.size()) {
            if (a.getValue(i) <= b.getValue(j)) {
                c.setValue(k, a.getValue(i));
                i++;
            }
            if (a.getValue(i) >= b.getValue(j)) {
                c.setValue(k, b.getValue(j));
                j++;
            }
            c.nElems++;
            k++;
        }
        while (i < a.size()) {
            c.setValue(k, a.getValue(i));
            c.nElems++;
            k++;
            i++;
        }

        while (j < b.size()) {
            c.setValue(k, b.getValue(j));
            c.nElems++;
            k++;
            j++;
        }
        return c;
    }


}