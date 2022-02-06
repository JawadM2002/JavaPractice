/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity;

import java.util.Scanner;

/**
 *
 * @author 25240462
 */
public class Activity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Please enter a times table ");
        int number = scan.nextInt();
        
        for ( int x = 1; x < 11; x = x + 1){
            
        System.out.print("Times Table: "+ x * number);
        System.out.print("\n"); 
        }   
        }
}
