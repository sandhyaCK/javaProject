/*#******************************************************************************************************************
        # @purpose :Demonstrate Harmonic Logic.
        # @file  :Harmonic.java
        # @author :Sandhya
   #*****************************************************************************************************************/
package com.BridgeLabz.coreBasics;

public class Harmonic {
    public static void main(String[] args) {

        float harmonic = 1 ;
        for(int i=2;i<8;i++) {
            harmonic += (float)1/i;
        }
        System.out.println(harmonic);
    }

}
