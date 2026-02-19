class Library{
	private String bookTitle;
	private String bookId;
	private boolean isAvailable;
	private String borrowerName;
	private int daysBorrowed;

	Library(){
	bookTitle = "Unavailable";
	bookId = "000";
	isAvailable = false;
	borrowerName = "Unavailable";
	daysBorrowed = 0;
	}
	Library(String bookTitle, String bookId){
		this.bookTitle = bookTitle;
		this.bookId = bookId;
		this.isAvailable = true;
	}
	void borrowBook(String borrowerName){
		if(isAvailable == true){
		this.borrowerName = borrowerName;
		this.daysBorrowed = 0;
		this.isAvailable = false;
		}
	}
	void returnBook(){
		bookTitle = "Unavailable";
		bookId = "000";
		isAvailable = true;
		borrowerName = "Unavailable";
		daysBorrowed = 0;
		System.out.println("\n\nBook has been returned");
		}
	double calculateFine(){
		if(daysBorrowed>14){
			return this.daysBorrowed * 0.5;
		}
		return 0;
	}
	void extendBorrowPeriod(int additionalDays){
		this.daysBorrowed +=additionalDays;
	}
	String bookInfo(){
		String str = String.format("Book name: %s\nBorrower Name: %s\nNumber of days borrowed: %d",bookTitle,borrowerName,daysBorrowed);
		return str;
	}
	boolean isOverdue(){
		if(daysBorrowed>14){
			return true;
		}
		return false;
	}

	public static void main(String[] args){
		Library lib = new Library("Money pyscho","101");
		lib.borrowBook("Kamran");
		lib.extendBorrowPeriod(10);
		lib.calculateFine();
		System.out.println("\n===== Book Details =====");
		String str = lib.bookInfo();
		System.out.print(str);

		lib.returnBook();

		if(lib.isOverdue()){
			System.out.println("\nThe book is over due");
		}
		else 
			System.out.print("\nThe book is not over due");
	}
}