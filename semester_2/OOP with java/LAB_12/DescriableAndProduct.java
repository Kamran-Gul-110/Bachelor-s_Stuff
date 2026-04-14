interface Describle{
	public String describe();
}
class Product implements Describle{
	private String name;
	private String sku;
	Product(String name,String sku){
		this.name= name;
		this.sku = sku;
	}
	@Override
	public String describe(){
		return "Product: " + name + " ("+sku+ ")";
	}
}
class Main{
	public static void main(String[] args){
		Describle d = new Product("Mouse","SKU-001");
		System.out.print(d.describe());
	}
}