package Chapter3;

public class ArrayBub {
    private long a[];
    private int nElems;

    public ArrayBub(int max){
        a = new long[max];
        nElems = 0;
    }
    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }
    public void display(){
        for (int i = 0;i < nElems;i++ ){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }
    public void bubbleSort(){
        int out,in;
        for (out = nElems-1;out > 1;out--) {
            for (in = 0; in < out; in++) {
                if (a[in] > a[in + 1]) {
                    swap(in, in + 1);
                }

            }
        }
    }
    public void anotherBubbleSort(){
        int out,in,min;
        min = 0;
        out = nElems -1;

        while (min < out){
                for (in = min; in < out; in++) {
                    if (a[in] > a[in + 1]) {
                        swap(in, in + 1);
                    }
                }
                out--;
                for (in = out; in > min;in--){
                    if (a[in-1]> a[in]){
                            swap(in,in-1);
                    }
                }
                min++;
        }

    }
    public void oddEvenSort(){
        int fir,sec,out;


        for (out = nElems-1;out > 1 ;out--){
            for (fir = 0;fir < out;fir++) {
                if (a[fir % 2] == 0) {
                    if (a[fir] > a[fir + 1])
                        swap(a[fir], a[fir + 1]);
                }
            }
            for (sec = 0;sec < out;sec++) {
                if (a[sec % 2] != 0) {
                    if (a[sec] > a[sec + 1])
                        swap(a[sec], a[sec + 1]);
                }
            }
        }


    }
    private void swap(long one, long two){
        long temp =  a[(int) one];
        a[(int) one] = a[(int) two];
        a[(int) two] = temp;
    }

}
