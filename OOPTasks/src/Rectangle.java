public class Rectangle extends Shape {

    public Rectangle(double length, double weight) throws InvalidDataException{
        super(length, weight);
    }

    public double countSquare() throws SquareCalculationException{
        if (this.getSide1() <= 0){
            throw new SquareCalculationException("Side1 cannot be less or equal 0");
        }
        if (this.getSide1() > 1000){
            throw new SquareCalculationException("Side1 cannot be greater than 1000");
        }
        if (this.getSide2() <= 0){
            throw new SquareCalculationException("Side2 cannot be less or equal 0");
        }
        if (this.getSide2() > 1000){
            throw new SquareCalculationException("Side2 cannot be greater than 1000");
        }
        return this.getSide1() * this.getSide2();
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
        return (this.getSide1() + this.getSide2()) * 2;
    }
}
