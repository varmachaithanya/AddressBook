import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Crudoperations c1 = new Crudoperations();
        Functionalities f1 = new Functionalities();
        Scanner sc = new Scanner(System.in);
        ArrayList<Address> aList = new ArrayList<>();

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
                            //Menu based programming
                            int choice;
                            do {
                                System.out.println("Welcome to AddressBook");
                                f1.display();
                                int input = sc.nextInt();
                                switch (input) {
                                    case 1 -> c1.Addcontact(a1);
                                    case 2 -> System.out.println(a1.contactlist);
                                    case 3 -> c1.searchByFirstName(a1, f1.case3());
                                    case 4 -> c1.searchByPhoneNumber(a1, f1.case4());
                                    case 5 -> c1.deleteContactByFname(a1, f1.case5());
                                    case 6 -> c1.updatePhoneNumberByName(a1, f1.case6());
                                    default -> System.out.println("Enter valid option");
                                }
                                System.out.println("Enter 0 to exit");
                                choice = sc.nextInt();
                            } while (choice != 0);
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
                    System.out.println("People from the "+ City + " city are "+ c1.count);


                }
                default -> z = 0;
            }
        } while (z != 0);
    }
}




