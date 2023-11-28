import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main1 m1=new Main1();
        Scanner sc = new Scanner(System.in);

        //creating multiple instance of AddressBook
        Address a = new Address("Book1");
        Address b = new Address("Book2");
        Address c = new Address("Book3");

        m1.aList.add(a);
        m1.aList.add(b);
        m1.aList.add(c);

    }
}




