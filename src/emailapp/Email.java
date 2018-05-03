package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "company.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("First name: " + this.firstName + ", Last name: " + this.lastName);
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Password: " + this.password);
        email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department.toLowerCase() + "." + companySuffix;
        System.out.println("Email: " + email);
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

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(int i = 0; i < length; i++) {
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
}
