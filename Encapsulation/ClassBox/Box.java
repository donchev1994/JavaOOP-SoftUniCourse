package Encapsulation.ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLenght(length);
        this.setWidth(width);
        this.setHeight(height);
    }


    private void setLenght(double length) {
        if(!isGreaterThanZero(length)){
            throw new IllegalArgumentException
                    ("Lenght cannot be zero or negative");
        }

        this.length = length;
    }

    private void setWidth(double width) {
        if(!isGreaterThanZero(width)){
            throw new IllegalArgumentException
                    ("Width cannot be zero or negative");
        }

        this.width = width;
    }

    private void setHeight(double height) {
        if(!isGreaterThanZero(height)){
            throw new IllegalArgumentException
                    ("Height cannot be zero or negative");
        }

        this.height = height;
    }

    private boolean isGreaterThanZero(double val){
        return val > 0;
    }


    public double calculateSurfaceArea(){
        return 2 * length * width + calculateLateralSurfaceArea();
    }

    public double calculateLateralSurfaceArea(){
        return 2 * length * height + 2 * width * height;
    }

    public double calculateVolume(){
        return this.length * this.width + this.height;
    }
}
