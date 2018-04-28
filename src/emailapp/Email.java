package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
    }

    private String setDepartment() {
        System.out.print("Select department:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter code:");
        Scanner sc = new Scanner(System.in);
        int selectedCode = sc.nextInt();

        if(selectedCode == 1) {
            return "sales";
        } else if(selectedCode == 2) {
            return "development";
        } else if(selectedCode == 3) {
            return "accounting";
        } else {
            return "";
        }
    }
}
