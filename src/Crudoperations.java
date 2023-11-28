import java.util.ArrayList;
import java.util.Scanner;

public class Crudoperations {
    int count=0;
    Scanner sc = new Scanner(System.in);

    void Addcontact(Address a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String fname = sc.next();
        System.out.println("Enter last name");
        String lname = sc.next();
        System.out.println("enter phone number");
        String phone = sc.next();
        System.out.println("enter zip code");
        int zipcode = sc.nextInt();
        System.out.println("enter city");
        String City = sc.next();
        System.out.println("enter relation");
        String relation = sc.next();

        Person p = new Person(fname, lname, phone, zipcode, City, relation);
        a.contactlist.add(p);
    }

    void searchByFirstName(Address a, String n1) {
        boolean flag = false;
        for (Person p : a.contactlist) {
            if (p.getFname().equalsIgnoreCase(n1)) {
                System.out.println(p);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Name is not found");
        }
    }

    void searchByPhoneNumber(Address a, String p1) {
        boolean flag = false;
        for (Person p : a.contactlist) {
            if (p.getPhnNo().equalsIgnoreCase(p1)) {
                System.out.println(p);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Phone number not found");
        }
    }

    void deleteContactByFname(Address a, String d1) {
        boolean flag = false;
        for (Person p : a.contactlist) {
            if (p.getFname().equalsIgnoreCase(d1)) {
                a.contactlist.remove(p);
                System.out.println("User deleted");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("user not found");
        }
    }

    void updatePhoneNumberByName(Address a, String u1) {
        boolean flag = false;
        for (Person p : a.contactlist) {
            if (p.getFname().equalsIgnoreCase(u1)) {
                System.out.println("Enter new phone number");
                String ph = sc.next();
                p.setPhnNo(ph);
                System.out.println("phone number is updated");
            }
        }
    }

    void Updatecity(Address x1, String c1) {

            for (Person p : x1.contactlist) {
                if (c1.equalsIgnoreCase(p.getCity())) {
                    System.out.println(x1.Name + " : " + p);
                    count++;
                }

            }


    }

}
