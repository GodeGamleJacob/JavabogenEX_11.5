package com.company;

public class Student extends Person{

    private String class_Status;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone_Number='" + phone_Number + '\'' +
                ", e_mail_Address='" + e_mail_Address + '\'' +
                ", class_Status='" + class_Status + '\'' +
                '}';
    }
}
