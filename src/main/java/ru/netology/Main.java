package ru.netology;

import ru.netology.figures.Circle;
import ru.netology.figures.Rectangle;
import ru.netology.figures.Triangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12, 10, "#123", "#453");
        rectangle.info("[ " + rectangle.calculatePerimeter() + ", " + rectangle.calculateArea()
                + ", " + rectangle.getFillColor() + ", " + rectangle.getBorderColor() + " ]");
        System.out.println();

        Triangle triangle = new Triangle(5, 8, 10, "#3453", "#4372");
        triangle.info("[ " + triangle.calculatePerimeterForTriangle() + ", " + triangle.calculateArea()
                + ", " + triangle.getFillColor() + ", " + triangle.getBorderColor() + " ]");
        System.out.println();

        Circle circle = new Circle(8, "#476", "#1297");
        circle.info("[ " + circle.calculatePerimeterForCircle() + ", " + circle.calculateAreaForCircle()
                + ", " + circle.getFillColor() + ", " + circle.getBorderColor() + " ]");

    }
}