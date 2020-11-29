
package cagroupn;

import java.util.Scanner;

/**
 *
 * @author heber
 */
public class CAGroupN {

    static int gustavoMethod() {
        /**
         * author: Gustavo Bomfim Teixeira
         */
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
        return 0;
    }

    private static int squareNumber(int square) {
         return(square*square);
    }
    
    public static void main(String[] args) {
     
       gustavoMethod();
    }
        
}
