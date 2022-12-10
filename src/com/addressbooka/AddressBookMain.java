package com.addressbooka;

import java.util.*;

public class AddressBookMain {
    public static void main(String[] args) {
        List<AddressBook> c = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int ch;
        do {
            System.out.println("Welcome to Address Book");
            System.out.println("1. Press to  Add ");
            System.out.println("2.Press to Display");
            System.out.println("3. Press to Edit");
            System.out.println("Enter your choice :");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the first name :");
                    String firstName = sc1.nextLine();
                    System.out.println("Enter the last name:");
                    String lastName = sc1.nextLine();
                    System.out.println("Enter the Address :");
                    String address = sc1.nextLine();
                    System.out.println("Enter the city :");
                    String city = sc1.nextLine();
                    System.out.println("Enter the State :");
                    String state = sc1.nextLine();
                    System.out.println("Enter the PhoneNumber :");
                    int phoneNumber = sc.nextInt();
                    System.out.println("Enter the Email :");
                    String email = sc1.nextLine();
                    c.add(new AddressBook(firstName, lastName, address, city, state, phoneNumber, email));
                    break;
                case 2:
                    System.out.println(".....................................");
                    Iterator<AddressBook> i = c.iterator();
                    while (i.hasNext()) {
                        AddressBook a = i.next();
                        System.out.println(a);
                    }
                    System.out.println(".....................................");
                    break;

                case 3:
                    boolean found = false;
                    System.out.println("Enter first name to edit record:");
                    firstName = sc1.nextLine();
                    System.out.println(".....................................");
                    ListIterator<AddressBook> li = c.listIterator();
                    while (li.hasNext()) {
                        AddressBook a = li.next();
                        if (a.getFirstName() == firstName) {
                            System.out.println("Enter the new First name:");
                            firstName = sc1.nextLine();
                            System.out.println("Enter the new last name:");
                            lastName = sc1.nextLine();
                            System.out.println("Enter the new Address :");
                            address = sc1.nextLine();
                            System.out.println("Enter the new city :");
                            city = sc1.nextLine();
                            System.out.println("Enter the new State :");
                            state = sc1.nextLine();
                            System.out.println("Enter the new PhoneNumber :");
                            phoneNumber = sc.nextInt();
                            System.out.println("Enter the new Email :");
                            email = sc1.nextLine();
                            li.set(new AddressBook(firstName, lastName, address, city, state, phoneNumber, email));
                            found = true;
                        }
                    }
                    System.out.println("........................................");
                    if (!found) {
                        System.out.println("Record not found");
                    } else {
                        System.out.println("Record edited successfully");
                    }
                    System.out.println("...........................");
                    break;
                }
            } while (ch != 0) ;
        }
    }