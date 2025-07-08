public class PetrolPurchase {
    private String stationLocation;
    private String petol;
    private int quantity;
    private double price;
    private double percentageDiscount;


    public PetrolPurchase(String stationLocation, String petol, int quantity, double price, double percentageDiscount) {
        this.stationLocation = stationLocation;
        this.petol = petol;
        this.quantity = quantity;
        this.price = price;
        this.percentageDiscount = percentageDiscount;
    }
    public void setStationLocation() {
        this.stationLocation = stationLocation;
    }
    public String getStationLocation() {
        return stationLocation;
    }

    public void setPetol() {
        this.petol = petol;
    }
    public String getPetol() {
        return petol;
    }

    public void setQuantity() {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setPrice() {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public void setPercentageDiscount() {
        this.percentageDiscount = percentageDiscount;
    }
    public double getPercentageDiscount() {
        return percentageDiscount;
    }


public double getPurchaseAmount() {
        double total = (quantity * price) - percentageDiscount;
        return total;
}


}
