package com.company;

import java.util.Date;

public class Person {

 public Person(String name, String address, String phone_Number, String e_mail_Address) {
  this.name = name;
  this.address = address;
  this.phone_Number = phone_Number;
  this.e_mail_Address = e_mail_Address;
 }

 public Person() {
 }

 protected String name;
 protected String address;
 protected String phone_Number;
 protected String e_mail_Address;

 @Override
 public String toString() {
  return "Person{" +
          "name='" + name + '\'' +
          ", address='" + address + '\'' +
          ", phone_Number='" + phone_Number + '\'' +
          ", e_mail_Address='" + e_mail_Address + '\'' +
          '}';
 }
}
