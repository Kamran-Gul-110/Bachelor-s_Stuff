class Inventory{
	private String productName;
	private String productId;
	private int quantity;
	private	double unitPrice;
	private String category;	
	private int reorderLevel;

	Inventory(String productName,String productId,double unitPrice,String category,int reorderLevel){
		this.productName = productName;
		this.productId = productId;
		this.unitPrice = unitPrice;
		this.category = category;
		this.reorderLevel = reorderLevel;
	}
	void addStock(int amount){
		if(amount>=0){
		this.quantity += amount;
		System.out.printf("%d items added to stock\n",amount);
	}
		else 
			System.out.printf("%d Cannot be added\n",amount);
	}
	void removeStock(int amount){
		if((this.quantity - amount) >= 0){
		this.quantity -= amount;
		System.out.printf("%d items removed from stock\n",amount);
	}
	else 
		System.out.println("No enough stock");
	}
	double getTotalValue(){
		return (this.quantity * unitPrice);
	}
	boolean needReorder(){
		if(this.quantity < reorderLevel){
			return true;
		}
		return false;
	}
	void updatePrice(double unitPrice){
		if(unitPrice>0){
			this.unitPrice = unitPrice;
			System.out.printf("\nPrice updated to: %.2f",unitPrice);
		}
		else 
			System.out.printf("\nPrice cannot be: %.2f",unitPrice);
	}
	String getStockStatus(){
		if(needReorder()){
			return "\nOut of Stock";
		}
		else{
			if(quantity < (reorderLevel +10)){
				return "\nLow stock";
			}
			else
			return "\nIn Stock";
		}
	}
	double calculateBulkPrice(int quantity){
			if(quantity >= 10){
				double total = (this.unitPrice - (0.1 * unitPrice)) * quantity;
				return total;
			}
			else 
				return unitPrice * quantity;
		}
	String getInventoryInfo(){
		String str = String.format("\n\nInventory Details\nProduct Name: %s\nProduct Id: %s\nTotal Quantity: %d\nUnit Price: %.2f\nProduct Category: %s",productName,productId,quantity,unitPrice,category);
		return str;
	}
	void compareValue(Inventory other){
		if(this.unitPrice > other.unitPrice){
			System.out.println("\n"+this.productName + " is expensive than "+ other.productName);
		}
		else 
			System.out.println("\n"+other.productName + " is expensive than "+ this.productName);
	}
}
class Main{
	public static void main(String[] args){
		Inventory banana = new Inventory("Banana","101",12.5,"Fruit",10);
		Inventory apple = new Inventory("Apple","102",17.3,"Fruit",50);

		banana.addStock(100);
		
		banana.removeStock(7);

		System.out.printf("\nReorder needed: %b",banana.needReorder());

		banana.updatePrice(11.3);
		double totalValue = banana.getTotalValue();
		System.out.printf("\nTotal Value: %.2f",totalValue);

		String stockStatus = banana.getStockStatus();
		System.out.println(stockStatus);

		double bulkPrice = banana.calculateBulkPrice(5);
		System.out.printf("Total bulk purchase price: %.2f", bulkPrice);

		String inventoryInfo = banana.getInventoryInfo();
		System.out.println(inventoryInfo);

		banana.compareValue(apple);
	}
}