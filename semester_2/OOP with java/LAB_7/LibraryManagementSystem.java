class LibrarySystem {
 // Private Attributes
 private String libraryName;
 private String[] bookTitles = new String[15];
 private String[] bookIds = new String[15];
 private boolean[] isAvailable = new boolean[15];
 private String[] borrowerNames = new String[15];

 // Circular Buffer variables
 private String[] transactionHistory = new String[10];
 private int transactionCount = 0;

 // Lab 5: Static and Final
 private static int bookCount = 0;
 private static final int MAX_BOOKS = 15;
 // Constructors
 public LibrarySystem(String libraryName) {
 this.libraryName = libraryName;
 }
 // Lab 5: Static Members
 public void addBook(String title, String bookId) {
 if (bookCount < MAX_BOOKS) {
 bookTitles[bookCount] = title;
 bookIds[bookCount] = bookId;
 isAvailable[bookCount] = true;
 borrowerNames[bookCount] = "None";
 bookCount++;
 }
 }
 public static int getBookCount() {
 return bookCount;
 }
 public static String getLibraryStatistics() {
 return "Total Books in System: " + bookCount;
 }
 // Lab 5: Final Keyword
 public boolean validateBookLimit() {
 return bookCount < MAX_BOOKS;
 }
 public int getMaxCapacity() {
 return MAX_BOOKS;
 }
 // Lab 5: Varargs
 public void addMultipleBooks(String... newBookTitles) {
 for (String title : newBookTitles) {
 addBook(title, "ID-" + (bookCount + 100)); // Auto-generate ID
 }
 }
 public void borrowBooks(int... bookIndices) {
 for (int idx : bookIndices) {
 borrowBook(idx, "Bulk Borrower");
 }
 }
 public void returnBooks(int... bookIndices) {
 for (int idx : bookIndices) {
 returnBook(idx);
 }
 }
 // Lab 5: Access Modifiers
 private boolean validateBookId(String id) {
 return id != null && id.length() > 0;
 }
 protected String getInternalBookInfo(int bookIndex) {
 return bookTitles[bookIndex] + " (" + bookIds[bookIndex] + ")";
 }
 public void setLibraryName(String name) {
 if (name != null && name.length() > 0) {
 this.libraryName = name;
 }
 }
 // Lab 6: Circular Buffer
 public void recordTransaction(String transaction) {
 int index = transactionCount % transactionHistory.length;
 transactionHistory[index] = transaction;
 transactionCount++;
 }
 public String[] getTransactionHistory() {
 return transactionHistory;
 }
 public String[] getRecentTransactions(int count) {
 String[] recent = new String[count];
 // Simplified fetching for lab requirements
 for (int i = 0; i < count && i < transactionHistory.length; i++) {
 recent[i] = transactionHistory[i];
 }
 return recent;
 }
 // Lab 6: Problem-Solving Methods
 public void borrowBook(int bookIndex, String borrowerName) {
 if (bookIndex < bookCount && isAvailable[bookIndex]) {
 isAvailable[bookIndex] = false;
 borrowerNames[bookIndex] = borrowerName;
 recordTransaction("Borrowed: " + bookTitles[bookIndex]);
 } else {
 recordTransaction("Failed Borrow: " + bookTitles[bookIndex]);
 }
 }
 public void returnBook(int bookIndex) {
 if (bookIndex < bookCount && !isAvailable[bookIndex]) {
 isAvailable[bookIndex] = true;
 borrowerNames[bookIndex] = "None";
 recordTransaction("Returned: " + bookTitles[bookIndex]);
 }
 }
 public int[] findAvailableBooks() {
 int count = 0;
 for (int i = 0; i < bookCount; i++) {
 if (isAvailable[i]) count++;
 }
 int[] available = new int[count];
 int idx = 0;
 for (int i = 0; i < bookCount; i++) {
 if (isAvailable[i]) {
 available[idx] = i;
 idx++;
 }
 }
 return available;
 }
 public int[] findBorrowedBooks() {
 int count = 0;
 for (int i = 0; i < bookCount; i++) {
 if (!isAvailable[i]) count++;
 }
 int[] borrowed = new int[count];
 int idx = 0;
 for (int i = 0; i < bookCount; i++) {
 if (!isAvailable[i]) {
 borrowed[idx] = i;
 idx++;
 }
 }
 return borrowed;
 }
 public int[] searchBooks(String searchTerm) {
 int count = 0;
 for (int i = 0; i < bookCount; i++) {
 if (bookTitles[i].toLowerCase().indexOf(searchTerm.toLowerCase()) != -1) count++;
 }
 int[] matches = new int[count];
 int idx = 0;
 for (int i = 0; i < bookCount; i++) {
 if (bookTitles[i].toLowerCase().indexOf(searchTerm.toLowerCase()) != -1) {
 matches[idx] = i;
 idx++;
 }
 }
 return matches;
 }
 // Lab 6: Advanced Array Operations
 public String[] getAllBookTitles() {
 String[] titles = new String[bookCount];
 for (int i = 0; i < bookCount; i++) {
 titles[i] = bookTitles[i];
 }
 return titles;
 }
 public String[][] getBorrowerStatistics() {
 String[][] stats = new String[bookCount][2];
 for (int i = 0; i < bookCount; i++) {
 stats[i][0] = borrowerNames[i];
 stats[i][1] = bookTitles[i];
 }
 return stats;
 }
 public double calculateBorrowRate() {
 int borrowedCount = findBorrowedBooks().length;
 return ((double) borrowedCount / bookCount) * 100.0;
 }
 public String generateLibraryReport() {
 String report = String.format("\n--- %s Report ---\n", libraryName);
 report += "Total Books: " + bookCount + "\n";
 report += String.format("Borrow Rate: %.2f%%\n", calculateBorrowRate());
 return report;
 }
}
class Main {
 public static void main(String[] args) {
 LibrarySystem lib = new LibrarySystem("Central Library");

 lib.addMultipleBooks("Intro to Java", "Data Structures", "Web Development", "Database Systems");

 lib.borrowBook(0, "Kamran");
 lib.borrowBook(1, "Ali");
 lib.returnBook(0);

 lib.borrowBooks(2, 3);

 System.out.println(LibrarySystem.getLibraryStatistics());

 System.out.println("\nTransaction History:");
 String[] history = lib.getTransactionHistory();
 for (String record : history) {
 if (record != null) {
 System.out.println(record);
 }
 }

 System.out.println(lib.generateLibraryReport());
 }
}