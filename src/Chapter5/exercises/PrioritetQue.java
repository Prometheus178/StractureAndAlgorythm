package Chapter5.exercises;

import Chapter5.FirstLast.Link;

public class  PrioritetQue {
    private Link first;
    private Link last;

    PrioritetQue() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertSort(int k) {
        Link newLink = new Link(k);
        Link previous= null;
        Link current = first;
        while (current != null && k > current.iData){
            previous= current;
            current = current.next;
        }
        if (previous == null){
            first = newLink;
        } else {
            previous.next = newLink;
        }
        newLink.next = current;
    }

    public void displayQue(){
        first.displayLink();
    }
    public int getFirst(){
        return first.iData;
    }
}

class QueApp {
    public static void main(String[] args) {
        PrioritetQue newQue = new PrioritetQue();
        newQue.insertSort(4 );
        newQue.insertSort(7);
        newQue.insertSort(1);
        newQue.insertSort(6);
        System.out.println(newQue.getFirst());
    }
}






