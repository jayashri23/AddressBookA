package com.addressbooka;

import java.util.*;

public class AddressBookMain {
    public static void main(String[] args) {
        List<AddressBook> c = new ArrayList<AddressBook>(); //Collection of data inside this//Acees functinality of list iterator
        Scanner sc = new Scanner(System.in); //For taking input as a integer
        Scanner sc1 = new Scanner(System.in); //For taking input as a string
        System.out.println("**** WELCOME TO ADDRESSBOOK PROGRAM ****");
        int ch; //choice variable
        do {


            System.out.println("\n1.ADD");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.println("Enter Your Choice:");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter the First Name:");
                    String firstName = sc1.nextLine();
                    System.out.print("Enter the Last Name:");
                    String lastName = sc1.nextLine();
                    System.out.print("Enter the Address:");
                    String address = sc1.nextLine();
                    System.out.print("Enter the City:");
                    String city = sc1.nextLine();
                    System.out.print("Enter the State:");
                    String state = sc1.nextLine();
                    System.out.print("Enter the Zip:");
                    int zip = sc.nextInt();
                    System.out.print("Enter the PhoneNumber:");
                    int phoneNumber = sc.nextInt();
                    System.out.print("Enter the Email:");
                    String email = sc1.nextLine();
                    System.out.print("Record Added SucessFully");
                    c.add(new AddressBook(firstName, lastName, address, city, state, zip, phoneNumber, email));
                    checkUniqueName(firstName);
                    break;

                case 2:
                    System.out.println("---------------------------------");//Display the record
                    Iterator<AddressBook> i = c.iterator();//function retrieve each record one by one
                    while (i.hasNext()) {
                        AddressBook a = i.next();
                        System.out.println(a);

                    }
                    System.out.println("---------------------------------");

                    break;


                case 3:
                    boolean found = false;  // For searching
                    System.out.print("Enter the First Name to search:");
                    firstName = sc1.nextLine();
                    System.out.println("---------------------------------");
                    i = c.iterator();//function retrieve each record one by one/instance of iterator
                    while (i.hasNext()) {
                        AddressBook a = i.next();
                        if (a.getfirstName() == firstName) {
                            System.out.println(a);
                            System.out.println("Record search Successfully. ");
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Record not found");
                    }
                    System.out.println("---------------------------------");
                    break;
                case 4:
                    found = false;  // Delete the record
                    System.out.println("Enter Name to Delete Record:");
                    firstName = sc1.nextLine();
                    System.out.println("---------------------------------");
                    i = c.iterator();//function retrieve each record one by one
                    while (i.hasNext()) {
                        AddressBook a = i.next();
                        if (a.getfirstName() == firstName) {
                            i.remove();
                            ;
                            found = true;
                        }
                    }
                    System.out.println("---------------------------------");
                    if (!found) {
                        System.out.println("Record not found");
                    } else {
                        System.out.println("Record Delete SucessFully:");
                    }
                    System.out.println("---------------------------------");
                    break;

                case 5:
                    found = false;  // Update the record
                    System.out.println("Enter Name to Update Record:");
                    firstName = sc1.nextLine();
                    System.out.println("---------------------------------");
                    ListIterator<AddressBook> li = c.listIterator();//fInitialize collection to list iterator
                    while (li.hasNext()) {
                        AddressBook a = li.next();
                        if (a.getfirstName() == firstName) {
                            System.out.print("Enter the New First Name:");
                            firstName = sc1.nextLine();
                            System.out.print("Enter the New Last Name:");
                            lastName = sc1.nextLine();
                            System.out.print("Enter the New Address:");
                            address = sc1.nextLine();
                            System.out.print("Enter the New City:");
                            city = sc1.nextLine();
                            System.out.print("Enter the New State:");
                            state = sc1.nextLine();
                            System.out.print("Enter the New Zip:");
                            zip = sc.nextInt();
                            System.out.print("Enter the New PhoneNumber:");
                            phoneNumber = sc.nextInt();
                            System.out.print("Enter the New Email:");
                            email = sc1.nextLine();
                            li.set(new AddressBook(firstName, lastName, address, city, state, zip, phoneNumber, email));
                            found = true;
                        }
                    }
                    System.out.println("---------------------------------");
                    if (!found) {
                        System.out.println("Record not found");
                    } else {
                        System.out.println("Record Updated SucessFully:");
                    }
                    System.out.println("---------------------------------");
                    break;
            }
        } while (ch != 0);
    }
    public static boolean checkUniqueName(String firstName) {
        List<AddressBook> c = new ArrayList<AddressBook>();
        Iterator<AddressBook> i = c.iterator();
        ListIterator<AddressBook> li = c.listIterator();
        AddressBook a = li.next();
        if (a.getfirstName() == firstName){
            System.out.println("Name already exist");
            return true;
        }
        return false;
             }
          }