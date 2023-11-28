import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Address> aList = new ArrayList<>();
        Menu f1 = new Menu();
        Crudoperations c1 = new Crudoperations();
        Functionalities m1 = new Functionalities();
        Scanner sc = new Scanner(System.in);

        //creating multiple instance of AddressBook
        Address a = new Address("Book1");
        Address b = new Address("Book2");
        Address c = new Address("Book3");

        aList.add(a);
        aList.add(b);
        aList.add(c);

        int z = 1;
        do {
            f1.menu();
            int inp = sc.nextInt();
            switch (inp) {
                case 1 -> {
                    System.out.println("Enter the address book you want to search");
                    String searchAddressBook = sc.next();
                    for (Address a1 : aList) {
                        if (a1.Name.equalsIgnoreCase(searchAddressBook)) {
                            m1.refactoraddress(a1);
                        }
                    }
                }

                case 2 -> {
                    for (Address x1 : aList) {
                        System.out.println(x1.Name + "  : " + x1.contactlist);
                    }
                }

                case 3 -> {
                    System.out.println("Enter the city you want to display");
                    String City = sc.next();
                    for (Address x1 : aList) {
                        c1.Updatecity(x1, City);
                    }
                    System.out.println("People from the " + City + " city are " + c1.count);
                }

                default -> z = 0;
            }
        } while (z != 0);
    }
}






