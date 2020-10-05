public class Triangle extends Shape{
    private double side3;

    public void setSide3(double side3){
        this.side3 = side3;
    }

    public double getSide3(){
        return side3;
    }

    public Triangle(double side1, double side2, double side3) throws InvalidDataException{
        super (side1, side2);
        this.side3 = side3;
    }

    public double countSquare() throws PerimeterCalculationException{
        return Math.sqrt(this.countHalfPerimeter() *
                (this.countHalfPerimeter() - this.getSide1()) *
                (this.countHalfPerimeter() - this.getSide2()) *
                (this.countHalfPerimeter() - side3));
    }

    public double countPerimeter() throws PerimeterCalculationException{
        if (this.getSide1() <= 0){
            throw new PerimeterCalculationException("Side1 cannot be less or equal 0");
        }
        if (this.getSide1() > 1000){
            throw new PerimeterCalculationException("Side1 cannot be greater than 1000");
        }
        if (this.getSide2() <= 0){
            throw new PerimeterCalculationException("Side2 cannot be less or equal 0");
        }
        if (this.getSide2() > 1000){
            throw new PerimeterCalculationException("Side2 cannot be greater than 1000");
        }
        if (this.getSide3() <= 0){
            throw new PerimeterCalculationException("Side3 cannot be less or equal 0");
        }
        if (this.getSide3() > 1000){
            throw new PerimeterCalculationException("Side3 cannot be greater than 1000");
        }
        return this.getSide1() + this.getSide2() + side3;
    }

    public double countHalfPerimeter() throws PerimeterCalculationException{
        return this.countPerimeter() / 2;
    }
}
