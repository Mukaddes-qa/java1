package day48;

import java.util.Arrays;
import java.util.List;

public class HR_STUFF {

    public static void main(String[] args) {
        // Employee is abstract super type
        // HourlyEmployee and FullTimeEmployeee is specific type

        // if we have Employee data type for e1 variable
        // we can write down the address of anything IS-A Employee

        Employee e1= new HourlyEmployee( "Su",101,55,2000);
        e1.calculateAnnualSalary();
                       e1=new HourlyEmployee("ahmet",102,57,2080);
        e1.calculateAnnualSalary();

       Employee e2=new HourlyEmployee("ahmet",102,57,2080);
        Employee e3 = new FullTimeEmployee("Kagan",103,6000);
        
        // what is the easiest way to store these 3 objects together
 
        // creating a list with 3 employee object
        List<Employee> allEmployee= Arrays.asList(e1,e2,e3);
        for(Employee each:allEmployee){
            System.out.println("each = " + each);
            System.out.println(each.name);
            each.calculateAnnualSalary();
        }
        

    }

}
