package com.company;

public class Main {

    public static void main(String[] args) {

        String month = "Februar";

        switch(month) {
            case "Januar": System.out.println("Januar"); break;
            case "Februar": System.out.println("Februar"); break;
            case "Maerz": System.out.println("Maerz"); break;
            case "April": System.out.println("April"); break;
            default: System.out.println("Anderes Monat"); break;
        }

    }
}
