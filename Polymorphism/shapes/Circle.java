package Polymorphism.shapes;

public class Circle extends Shape {

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }


    @Override
    public Double calculatePerimeter() {
        if (super.perimeter != null) {
            return super.perimeter;
        }
        return super.perimeter = 2 * Math.PI * this.radius;
    }

    @Override
    public Double calculateArea() {
        if (super.area != null) {
            return super.area;
        }
        return super.area =  Math.PI * this.radius * this.radius;
    }
}
