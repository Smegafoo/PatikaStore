public class MobilePhone extends Products {
   private int phoneSupplyPower;
   private String phoneColor;

    public MobilePhone(int productID, int productPrice, int discountRate, int productStocks, String productName, String brandsName,
                       int productStorage, double productSize, int Ram, int phoneSupplyPower, String phoneColor) {
        super(productID, productPrice, discountRate, productStocks, productName, brandsName, productStorage,
                productSize, Ram);
        this.phoneSupplyPower = phoneSupplyPower;
        this.phoneColor = phoneColor;
    }



    public int getPhoneSupplyPower() {
        return phoneSupplyPower;
    }

    public void setPhoneSupplyPower(int phoneSupplyPower) {
        this.phoneSupplyPower = phoneSupplyPower;
    }

    public String getPhoneColor() {
        return phoneColor;
    }

    public void setPhoneColor(String phoneColor) {
        this.phoneColor = phoneColor;
    }
}
