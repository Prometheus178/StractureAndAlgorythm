package Chapter6;

public class Triangle {
    public static void main(String[] args) {
        int number = triangle(5);
    }

    static int triangle(int n){
        System.out.println(n);
        if (n ==1){
            return 1;
        }else {
            int temp = n + triangle(n - 1);
            System.out.println(temp);
            return temp;
        }
    }
}
