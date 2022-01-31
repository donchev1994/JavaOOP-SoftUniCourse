package Polymorphism.shapes;

public class Rectange extends Shape{

    private final Double height;
    private final Double width;

    public Rectange(Double height, Double width) {
        this.height = height;
        this.width = width;
    }


    @Override
    public Double calculatePerimeter() {
        if(super.perimeter != null){
            return super.perimeter;
        }
        return super.perimeter = 2 * this.height + 2 * this.width;
    }

    @Override
    public Double calculateArea() {
        if(super.area !=null){
            return super.area;
        }
        return super.area = this.height * this.width;
    }
}
