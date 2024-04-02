public class Products {
    private int productID;
    private int productPrice;
    private int discountRate;
    private int productStocks;
    private String productName;
    private String brandsName;
    private int productStorage;
    private double ProductSize;
    private int Ram;

    public Products(int productID, int productPrice, int discountRate,
                    int productStocks, String productName,
                    String brandsName, int productStorage,
                    double productSize, int Ram) {
        this.productID=this.productID;
        this.productPrice = productPrice;
        this.discountRate = discountRate;
        this.productStocks = productStocks;
        this.productName = productName;
        this.brandsName = brandsName;
        this.productStorage = productStorage;
        this.ProductSize = productSize;
        this.Ram=Ram;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getProductStocks() {
        return productStocks;
    }

    public void setProductStocks(int productStocks) {
        this.productStocks = productStocks;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrandsName() {
        return brandsName;
    }

    public void setBrandsName(String brandsName) {
        this.brandsName = brandsName;
    }

    public int getProductStorage() {
        return productStorage;
    }

    public void setProductStorage(int productStorage) {
        this.productStorage = productStorage;
    }

    public double getProductSize() {
        return ProductSize;
    }

    public void setProductSize(double productSize) {
        ProductSize = productSize;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }
}
