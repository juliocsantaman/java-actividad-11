/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio Cesar Santaman Cruz.
 */
public class Circle implements Shape {
    
    // Atributos.
    private double PI = 3.141592;
    private double radius;
    
    // Método constructor.
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Métodos getters y setters.
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // Métodos.
    @Override
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }
    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }
}
