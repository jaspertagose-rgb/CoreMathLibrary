/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.math.library;

/**
 *
 * @author LENOVO
 */
public class Division extends ArithmeticOperation {

    @Override
    public double compute() {
        if (getValue2() == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return getValue1() / getValue2();
    }
}
