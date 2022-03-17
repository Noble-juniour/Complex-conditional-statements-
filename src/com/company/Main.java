package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
            String input = reader.next();
            String sOne   = "abc";
            String sTwo   =  "r" ;
            //boolean is primitive type in java
            boolean bool1 = true ;
            boolean bool2 = true ;
            if((bool1 || bool2) && false){
                System.out.println("True");
            }


        if((input.contains(sOne) || input.contains(sTwo)) && false )
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
    }
}
