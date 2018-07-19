package Chapter5.FirstLast;

public class FirstLastList {
    private Link first;
    private Link last;

    public FirstLastList(){
        first = null;
        last = null;

    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(int id){
        Link newLink = new Link(id);
        if ( isEmpty()){
            last = newLink;
        }
        newLink.next = first;
        first = newLink;
    }
    public void insertLast(int id){
        Link newLink = new Link(id);
        if (isEmpty()){
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }
    public int deleteFirst(){
        int temp = first.iData;
        if (first.next == null){
            last = null;
        }
        first = first.next;
        return temp;
    }
    public void displayList(){
        System.out.println("List (first--> last) ");
        Link current = first;
        while (current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
    }

    public void deleteLast() {
    }
}
