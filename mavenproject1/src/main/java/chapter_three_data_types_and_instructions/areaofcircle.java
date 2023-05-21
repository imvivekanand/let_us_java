package chapter_three_data_types_and_instructions;

import java.util.Scanner;

/**
 * Area of a circle.
 * @author Vivek Anand Date: 20/05/2023
 */
public class areaofcircle {
    public static void main(String[] args) {
        final float pi = 3.14f;
        float r, area;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the valur of the radius of the circle:");
        r = scan.nextFloat();
        
        area = pi * r * r;
        
        System.out.println("Area of the circle is:" + area);
    }
    
}
