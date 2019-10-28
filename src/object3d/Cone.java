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
public class Cone {

    double heightCO, radiusCO;

    public void Cone() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You've chosen Cone:");
        while (true) {
            try {
                System.out.println("Give the height of the Cone:");
                heightCO = sc.nextDouble();
                System.out.println("Give the radius of the Cone:");
                radiusCO = sc.nextDouble();
                if (heightCO > 0 && radiusCO > 0) {
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
        System.out.println("The Volume of the Cone is: " + this.coneV());
        System.out.println("The Surface Area of the Cone is: " + this.coneSA());
    }

    public double coneV() {
        return Math.PI * Math.pow(radiusCO, 2) * (heightCO / 3);
    }

    public double coneSA() {
        return Math.PI * radiusCO * Math.pow(radiusCO + (Math.pow(heightCO, 2) + Math.pow(radiusCO, 2)), 0.5);
    }
}
