public class Order {
    private double amount;
    private boolean paid;
    private boolean inStock;
    private boolean shipped;

    public Order(double amount, boolean inStock) {
        this.amount = amount;
        this.inStock = inStock;
        this.paid = false;
        this.shipped = false;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public boolean isInStock() {
        return inStock;
    }

    public boolean isShipped() {
        return shipped;
    }

    public void setShipped(boolean shipped) {
        this.shipped = shipped;
    }

    public double getAmount() {
        return amount;
    }
}
