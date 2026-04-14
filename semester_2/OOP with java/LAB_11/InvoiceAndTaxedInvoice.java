abstract class Invoice{
	private String invoiceNumber;
	private double baseAmount;
	Invoice(String invoiceNumber,double baseAmount){
		this.invoiceNumber = invoiceNumber;
		this.baseAmount = baseAmount;
	}
	double getBaseAmount(){
		return this.baseAmount;
	}
	public abstract double amountDue();
	void printHeader(){
		System.out.printf("Invoice Number: %s\nBase Amount: %.2f\n",invoiceNumber,baseAmount);
	}
}
class TaxedInvoice extends Invoice{
	private double taxPercent;
	TaxedInvoice(String invoiceNumber,double baseAmount,double taxPercent){
		super(invoiceNumber,baseAmount);
		this.taxPercent = taxPercent;
	}
	public double amountDue(){
		return getBaseAmount() * (1 + taxPercent/100.0);
	}
}
class Main{
	public static void main(String[] args){
		TaxedInvoice inv = new TaxedInvoice("INV-01",1000,15);
		inv.printHeader();
		System.out.print(inv.amountDue());
	}
}