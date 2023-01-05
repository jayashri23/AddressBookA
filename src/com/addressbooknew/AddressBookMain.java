package com.addressbooknew;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
    public static Scanner sc = new Scanner(System.in);
    public static List<AddressBook> list = new ArrayList<AddressBook>();
    public static void main(String[] args) {
        System.out.println("******************Welcome to AddressBook System************************");
        AddressBookDetails addressBook = new AddressBookDetails();


        boolean flag = true;

        while(flag) {

            System.out.println("1.Add Contact");
            System.out.println("2.Display Contact");
            System.out.println("3.Edit Contact");
            System.out.println("4.Delete Contact");
            System.out.println("5.Search Contact");
            System.out.println("6.Count Contact");
            System.out.println("7.Sort Contact");
            System.out.println("8.Write Data to File");
            System.out.println("9.Read Data to File");
            System.out.println("10.Exit");
            System.out.println("Enter Choice: ");
            System.out.println("--------------------------------------------------------");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("--------------------------------------------------------");
                    addressBook.addDetails();

                    System.out.println("--------------------------------------------------------");
                    break;


                case 2:
                    System.out.println("--------------------------------------------------------");
                    addressBook.displayDetails();
                    System.out.println("--------------------------------------------------------");
                    break;

                case 3:
                    System.out.println("--------------------------------------------------------");
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
                    System.out.println("--------------------------------------------------------");
                    addressBook.searchDetails();
                    System.out.println("--------------------------------------------------------");
                    break;

                case 6:
                    System.out.println("--------------------------------------------------------");
                    addressBook.countByStateOrCity();
                    System.out.println("--------------------------------------------------------");
                    break;
                case 7:
                    System.out.println("--------------------------------------------------------");
                    addressBook.sortDetails();
                    System.out.println("--------------------------------------------------------");
                    break;

                case 8:
                    System.out.println("--------------------------------------------------------");
                    addressBook.writeData();
                    System.out.println("--------------------------------------------------------");
                    break;

                case 9:
                    System.out.println("--------------------------------------------------------");
                    addressBook.readData();
                    System.out.println("--------------------------------------------------------");
                    break;


                case 10:
                    flag = false;
                    break;

            }
        }
    }
}
