class Product{
	String name;
	double price;
	Product(String name,double price){
		this.name = name;
		this.price = price;
	}
	double getPrice(){
		return this.price;
	}
	void dispalyInfo(){
		System.out.printf("Product Name: %s\nProduct Price: %.2f\n",name,price);
	}
}
class DiscountedProduct extends Product{
	double discountPercent;
	DiscountedProduct(String name,double price,double discount){
		super(name,price);
		this.discountPercent = discount;
	}
	@Override
	double getPrice(){
		return price * (100 - discountPercent)/100.0;
	}
	@Override
	void dispalyInfo(){
		super.dispalyInfo();
		System.out.printf("Discount Percentage: %.2f\nDiscounted Price: %.2f\n",discountPercent,getPrice());
	}
}
class Main{
	public static void main(String[] args) {
		DiscountedProduct product = new DiscountedProduct("Apple",2000,15);
		product.dispalyInfo();
	}
}