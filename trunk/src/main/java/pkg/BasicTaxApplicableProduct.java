package pkg;

class BasicTaxApplicableProduct extends Product {
	
	// Constructors
	public BasicTaxApplicableProduct() { };
	
	public BasicTaxApplicableProduct(double price, boolean isImported, String name) {
		this.price = price;
		this.isImported = isImported;
		this.name = name;
	};
	
	// compute basic and add imported
	public double computeSalesTax() {
		return getImportTax() + Math.round(0.1 * this.getPrice()*20)/20.00;
	};
}