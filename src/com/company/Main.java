package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Person john = new Person("John","Doe",);
        //Person jane = new Person("Jane","Obare",new GregorianCalendar(2003,6,4));
        Person john = new Person();
        System.out.println("Hello i am " + john.fullname()  + " and i am " + john.age(new GregorianCalendar()) + " years old" );
    }
}
