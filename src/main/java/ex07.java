/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Moore
 */

import java.util.Scanner;
import static java.lang.Float.parseFloat;

public class ex07 {
    static final double MTF2 = 0.09290304;
    public static void main(String[] args){
        Scanner inScan = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        double length = parseFloat(inScan.nextLine());
        System.out.print("What is the width of the room in feet? ");
        double width = parseFloat(inScan.nextLine());
        double areaImp = length * width;
        double areaMet = areaImp * MTF2;

        System.out.printf(
                "You entered dimensions of %.3f feet by %.3f feet.\nThe area is\n%.3f square feet\n%.3f square meters\n"
                ,length, width, areaImp, areaMet);
    }
}
