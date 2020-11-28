/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cagroupn;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class CAGroupNGustavo {
     public static void main(String[] args) {
        try{    
            int square;
            int numberImput;
            Scanner myKb = new Scanner(System.in);
            System.out.println("Enter an Integer:");
            square = myKb.nextInt();
            numberImput = squareNumber(square);
            System.out.println("The square of " + square + " is " + numberImput);
        }catch (Exception e){
            System.out.println("Please enter an Integer");
        }
    }

    private static int squareNumber(int square) {
         return(square*square);
    }
    
}
