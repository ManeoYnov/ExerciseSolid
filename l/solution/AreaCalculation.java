public class AreaCalculation {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 4);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

        Shape square = new Square(5);
        System.out.println("Square Area: " + square.calculateArea());
    }
}