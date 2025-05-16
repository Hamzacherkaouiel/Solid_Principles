package Solid;

public class Square implements Shape {
    private final int length;
    public Square(int l){
        this.length=l;
    }
    public int getLength(){
        return this.length;
    }

    @Override
    public double area() {
        return Math.pow(getLength(),2);
    }
}
