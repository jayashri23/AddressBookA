package com.addressbooka;

public class AddressBook {

    private String firstname;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private int phoneNumber;
    private String email;

    AddressBook(String firstname,String lastName,String address,String city, String state,int zip,int phoneNumber,String email){//Declaring instance variable using constructor

        this.firstname=firstname;// initialize instance variable
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }


    public String getfirstName(){   // For accessing the private variables
        return firstname;

    }
    public String getlastName(){
        return lastName;

    }

    public String getAddress(){
        return address;

    }
    public String getcity(){
        return city;

    }
    public String getState(){
        return state;

    }
    public int getZip(){
        return zip;

    }
    public int getPhoneNumber(){
        return phoneNumber;

    }
    public String getEmail(){
        return email;

    }

    @Override
    public String toString(){// Override method
        return " First Name: "+firstname+" Last Name: "+lastName+" Address: "  +address+" City: " +city+" State: " +state+" Zip: "+zip+" Phone Number: "+phoneNumber+" Email:"+email;

    }
}
