/*#******************************************************************************************************************
        # @purpose :Demonstrate LeapYear Logic.
        # @file  :LeapYear.java
        # @author :Sandhya
 #*****************************************************************************************************************/
package com.BridgeLabz.coreBasics;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year");
        int year = sc.nextInt();
        if(year %4 ==0) {
            System.out.println("leap year");
        }
        else {
            System.out.println(" Not a leap year");
        }

    }
}
