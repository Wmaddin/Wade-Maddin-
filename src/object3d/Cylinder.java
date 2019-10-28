/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object3d;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Wade Maddin
 */
public class Cylinder {

    double heightCY, radiusCY;

    public void Cylinder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You've chosen Cylinder:");
        while (true) {
            try {
                System.out.println("Give the height of the Cylinder:");
                heightCY = sc.nextDouble();
                System.out.println("Give the radius of the Cylinder:");
                radiusCY = sc.nextDouble();
                if (heightCY > 0 && radiusCY > 0) {
                    break;
                } else {
                    System.out.print("Must be more then 0, try again! ");
                }
            } catch (InputMismatchException err) {
                sc.next();
                System.out.print("Not a number, try again! ");
            }
        }
    }

    public void results() {
        System.out.println("The Volume of the Cylinder is: " + this.CYV());
        System.out.println("The Surface Area of the Cylinder is: " + this.CYSA());
    }

    public double CYV() {
        return Math.PI * heightCY * Math.pow(radiusCY, 2);
    }

    public double CYSA() {
        return 2 * Math.PI * radiusCY * heightCY + 2 * Math.PI * Math.PI * Math.pow(radiusCY, 2);
    }
}
