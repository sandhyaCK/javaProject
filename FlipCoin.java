/*#******************************************************************************************************************
        # @purpose :Demonstrate FlipCoin Logic.
        # @file  :FlipCoin.java
        # @author :Sandhya
   #*****************************************************************************************************************/
package com.BridgeLabz.coreBasics;

public class FlipCoin {
    public static void main(String[] args) {
        if(Math.random() < 0.5) {
            System.out.println("heads");

        }else {
            System.out.println("tails");

        }
        System.out.println(Math.random() *100);
    }
}
