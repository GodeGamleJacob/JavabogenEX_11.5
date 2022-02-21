package com.company;

public class Main {

    public static void main(String[] args) {

        Person a = new Person("Anders A","Paradisæblevej 13", "12345678", "Kalle_anker@andebynettet.dk");
        String text = a.toString();
        System.out.println(text);
        a = new Employee("Stålanden", 1.1, "Arne And", "Du_Ved_Nok", "12345678", "Rigtig_Dårlig@Mail.dk");
        a.toString();
        System.out.println(a.toString());
        /*a = new Student();
        a.toString();
        System.out.println(a.toString());
        a = new Staff();
        a.toString();
        System.out.println(a.toString());
        a = new Faculty();
        a.toString();
        System.out.println(a.toString());
         */
    }
}
