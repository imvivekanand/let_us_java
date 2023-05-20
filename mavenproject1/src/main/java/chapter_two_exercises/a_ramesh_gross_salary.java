/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_two_exercises;

/**
 *
 * @author vivek anand
 */
public class a_ramesh_gross_salary {
    public static void main(String[] args){
        int baseSalary;
        float dearnessAllowance, rentAllowance, grossSalary;
        
        baseSalary = 800000;
        
        dearnessAllowance = (baseSalary*40)/100;
        rentAllowance = (baseSalary*20)/100;
        
        
        grossSalary = (baseSalary + dearnessAllowance + rentAllowance);
        
        System.out.println(baseSalary);
        System.out.println(dearnessAllowance);
        System.out.println(rentAllowance);
        System.out.println(grossSalary);
    }
    
}
