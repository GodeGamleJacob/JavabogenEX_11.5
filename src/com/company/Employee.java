package com.company;

import java.util.Date;

public class Employee extends Person{

    protected String office;
    protected double salary;
    protected Date date_hired;

    public Employee(){};

    public Employee(String office, double salary, String name, String address, String phone_Number, String e_mail_Address){
        super(name, address, phone_Number, e_mail_Address);
        this.office = office;
        this.salary = salary;
        this.date_hired = new Date();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "office='" + office + '\'' +
                ", salary='" + salary + '\'' +
                ", date_hired=" + date_hired +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone_Number='" + phone_Number + '\'' +
                ", e_mail_Address='" + e_mail_Address + '\'' +
                '}';
    }
}
