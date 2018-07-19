package Chapter5.FirstLast;

public class Link {
    public int iData;
    public Link next;

    public Link(int id){
        iData = id;
    }
    public void displayLink(){
        System.out.println(iData + " ");
    }
}
