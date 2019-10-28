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
public class Prism {

    double a, b, c, widthP;

    public void Prism() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You've chosen Triangular Prism:");
        while (true) {
            try {
                System.out.println("Give the Base a of the Triangular Prism:");
                a = sc.nextDouble();
                System.out.println("Give the Base b of the Triangular Prism:");
                b = sc.nextDouble();
                System.out.println("Give the Base c of the Triangular Prism:");
                c = sc.nextDouble();
                System.out.println("Give the Width of the Triangular Prism:");
                widthP = sc.nextDouble();
                if (a > 0 && b > 0 && c > 0 && widthP > 0) {
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
        System.out.println("The Volume of the Triangular Prism is: " + this.prismV());
        System.out.println("The Surface Area of the Triangular Prism is: " + this.prismSA());
    }

    public double prismV() {
        return 0.25 * widthP * Math.pow(Math.pow(-a, 4) + 2 * Math.pow(a * b, 2) + 2 * Math.pow(a * c, 2) * Math.pow(-b, 4) + 2 * Math.pow(b * c, 2) * Math.pow(-c, 4), 0.5);
    }

    public double prismSA() {
        return a * widthP + b * widthP + c * widthP + 0.5 * Math.pow(Math.pow(-a, 4) + 2 * Math.pow(a * b, 2) + 2 * Math.pow(a * c, 2) * Math.pow(-b, 4) + 2 * Math.pow(b * c, 2) * Math.pow(-c, 4), 0.5);
    }

}
