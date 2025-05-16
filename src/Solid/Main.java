package Solid;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IAreaCalculator calculator=new AreaCalculatorv2();
        Circle circle=new Circle(10);
        Square square=new Square(10);
        List<Shape> shapes=List.of(circle,square);
        ShapesPrinter printer=new ShapesPrinter(calculator);

        System.out.println(printer.json(shapes));
        System.out.println(printer.csv(shapes));



    }
}
