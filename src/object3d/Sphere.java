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
public class Sphere {

    double ra, rb, rc;

    public void Sphere() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You've chosen Ellipsoid:");
        while (true) {
            try {
                System.out.println("Give the radius a of the Ellipsoid:");
                ra = sc.nextDouble();
                System.out.println("Give the radius b of the Ellipsoid:");
                rb = sc.nextDouble();
                System.out.println("Give the radius c of the Ellipsoid:");
                rc = sc.nextDouble();
                if (ra > 0 && rb > 0 && rc > 0) {
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
        System.out.println("The Volume of the Ellipsoid is: " + this.sphereV());
        System.out.println("The Surface Area of the Ellipsoid is: " + this.sphereSA());
    }

    public double sphereV() {
        return 1.33 * Math.PI * ra * rb * rc;
    }

    public double sphereSA() {
        return 4 * Math.PI * Math.pow((Math.pow(ra * rb, 1.6) + Math.pow(ra * rc, 1.6) + Math.pow(rb * rc, 1.6)) / 3, 1 / 1.6);
    }
}
