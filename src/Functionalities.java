import java.util.ArrayList;
import java.util.Scanner;
public class Functionalities {
    Menu f1 = new Menu();
    Crudoperations c1 = new Crudoperations();
    Scanner sc = new Scanner(System.in);
    ArrayList<Address> aList = new ArrayList<>();
    public void refactoraddress(Address a1) {

        //Menu based programmin
        int choice;
        do {
            System.out.println("Welcome to AddressBook");
            f1.display();
            int input = sc.nextInt();
            switch (input) {
                case 1 -> c1.Addcontact(a1);
                case 2 -> System.out.println(a1.contactlist);
                case 3 -> {
                    System.out.println("Enter the name you want to search");
                    String s1 = sc.next();
                    c1.searchByFirstName(a1, s1);
                }
                case 4 -> {
                    System.out.println("Enter the Phone Number you want to search");
                    String s1 = sc.next();
                    c1.searchByPhoneNumber(a1, s1);
                }
                case 5 -> {
                    System.out.println("Enter the Name you want to delete");
                    String s1 = sc.next();
                    c1.deleteContactByFname(a1, s1);
                }
                case 6 -> {
                    System.out.println("Enter the Name you want to update the phone number");
                    String s1 = sc.next();
                    c1.updatePhoneNumberByName(a1, s1);
                }
                default -> System.out.println("Enter valid option");
            }
            System.out.println("Enter 0 to exit");
            choice = sc.nextInt();
        } while (choice != 0);
    }

}

