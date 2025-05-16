package Solid;

public class Circle implements Shape{
    private final int raduis;
    public Circle(int raduis){
        this.raduis=raduis;
    }
    public int getRaduis(){
        return raduis;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(getRaduis(),2);
    }
}
