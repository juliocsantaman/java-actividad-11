/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio Cesar Santaman Cruz.
 */
public class Square implements Shape {
    
    // Atributos.
    private double side;
    
    // Método constructor.
    public Square(double side) {
        this.side = side;
    }
    
    // Métodos getters y setters.
    public double getSide() {
        return side;
    }
    
    public void setSide(double side) {
        this.side = side;
    }
    
    // Métodos.
    @Override
    public double getArea() {
        return side * side;
    }
    @Override
    public double getPerimeter() {
        return side * 4;
    }
}
