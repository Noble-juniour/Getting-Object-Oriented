package com.company;
import java.util.*;
public class Person {
    private String firstname;
    private String lastname;
    private   Calendar birthday;

    public Person()
    {
        firstname = " ";
        lastname = " ";
        birthday = new GregorianCalendar();
    }

    public Person(String firstname, String lastname)
    {
    this.firstname = firstname;
    this.lastname = lastname;
    this.birthday = new GregorianCalendar();
    }
    public Person(String firstname, String lastname, Calendar birthday)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
    }


     //member method
    public  String fullname()
    {
    return firstname + " " + lastname;
    }
    public  int age(Calendar today)
    {
        return today.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
    }
    }

