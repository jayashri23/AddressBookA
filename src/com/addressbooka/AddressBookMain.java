package com.addressbooka;

import java.util.*;

public class AddressBookMain {
    public static void main(String[] args) {
        Collection<AddressBook> c=new ArrayList<AddressBook>(); //Collection of data inside this//Acees functinality of list iterator
        Scanner sc=new Scanner(System.in); //For taking input as a integer
        Scanner sc1=new Scanner(System.in); //For taking input as a string
        System.out.println("**** WELCOME TO ADDRESSBOOK PROGRAM ****");
        int ch ; //choice variable
        do {
            System.out.println("\n1.ADD");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.println("Enter Your Choice:");
            ch=sc.nextInt();
            switch (ch){
                case 1:
                    System.out.print("Enter the First Name:");
                    String firstName=sc1.nextLine();
                    System.out.print("Enter the Last Name:");
                    String lastName=sc1.nextLine();
                    System.out.print("Enter the Address:");
                    String address=sc1.nextLine();
                    System.out.print("Enter the City:");
                    String city=sc1.nextLine();
                    System.out.print("Enter the State:");
                    String state=sc1.nextLine();
                    System.out.print("Enter the Zip:");
                    int zip=sc.nextInt();
                    System.out.print("Enter the PhoneNumber:");
                    int phoneNumber=sc.nextInt();
                    System.out.print("Enter the Email:");
                    String email=sc1.nextLine();
                    System.out.print("Record Added SucessFully");
                    c.add(new AddressBook(firstName,lastName,address,city,state,zip,phoneNumber,email));
                    break;
                case 2:
                    System.out.println("---------------------------------");//Display the record
                    Iterator<AddressBook> i= c.iterator();//function retrieve each record one by one
                    while(i.hasNext()){
                        AddressBook a=i.next();
                        System.out.println(a);

                    }
                    System.out.println("---------------------------------");
                    break;

            }
        }while(ch!=0);
    }
             }