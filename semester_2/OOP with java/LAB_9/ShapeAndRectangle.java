//First program involving Inheritance 😎

class Shape{
	private String color;
	Shape(String color){
		this.color = color;
	}
	String getColor(){
		return color;
	}
	double getArea(){
		return 0;
	}
	void display(){
		System.out.println("Color: "+color);
	}
}

class Rectangle extends Shape{
	private double width;
	private double height;
	Rectangle(String color,double width, double height){
		super(color);
		this.width = width;
		this.height = height;
	}
	double getArea(){
		super.getArea();
		return width * height;
	}
	double getPerimeter(){
		return 2 * (height + width);
	}
	@Override
	void display(){
		super.display();
		System.out.println("Area of Rectangle: "+ getArea());
		System.out.println("Perimeter of Rectangle: "+ getPerimeter());
	}
}

class Main{
	public static void main(String[] args){
		Rectangle rectangle = new Rectangle("Blue",5,3);
		rectangle.display();
		System.out.println("\n");
		System.out.println("Area: "+rectangle.getArea());
		System.out.println("Perimeter: "+rectangle.getPerimeter());
	}
}