package com.company;

public class Faculty extends Employee{

    private int office_hours;
    private String rank;

    public Faculty(){};

    @Override
    public String toString() {
        return "Faculty{" +
                "office='" + office + '\'' +
                ", salary=" + salary +
                ", date_hired=" + date_hired +
                ", office_hours=" + office_hours +
                ", rank='" + rank + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone_Number='" + phone_Number + '\'' +
                ", e_mail_Address='" + e_mail_Address + '\'' +
                '}';
    }
}
