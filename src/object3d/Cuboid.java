/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object3d;

/**
 *
 * @author Wade Maddin
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class Cuboid extends Object3D {

    double width, length, height;

    public void Cuboid() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You've chosen Cuboid:");
        while (true) {
            try {

                System.out.println("Give the width of the Cuboid:");
                width = sc.nextDouble();
                System.out.println("Give the length of the Cuboid:");
                length = sc.nextDouble();
                System.out.println("Give the height of the Cuboid:");
                height = sc.nextDouble();
                if (width > 0 && height > 0 && length > 0) {
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
        System.out.println("The Volume of the Cone is: " + this.cubeV());
        System.out.println("The Surface Area of the Cone is: " + this.cubeSA());
    }

    public double cubeV() {
        return length * width * height;
    }

    public double cubeSA() {
        return 2 * (length * width + length * height + height * width);
    }

}
