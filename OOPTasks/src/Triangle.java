public class Triangle extends Shape{
    private double side3;

    public void setSide3(double _side3){
        side3 = _side3;
    }

    public double getSide3(){
        return side3;
    }

    public Triangle(double _side1, double _side2, double _side3){
        super (_side1, _side2);
        side3 = _side3;
    }

    public double countSquare(){
        return Math.sqrt(this.countHalfPerimeter() *
                (this.countHalfPerimeter() - this.getSide1()) *
                (this.countHalfPerimeter() - this.getSide2()) *
                (this.countHalfPerimeter() - side3));
    }

    public double countPerimeter(){
        return this.getSide1() + this.getSide2() + side3;
    }

    public double countHalfPerimeter(){
        return this.countPerimeter() / 2;
    }
}
