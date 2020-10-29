/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio Cesar Santaman Cruz.
 */
public class EquilateralTriangle implements Shape {
    
    // Atributos.
    private double base;
    private double height;
    
    // Método constructor.
    public EquilateralTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    public EquilateralTriangle(double base) {
        this.base = base;
    }
    
    // Métodos getters y setters.
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    // Métodos.
    @Override
    public double getArea() {
        return (base * height) / 2;
    }
    @Override
    public double getPerimeter() {
        return base * 3;
    }
}
