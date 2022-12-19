package com.address9to11;

import java.util.*;

public class AdressBookDetails {
    public static Scanner sc = new Scanner(System.in);
    public static List<AddressBook> list = new ArrayList<AddressBook>();

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
        for (AddressBook deatils : list) {
            if (deatils.getfirstName().equals(Name)) {
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
                        deatils.setFirstName(firstName);
                        break;
                    }
                    case 2: {
                        System.out.println("Enter Updated last name: ");
                        String lastName = sc.next();
                        deatils.setLastName(lastName);
                        break;
                    }
                    case 3: {
                        System.out.println("Enter Updated Address: ");
                        String address = sc.next();
                        deatils.setAddress(address);
                        break;
                    }
                    case 4: {
                        System.out.println("Enter Updated City: ");
                        String city = sc.next();
                        deatils.setCity(city);
                        break;
                    }
                    case 5: {
                        System.out.println("Enter Updated State: ");
                        String state = sc.next();
                        deatils.setState(state);
                        break;
                    }
                    case 6: {
                        System.out.println("Enter Updated Zip : ");
                        String zip = sc.next();
                        deatils.setZip(zip);
                        break;
                    }
                    case 7: {
                        System.out.println("Enter Updated Phone Number:");
                        String phoneNumber = sc.next();
                        deatils.setPhoneNumber(phoneNumber);
                        break;
                    }
                    case 8: {
                        System.out.println("Enter Updated Email: ");
                        String email = sc.next();
                        deatils.setEmail(email);
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

    public void searchDetails() {
        System.out.println("Details search by \n1. City Name \n2. State Name");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                searchState();
                break;
            case 2:
                searchCity();
            default:
                System.out.println("--------------------");
        }
    }
    public void countByStateOrCity() {
        System.out.println("Details count by \n1. City Name \n2. State Name");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                countByCity();
                break;
            case 2:
                countByState();
            default:
                System.out.println("--------------------");
        }
    }
    public static void searchState(){
        list.stream()
                .filter(state -> state.getState().equalsIgnoreCase("Maharashtra"))
                .sorted( Comparator.comparing(AddressBook::getfirstName))
                .forEach(state-> System.out.println(state.getfirstName()));
        System.out.println(list);
    }
    public static void searchCity(){

        list.stream()
                .filter(cityName -> cityName.getcity().equalsIgnoreCase("mumbai"))
                .sorted( Comparator.comparing(AddressBook::getfirstName))
                .forEach(cityName-> System.out.println(cityName.getfirstName()));
        System.out.println(list);

    }
    public static void countByState(){

        long count=  list.stream()
                .filter(stateName -> stateName.getState().equalsIgnoreCase("mumbai"))
                .count();
        System.out.println(list);
    }
    public static void countByCity(){


        long count=  list.stream()
                .filter(cityName -> cityName.getcity().equalsIgnoreCase("mumbai"))
                .count();
        System.out.println(list);
    }
}
