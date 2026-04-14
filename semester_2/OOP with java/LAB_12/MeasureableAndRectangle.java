interface Measureable{
	double area();
}
class Rectangle implements Measureable{
	private double width;
	private double height;
	Rectangle(double width,double height){
		this.width=width;
		this.height=height;
	}
	@Override
	public double area(){
		return width * height;
	}
	double perimeter(){
		return 2 * (width + height);
	}
}
class Main{
	public static void main(String[] args){
		Measureable m = new Rectangle(4,5);
		System.out.println("Area of Rectangle: "+m.area());
		// System.out.println("Perimeter of Rectangle: "+ m.perimeter()); 
		// This will not work because we have stored the Rectangle obj in interface varible
		// Following code can call perimeter
		Rectangle r = new Rectangle(4,5);
		System.out.print(r.perimeter());
	}
}