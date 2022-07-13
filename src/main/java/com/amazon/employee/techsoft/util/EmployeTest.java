package com.amazon.employee.techsoft.util;

import ch.qos.logback.core.net.*;

import java.util.*;
import java.util.stream.*;

public class EmployeTest {

    public static void main(String[] args) {

        Employe emp2 = new Employe("sagar2",30,(float)201200.0,"female");
        Employe emp3 = new Employe("sagar3",31,(float)20034.0,"male");
        Employe emp4 = new Employe("sagar4",32,(float)200230.0,"female");
        Employe emp5 = new Employe("sagar5",33,(float)203300.0,"male");
        List<Employe> empList= new ArrayList<>();
        empList.add(emp4);
        empList.add(emp5);
        empList.add(emp2);
        empList.add(emp3);

        for (Employe emp : empList) {

            System.out.println(emp);

        }
//        for(int i=0;i<empList.size();i++){
//
//            System.out.println(empList.get(i));
//
//        }
//        empList =empList.stream().filter(ex->ex.getGender().equals("male")).collect(Collectors.toList());
//        System.out.println(empList);
//        empList =empList.stream().filter(ex->ex.getSalary()>=200230).collect(Collectors.toList());
//        System.out.println(empList);

        empList =empList.stream()
                .sorted((p1, p2)->p1.getName().compareTo(p2.getName()))
                .collect(Collectors.toList());//.forEach(System.out::println);
        System.out.println(empList);

    }
}
