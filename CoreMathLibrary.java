/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package core.math.library;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class CoreMathLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("PROGRAM STARTED");

        Scanner input = new Scanner(System.in);

        System.out.println("1 Arithmetic");  
        System.out.println("2 Geometry");
        System.out.println("3 Number Analysis");
        System.out.print("Choose module: ");

        int module = input.nextInt();

        switch (module) {
            case 1:
                {
                    System.out.println("1 Add  2 Subtract  3 Multiply  4 Divide");
                    int choice = input.nextInt();
                    ArithmeticOperation op;
            switch (choice) {
                case 1:
                    op = new Addition();
                    break;
                case 2:
                    op = new Subtraction();
                    break;
                case 3:
                    op = new Multiplication();
                    break;
                case 4:
                    op = new Division();
                    break;
                default:
                    return;
            }
System.out.print("Enter first number: ");
                    op.setValue1(input.nextDouble());
                    System.out.print("Enter second number: ");
                    op.setValue2(input.nextDouble());
                    System.out.println("Result: " + op.compute());
                    break;
                }
            case 2:
                System.out.println("1 Circle  2 Rectangle");
                int shape = input.nextInt();
                if (shape == 1) {
                    Circle c = new Circle();
                    System.out.print("Enter radius: ");
                    c.setRadius(input.nextDouble());
                    System.out.println("Area: " + c.compute());
                    System.out.println("Circumference: " + c.circumference());
                }   if (shape == 2) {
                    Rectangle r = new Rectangle();
                    System.out.print("Enter length: ");
                    r.setLength(input.nextDouble());
                    System.out.print("Enter width: ");
                    r.setWidth(input.nextDouble());
                    System.out.println("Area: " + r.compute());
                    System.out.println("Perimeter: " + r.perimeter());
                }   break;
            case 3:
                {
                    System.out.println("1 Prime  2 Factorial  3 Even/Odd");
                    int choice = input.nextInt();
                    if (choice == 1) {
                        PrimeCheck p = new PrimeCheck();
                        System.out.print("Enter number: ");
                        p.setNumber(input.nextInt());
                        System.out.println(p.isPrime());
                    }       if (choice == 2) {
                        Factorial f = new Factorial();
                        System.out.print("Enter number: ");
                        f.setNumber(input.nextInt());
                        System.out.println(f.compute());
                    }       if (choice == 3) {
                        EvenOdd e = new EvenOdd();
                        System.out.print("Enter number: ");
                        e.setNumber(input.nextInt());
                        System.out.println(e.isEven());
                    }       break;
                }
            default:
                break;
        }
    }

}
