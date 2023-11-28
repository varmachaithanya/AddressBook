import java.util.Scanner;

public class Functionalities {
    Scanner sc=new Scanner(System.in);
    public String case3(){
        System.out.println("Enter the name you want to search");
        String s1 = sc.next();
        return  s1;
    }
    public String case4(){
        System.out.println("Enter the Phone Number you want to search");
        String s1 = sc.next();
        return s1;
    }
    public String case5(){
        System.out.println("Enter the Name you want to delete");
        String s1 = sc.next();
        return s1;
    }
    public String case6(){
        System.out.println("Enter the Name you want to update the phone number");
        String s1 = sc.next();
        return s1;
    }
    public  void display(){
        System.out.println("Press \n1:Adding A contact\n2: Displaying All Contact\n3: Search by first name\n4: Search by Phone number\n5: Delete by USer First name\n6: Update phone Number");
    }
    public void menu(){
        System.out.println("1 : Select Address Book\n2: Display all the address book\n3:Find all contacts of a city");

    }

}
