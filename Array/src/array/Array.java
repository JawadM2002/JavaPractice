/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author 25240462
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
    double[] myList = {1.9, 2.9, 3.4, 3.5};
    
    //Print all the array elements
    for (int i = 0; i<myList.length;i++){
    System.out.println(myList[i]+ "");
    }
    
    //Summing all elements
    double total =0;
    for (int i = 0; i <myList.length;i++){
        total +=myList[i];
    }
    System.out.println("the total is " + total);
      }
    } 

