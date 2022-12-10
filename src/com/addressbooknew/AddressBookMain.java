package com.addressbooknew;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        List<AddressBook> addressBooks =new ArrayList<AddressBook>();
        Scanner sc =new Scanner(System.in);
        Scanner sc1 =new Scanner(System.in);
        int choice;
        do {
            System.out.println("Welcome to Address Book");
            System.out.println(" Press 1 to Add & 0 for exit");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the first name :");
                    String firstName = sc1.nextLine();
                    System.out.println("Enter the last name:");
                    String lastName = sc1.nextLine();
                    System.out.println("Enter the Address :");
                    String address =sc1.nextLine();
                    System.out.println("Enter the city :");
                    String city = sc1.nextLine();
                    System.out.println("Enter the State :");
                    String state = sc1.nextLine();
                    System.out.println("Enter the PhoneNumber :");
                    int phoneNumber =sc.nextInt();
                    System.out.println("Enter the Email :");
                    String email = sc1.nextLine();
                    addressBooks.add(new AddressBook(firstName,lastName,address,city,state,phoneNumber,email));
                    break;
            }
        }
        while (choice != 0);
    }
}
