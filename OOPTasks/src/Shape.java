abstract class Shape {
    private double side1;
    private double side2;

    public void setSide1(double _side1){
        side1 = _side1;
    }

    public void setSide2(double _side2){
        side2 = _side2;
    }

    public double getSide1(){
        return side1;
    }

    public double getSide2(){
        return side2;
    }

    public Shape (double _side1, double _side2){
        side1 = _side1;
        side2 = _side2;
    }

    public abstract double countSquare();

    public abstract double countPerimeter();

}
