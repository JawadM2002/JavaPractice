/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class HellowProgram
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner sc = new Scanner(System.in);
       // declare variable
       int Salary ;
       double tax ;
    System.out.println("Wellcome to Jawad Tax Calculator");
    
    System.out.println("Please INPUT your Salary");
    
      Salary = sc.nextInt();
     
     System.out.println("Please INPUT your Tax");
      tax = sc.nextDouble();
    
    System.out.println("Your Salary After Tax is");
       
       double afterTaxSalary = Salary - (Salary/tax);
       String fullName = "Jawad";
       //print to console
       System.out.println("Your Salary After Tax is :"+""+fullName+ "  is  "+ afterTaxSalary);     
		// your code goes here
	}
}

