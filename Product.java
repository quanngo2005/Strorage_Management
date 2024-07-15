public class Product {
    private String productCode;
    private String productName;
    private String barcode;
    private String productType;
    private String manufacturer;
    private String supplier;
    private String unit;
    private double purchasePrice;
    private double sellingPrice;
    private String attribute;
    private int    quantityInStock;
    private String storageLocation;

    // constructors, getters, and setters
    public Product() {}

    public Product(String productCode, String productName, String barcode, String productType, String manufacturer, String supplier, String unit , double purchasePrice , double sellingPrice , String attribute , int quantityInStock , String storageLocation) {
        this.productCode = productCode;
        this.productName = productName;
        this.barcode = barcode;
        this.productType = productType;
        this.manufacturer = manufacturer;
        this.supplier = supplier;
        this.unit = unit;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.attribute = attribute;
        this.quantityInStock = quantityInStock;
        this.storageLocation = storageLocation;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBarcode() {
        return this.barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getProductType() {
        return this.productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSupplier() {
        return this.supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getPurchasePrice() {
        return this.purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getAttribute() {
        return this.attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public int getQuantityInStock() {
        return this.quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public String getStorageLocation() {
        return this.storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }
}
