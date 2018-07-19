package Chapter5.exercises;

import Chapter5.FirstLast.Link;

public class Dec2link {
    //insertLeft() / insertRight() и removeLeft() / removeRight() .
    class Link2{
        public int iData;
        public Link2 next;
        public Link2 previous;

        Link2(int id){
            iData = id;
        }
        public void displayLink(){
            System.out.println(iData + " ");
        }
    }
    private Link2 first;
    private Link2 last;


    Dec2link(){
        first = null;
        last = null;

    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int id){
        Link2 newLink = new Link2(id);

        if (isEmpty()){
            last = newLink;
        } else {
            first.previous = newLink;
        }
        newLink.next = first;
        first = newLink;
    }
    public void insertLast(int id){
        Link2 newLink = new Link2(id);
        if (isEmpty()){
            first = newLink;
        } else {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }

    public int getFirst() {
        return first.iData;
    }

    public int getLast() {
        return last.iData;
    }
}
class Dec2LinkApp{
    public static void main(String[] args) {
        Dec2link dec = new Dec2link();
        dec.insertFirst(5);
        dec.insertFirst(3);
        dec.insertFirst(4);
        dec.insertLast(1);
        dec.insertLast(2);
        dec.insertLast(3);
        System.out.println(dec.getFirst());
        System.out.println(dec.getLast());


    }
}
