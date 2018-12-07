package com.company;


public class Workspace {


    public static void main(String[] args) {

        System.out.println( regexEmail("eric.johnson"));

    }

    private static String regexEmail(String email) {

        String firstName = email.substring(0, email.indexOf('.') );


        return firstName;
    }
}
