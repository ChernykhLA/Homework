package Interface;

public class FigureApp {
    public static void main(String[] args) {
        Circle circle = new Circle(12, "red", "orange");
        circle.print();
        circle.setBorderColor("Black");
        circle.print();

        Rectangle rectangle = new Rectangle(12,13, "white", "red");
        rectangle.print();
        rectangle.setBorderColor("orange");
        rectangle.print();

        Triangle triangle = new Triangle(12, 12, 12, "red", "orange");
        triangle.print();
        triangle.setBorderColor("Black");
        triangle.print();


   
}
}
