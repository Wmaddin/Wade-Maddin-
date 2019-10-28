package object3d;

/**
 *
 * @author Wade Maddin
 */
import java.util.Scanner;

public class Object3D {

    /**
     * @param args the command line arguments
     */
    public void Start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Wade's 3D shape calculator!");
        System.out.println("You get to pick one of five different shapes(please input which shape you want to use by letter):");
        System.out.println("a: Cuboid b: Triangular prism c: Ellipsoids d: Cylinders e: Cones");
        while (true) {
            String start = sc.nextLine();
            if ("a".equals(start)) {
                Cuboid q1 = new Cuboid();
                q1.Cuboid();
                q1.results();
            } else if ("b".equals(start)) {
                Prism q2 = new Prism();
                q2.Prism();
                q2.results();
            } else if ("c".equals(start)) {
                Sphere q3 = new Sphere();
                q3.Sphere();
                q3.results();
            } else if ("d".equals(start)) {
                Cylinder q4 = new Cylinder();
                q4.Cylinder();
                q4.results();
            } else if ("e".equals(start)) {
                Cone q5 = new Cone();
                q5.Cone();
                q5.results();
            } else {
                System.out.println("Try again");
            }
        }
    }
    public static void main(String[] args) {
        Object3D q = new Object3D();
        q.Start();
    }
}
