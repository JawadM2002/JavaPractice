/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author 25240462
 */
public class Employee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name = "Jawad";
        int age = 17;
        String role = "Manager";
        double salary = 405.30;
        
        EmployeeClass emp = new EmployeeClass();
        
       emp.setName(name);
       emp.setAge(age);
       emp.setSalary(salary);
       emp.setRole(role);
        
        System.out.println(emp.getName());
        System.out.println(emp.getAge());
        System.out.println(emp.getSalary());
        System.out.println(emp.getRoles());
        
    }
    
}
