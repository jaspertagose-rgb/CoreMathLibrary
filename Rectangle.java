/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.math.library;

/**
 *
 * @author LENOVO
 */
public class Rectangle extends GeometryOperation {

    private double length;
    private double width;

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }

    @Override
    public double compute() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}
