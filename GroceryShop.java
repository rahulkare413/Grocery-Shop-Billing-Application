package app2;

public class GroceryShop {

    int choice = 0;
    double totalBill = 0.0;
    double discount = 0.0;
    double gst = 0.0;
    double grandTotal = 0.0;

    public GroceryShop(int choice, double totalBill, double discount, double gst, double grandTotal) {
        this.choice = choice;
        this.totalBill = totalBill;
        this.discount = discount;
        this.gst = gst;
        this.grandTotal = grandTotal;
    }
}
