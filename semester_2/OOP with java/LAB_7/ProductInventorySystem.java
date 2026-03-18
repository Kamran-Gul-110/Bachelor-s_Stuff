class ProductInventory {
 // Lab 3: Encapsulation (Private Attributes)
 private String[] productNames = new String[15];
 private double[] productPrices = new double[15];
 private int[] productStock = new int[15];
 private String[] productCategories = new String[15];
 private String inventoryName;
 private int productCount = 0;
 // Lab 3: Constructors
 public ProductInventory() {
 this.inventoryName = "Default Inventory";
 }
 public ProductInventory(String inventoryName) {
 this.inventoryName = inventoryName;
 }
 // Lab 3: Getters and Setters
 public void setInventoryName(String name) {
 if (name.length() >= 3) {
 this.inventoryName = name;
 } else {
 System.out.println("Invalid name length.");
 }
 }
 public String getInventoryName() {
 return this.inventoryName;
 }
 public void setProductPrice(int productIndex, double price) {
 if (price > 0 && productIndex < productCount) {
 this.productPrices[productIndex] = price;
 }
 }
 public double getProductPrice(int productIndex) {
 return this.productPrices[productIndex];
 }
 // Lab 3: Object Operations
 public void addProduct(String name, double price, String category, int stock) {
 if (productCount < 15) {
 this.productNames[productCount] = name;
 this.productPrices[productCount] = price;
 this.productCategories[productCount] = category;
 this.productStock[productCount] = stock;
 productCount++;
 }
 }
 public void updateProduct(int productIndex, String name, double price, int stock) {
 if (productIndex < productCount) {
 this.productNames[productIndex] = name;
 this.productPrices[productIndex] = price;
 this.productStock[productIndex] = stock;
 }
 }
 public void removeProduct(int productIndex) {
 if (productIndex < productCount) {
 this.productNames[productIndex] = null;
 this.productPrices[productIndex] = 0.0;
 this.productStock[productIndex] = 0;
 this.productCategories[productIndex] = null;
 }
 }
 // Lab 4: Method Overloading
 public void addStock(int productIndex, int quantity) {
 if (productIndex < productCount) {
 this.productStock[productIndex] += quantity;
 }
 }
 public void addStock(int[] productIndices, int[] quantities) {
 for (int i = 0; i < productIndices.length; i++) {
 addStock(productIndices[i], quantities[i]);
 }
 }
 public void applyDiscount(int productIndex, double percentage) {
 if (productIndex < productCount) {
 double discount = this.productPrices[productIndex] * (percentage / 100.0);
 this.productPrices[productIndex] -= discount;
 }
 }
 public void applyDiscount(String category, double percentage) {
 for (int i = 0; i < productCount; i++) {
 if (this.productCategories[i] != null && this.productCategories[i].equals(category)) {
 applyDiscount(i, percentage);
 }
 }
 }
 // Lab 4: 2D Arrays (Type casting into String for mixed data types)
 public String[][] getInventoryTable() {
 String[][] table = new String[productCount][3];
 for (int i = 0; i < productCount; i++) {
 if (productNames[i] != null) {
 table[i][0] = productNames[i];
 table[i][1] = String.valueOf(productPrices[i]);
 table[i][2] = String.valueOf(productStock[i]);
 }
 }
 return table;
 }
 public String[][] getCategoryTable() {
 // Simple implementation: returning raw data. Grouping logic requires dynamic sizing not covered in Lab 1-6.
 // Returning a fixed small array for demonstration based on previous labs.
 String[][] table = new String[productCount][2];
 for (int i = 0; i < productCount; i++) {
 table[i][0] = productCategories[i];
 table[i][1] = String.valueOf(productPrices[i] * productStock[i]);
 }
 return table;
 }
 public void updateMonthlyStock(int[][] stockData) {
 for (int i = 0; i < stockData.length; i++) {
 int totalMonthStock = 0;
 for (int j = 0; j < stockData[i].length; j++) {
 totalMonthStock += stockData[i][j];
 }
 if (i < productCount) {
 this.productStock[i] += totalMonthStock;
 }
 }
 }
 // Lab 4: Enhanced For Loops
 public String[] getAllProductNames() {
 int count = 0;
 for (String name : productNames) {
 if (name != null) count++;
 }
 String[] names = new String[count];
 int idx = 0;
 for (String name : productNames) {
 if (name != null) {
 names[idx] = name;
 idx++;
 }
 }
 return names;
 }
 public double calculateTotalValue() {
 double total = 0;
 for (double price : productPrices) {
 // Enhanced loop goes through all 15, we only want valid ones
 // Simplified for lab constraints
 }
 // Proper way matching your lab loops:
 for (int i = 0; i < productCount; i++) {
 if (productNames[i] != null) {
 total += (productPrices[i] * productStock[i]);
 }
 }
 return total;
 }
 public String[] findLowStockProducts(int threshold) {
 int count = 0;
 for (int stock : productStock) {
 if (stock > 0 && stock < threshold) count++;
 }
 String[] lowStock = new String[count];
 int idx = 0;
 for (int i = 0; i < productCount; i++) {
 if (productNames[i] != null && productStock[i] < threshold) {
 lowStock[idx] = productNames[i];
 idx++;
 }
 }
 return lowStock;
 }
 // Lab 4: Break and Continue
 public String findFirstExpensiveProduct(double minPrice) {
 for (int i = 0; i < productCount; i++) {
 if (productPrices[i] >= minPrice) {
 return productNames[i]; // break inherently via return
 }
 }
 return "Not Found";
 }
 public int countValidProducts() {
 int validCount = 0;
 for (int i = 0; i < productCount; i++) {
 if (productPrices[i] <= 0 || productNames[i] == null) {
 continue;
 }
 validCount++;
 }
 return validCount;
 }
}
class Main {
 public static void main(String[] args) {
 ProductInventory inv = new ProductInventory("Tech Store");

 inv.addProduct("Laptop", 1200.50, "Electronics", 10);
 inv.addProduct("Mouse", 25.00, "Accessories", 50);
 inv.addProduct("Keyboard", 45.00, "Accessories", 30);

 inv.setProductPrice(1, 20.00);
 System.out.println("Inventory Name: " + inv.getInventoryName());

 inv.addStock(1, 10);
 inv.applyDiscount("Accessories", 10.0);

 System.out.println("\nInventory Table:");
 String[][] table = inv.getInventoryTable();
 for (int i = 0; i < table.length; i++) {
 if (table[i][0] != null) {
 System.out.printf("Name: %s | Price: %s | Stock: %s\n", table[i][0], table[i][1], table[i][2]);
 }
 }

 System.out.println("\nTotal Value: " + inv.calculateTotalValue());
 System.out.println("Valid Products Count: " + inv.countValidProducts());
 }
}
