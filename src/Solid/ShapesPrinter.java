package Solid;

import java.util.List;

public class ShapesPrinter {
    private final IAreaCalculator calculator;
    ShapesPrinter(IAreaCalculator areaCalculator){
        this.calculator=areaCalculator;
    }
    public String json(List<Shape> shapes){
        return "{shape :%s}".formatted(calculator.sum(shapes));
    }
    public String csv(List<Shape> shapes){
        return "shapes,%s".formatted(calculator.sum(shapes));
    }

}
