package Chapter3;

import java.sql.SQLOutput;

public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String last, String first, int a){
        lastName= last;
        firstName = first;
        age= a;
    }

    public void displayPerson(){
        System.out.print("lastName " + lastName);
        System.out.print(" FirstName " + firstName);
        System.out.println(" Age " + age);
    }
    public String getLast(){
        return lastName;
    }

}
