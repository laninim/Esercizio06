package it.develhope.Exercise6;

/*
   define a testing class where you:
create the 5 Shape objects using all the different constructor invocations
invoke getShapeDetails() for each Shape object and assign the returned values to dedicated String variables
print in console the values of the 5 dedicated String variables
* */


public class Test {

    public static void main(String[] args) {

        Shape shape = new Shape();
        Shape circle = new Shape(20.00);
        Shape square = new Shape(20);
        Shape rectangle = new Shape(20, 5.0,5.0);
        Shape triangle = new Shape(20,3.0,3.0,3.0);

        shape.getShapeDetails();
        circle.getShapeDetails();
        square.getShapeDetails();
        rectangle.getShapeDetails();
        triangle.getShapeDetails();

    }
}
