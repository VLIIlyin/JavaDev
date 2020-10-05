abstract class Shape {
    private double side1;
    private double side2;

    public void setSide1(double side1) throws InvalidDataException{
        if (side1 < 1){
            throw new InvalidDataException("Side1 cannot be less than 1");
        }
        this.side1 = side1;
    }

    public void setSide2(double side2) throws InvalidDataException{
        if (side2 < 1){
            throw new InvalidDataException("Side2 cannot be less than 1");
        }
        this.side2 = side2;
    }

    public double getSide1(){
        return side1;
    }

    public double getSide2(){
        return side2;
    }

    public Shape (double side1, double side2) throws InvalidDataException{
        if (side1 < 1){
            throw new InvalidDataException("Side1 cannot be less than 1");
        }
        if (side2 < 1){
            throw new InvalidDataException("Side2 cannot be less than 1");
        }
        this.side1 = side1;
        this.side2 = side2;
    }

    public abstract double countSquare() throws SquareCalculationException, PerimeterCalculationException;

    public abstract double countPerimeter() throws PerimeterCalculationException;

}
