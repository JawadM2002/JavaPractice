/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhileloop;

import java.util.Scanner;

/**
 *
 * @author 25240462
 */
public class DoWhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner (System.in);
        int number;
        System.out.print ("Please guess my number");
        
        number= scan.nextInt();
        
        while (number != 59){
        System.out.print("Try Again! ");
        number = scan.nextInt();
    }
    System.out.println("You guessed it!");
            
   
        
     
    }
}
    
