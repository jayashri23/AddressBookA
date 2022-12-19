package com.address9to11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class AdressBookDetails {

    public static Scanner sc = new Scanner(System.in);
    public Collection<AddressBook> list = new ArrayList<AddressBook>();

    public void addDetails() {
        System.out.println("Enter the Details: ");
        int check = 0;
        String firstName = null; // For ensure no duplicate entery accepts
        while (check == 0) {
            System.out.println("Enter the First name: ");
            firstName = sc.next();
            if (checkUniqueName(firstName)) {
                System.out.println("Name already exist!!");
            } else {
                check = 1;
            }
        }
        System.out.println("Enter the Last name: ");
        String lastName = sc.next();
        System.out.println("Enter the Address: ");
        String address = sc.next();
        System.out.println("Enter the City: ");
        String city = sc.next();
        System.out.println("Enter the State: ");
        String state = sc.next();
        System.out.println("Enter the Zip code: ");
        String zip = sc.next();
        System.out.println("Enter the Email: ");
        String email = sc.next();
        System.out.println("Enter the Phone Number: ");
        String phoneNumber = sc.next();

        list.add(new AddressBook(firstName, lastName, address, city, state, zip, email, phoneNumber));

    }
    public void displayDetails() {
        if (list.isEmpty()) {
            System.out.println("Not Found!");
        } else {
            for (AddressBook contact : list) {
                System.out.println(contact);
            }
        }

    }
    public boolean updateDetails(String Name) {
        int flag = 0;
        for (AddressBook contact : list) {
            if (contact.getfirstName().equals(Name)) {
                System.out.println("Enter option to Update:");
                System.out.println("1.FirstName");
                System.out.println("2.LastName");
                System.out.println("3.Address");
                System.out.println("4.City");
                System.out.println("5.State");
                System.out.println("6.Zip");
                System.out.println("7.Phone Number");
                System.out.println("8.Email");

                int ch = sc.nextInt();
                switch (ch) {
                    case 1: {
                        System.out.println("Enter Updated First Name: ");
                        String firstName = sc.next();
                        contact.setFirstName(firstName);
                        break;
                    }
                    case 2: {
                        System.out.println("Enter Updated last name: ");
                        String lastName = sc.next();
                        contact.setLastName(lastName);
                        break;
                    }
                    case 3: {
                        System.out.println("Enter Updated Address: ");
                        String address = sc.next();
                        contact.setAddress(address);
                        break;
                    }
                    case 4: {
                        System.out.println("Enter Updated City: ");
                        String city = sc.next();
                        contact.setCity(city);
                        break;
                    }
                    case 5: {
                        System.out.println("Enter Updated State: ");
                        String state = sc.next();
                        contact.setState(state);
                        break;
                    }
                    case 6: {
                        System.out.println("Enter Updated Zip : ");
                        String zip = sc.next();
                        contact.setZip(zip);
                        break;
                    }
                    case 7: {
                        System.out.println("Enter Updated Phone Number:");
                        String phoneNumber = sc.next();
                        contact.setPhoneNumber(phoneNumber);
                        break;
                    }
                    case 8: {
                        System.out.println("Enter Updated Email: ");
                        String email = sc.next();
                        contact.setEmail(email);
                        break;
                    }

                }

                flag = 1;
                break;
            }
        }
        return flag == 1;
    }
    public boolean deleteDetail(String name) {
        int flag = 0;
        for (AddressBook contact : list) {
            if (contact.getfirstName().equals(name)) {
                list.remove(contact);
                flag = 1;
                break;
            }
        }
        return flag == 1;
    }
    public boolean checkUniqueName(String name) {
        int flag = 0;
        for (AddressBook contact : list) {
            if (contact.getfirstName().equals(name)) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            return true;
        }
        return false;
    }
}
