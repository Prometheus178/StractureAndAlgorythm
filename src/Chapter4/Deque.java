package Chapter4;

public class Deque {
    private int maxSize;
    private int[] dec;
    private int left;
    private int rigth;
    private int nItems;

    public Deque(int max) {
        maxSize = max;
        dec = new int[maxSize];
        left = 0;
        rigth = 1;
        nItems = 0;
    }

    public void insertLeft(int j) {

        left--;
        if (left < 0) {
            left = maxSize - 1;
        }
        dec[left] = j;

        nItems++;
    }

    public void insertRight(int j) {
        rigth++;
        if (rigth == maxSize) {
            rigth = 0;
        }
        dec[rigth] = j;

        nItems++;
    }

    public int removeLeft() {
        int temp = dec[left];
        left++;
        if (left >= maxSize) {
            left = 0;
        }
        nItems--;
        return temp;
    }

    public int removeRigth() {
        int temp = dec[rigth];
        rigth--;
        if (rigth < 0) {
            rigth = maxSize-1;
        }
        nItems--;
        return temp;

    }

    public boolean isEmpty() {
        return (nItems == 0);

    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public void display() {
        System.out.println("Left: " + left + " " + "Rigth "+ rigth);
        int temp = left;
        for (int i = 0; i < nItems; i++) {
            System.out.print(dec[temp] + " ");
            temp++;
            if (temp >= maxSize) {
                temp = 0;
            }
        }
        System.out.println();
    }


}
