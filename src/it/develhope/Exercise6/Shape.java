package it.develhope.Exercise6;

public class Shape {

    public String shapeName;
    public int numberofEdges;

    public Shape() {
        System.out.println("Object shape created");
        this.shapeName = "undefined shape";
    }

    public Shape(double radius){
        System.out.println("Object shape Circle created");
        this.shapeName = "Circle";
    }

    public Shape(int edge){
        System.out.println("Object shape square created");
        this.numberofEdges = edge;
        this.shapeName = "Square";
    }


    public Shape(int edge, double e1, double e2){
        System.out.println("Object shape Rectangle created");
        this.numberofEdges = edge;
        this.shapeName = "Rectangle";
    }

    public Shape(int edge,double e1, double e2, double e3){
        System.out.println("Object shape Triangle created");
        this.numberofEdges = edge;
        this.shapeName = "Triangle";
    }

    public void getShapeDetails(){
        System.out.println("ShapeName: " + this.shapeName + "\nNumberofEdges: " + this.numberofEdges);
    }





}
