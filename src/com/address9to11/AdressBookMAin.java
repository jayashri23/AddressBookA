package com.address9to11;

import java.util.Scanner;

public class AdressBookMAin {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("******************Welcome to AddressBook System************************");
        AdressBookDetails addressBook = new AdressBookDetails();

        boolean flag = true;

        while(flag) {

            System.out.println("1.Add Contact");
            System.out.println("2.Display Contact");
            System.out.println("3.Edit Contact");
            System.out.println("4.Delete Contact");
            System.out.println("5.Exit");
            System.out.println("Enter Choice: ");

            int option = sc.nextInt();

            switch (option)
            {
                case 1:
                    addressBook.addDetails();
                    break;

                case 2:
                    addressBook.displayDetails();
                    break;

                case 3:
                    System.out.println("Enter the FirstName to edit details: ");
                    String firstName = sc.next();

                    boolean update = addressBook.updateDetails(firstName);
                    if (update == true) {
                        System.out.println("Record Updated SuccessFully!!");
                        System.out.println("--------------------------------------------------------");
                    } else {
                        System.out.println("Record Not Found!!");
                        System.out.println("--------------------------------------------------------");
                    }
                    break;

                case 4:
                    System.out.println("Enter the FirstName to deleted:");
                    firstName = sc.next();
                    boolean listDeleted = addressBook.deleteDetail(firstName);
                    if (listDeleted) {
                        System.out.println("Record Deleted SuccessFully");
                        System.out.println("--------------------------------------------------------");
                    } else {
                        System.out.println("Record Not Found!!");
                        System.out.println("--------------------------------------------------------");
                    }
                    break;

                case 5:
                    flag =false;
                    break;

            }
        }
    }
}