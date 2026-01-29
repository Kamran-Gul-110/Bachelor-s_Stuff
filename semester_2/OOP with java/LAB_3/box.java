class box{
	double length;
	double width;

	double area(){
		return length*width;
	}

	public static void main(String[] args){
		box box1 = new box();
		box box2 = box1;
		box2.length= 5;
		box2.width =4.3;

		double res1 = box1.area();
		double res2 = box2.area();
		System.out.println("\nArea of box1 before referencing: "+res1);
		System.out.println("Area of box2 before referencing: "+res2);

		
		box2.width= 2;
		box2.length= 6.48;

		res1 = box1.area();
		res2 = box2.area();

		System.out.println("\nArea of box1 after referencing: "+ res1);
		System.out.println("Area of box2 before referencing: "+res2+"\n");

	}
}