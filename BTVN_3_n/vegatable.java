package bai1;

public class vegatable {

    private String id;
    private String name;
    private String unit;
    private int quantitySold;
    private int sale;
    private double price;

    public vegatable() {
    }

    public vegatable(String id, String name, String unit, int quantitySold, int sale, double price) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.quantitySold = quantitySold;
        this.sale = sale;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalRevenue() {
        return quantitySold * (price - (price * sale) / 100);
    }

    void display() {

        System.out.printf("%-4s %-15s %-7s %-15s %-7s %-10s %-10s\n", this.id, this.name, this.unit, this.quantitySold,
                this.sale, String.format("%.0f", this.price), String.format("%.0f", this.getTotalRevenue()));

    }
}
