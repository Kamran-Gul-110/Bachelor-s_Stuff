abstract class Shape{
    private String color;
    Shape(String color){
        this.color = color;
    }
    String getColor(){
        return this.color;
    }
    public abstract double getArea();
    void display(){
        System.out.printf("Color: %s\n",getColor());
        System.out.printf("Area: %.2f\n",getArea());
    }
}
class Rectangle extends Shape{
    double width,height;
    Rectangle(String color,double width,double height){
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea(){
        return width * height;
    }
    double getPerimeter(){
        return 2 * (width + height);
   }
}

class Main {
    public static void main(String[] args) {
        // Shape shape = new Shape(); // This will not compile bcz we cannot have an object of an abstract class
        Rectangle rectangle = new Rectangle("Red",2,3.4);
        rectangle.display();
        System.out.println("Area of Rectangle: " +  rectangle.getArea());
        System.out.println("Perimeter of Rectangle: "+rectangle.getPerimeter());
    }
}
