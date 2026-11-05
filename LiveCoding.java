/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package live.coding;

import java.util.Scanner;

/**
 *
 * @author NAVAREZ_CPE113
 */
public class LiveCoding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println("Student Grade Eval");

        System.out.println("Enter prelim Score:");
        double prelim = input.nextDouble();

        System.out.println("Enter midterm Score:");
        double midterm = input.nextDouble();

        System.out.println("Enter final Score:");
        double finals = input.nextDouble();

        double Average = CalAvrg(prelim, midterm, finals);

        char Grade = GradeEquivalent(Average);

        boolean Passed = Passed(Average);

        System.out.println("\n Average:" + Average);
        System.out.println("Grade equivalent:" + Grade);
        System.out.println("passed:" + Passed);
        
        
    }

    static double CalAvrg(double prelim, double midterm, double finals) {
        return (prelim + midterm + finals) / 3;

    }

    static char GradeEquivalent(double Average) {
        if (Average >= 90) {
            return 'A';
        } else if (Average >= 85) {
            return 'B';
        } else if (Average >= 80) {
            return 'C';
        } else if (Average >= 75) {
            return 'D';
        } else {
            return 'F';

        }
    }

    static boolean Passed(double Average) 
    
    }
    
}
