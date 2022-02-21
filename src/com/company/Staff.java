package com.company;

public class Staff extends Employee{

    private String title;

    public Staff(){};

    @Override
    public String toString(){
        return "Staff" +
                "title = " + title +
                "name = " + name +
                "address = " + address +
                "phone_Number = " + phone_Number +
                "e_mail_Adress = " + e_mail_Address;
    }

}