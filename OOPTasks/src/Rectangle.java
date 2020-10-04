public class Rectangle extends Shape {

    public Rectangle(double _length, double _weight){
        super(_length, _weight);
    }

    public double countSquare(){
        return this.getSide1() * this.getSide2();
    }

    public double countPerimeter(){
        return (this.getSide1() + this.getSide2()) * 2;
    }
}
