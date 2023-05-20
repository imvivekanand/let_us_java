/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_two_exercises;

/**
 *
 * @author avive
 */
public class b_distance_between_two_cities {
    public static void main(String[] args){
        int dKm;
        float dM, dF, dI, dC;
        
        dKm = 115;
        
        dM = dKm * 1000;
        dC = dM * 100;
        dI = dC / 2.54f;
        dF = dI / 12;
        
        System.out.println( dM + " m");
        System.out.println( dC + " cm");
        System.out.println( dI + " inch");
        System.out.println( dF+" foot");


    }
    
}
