package app2;

public class LogicalClass {

    private GroceryShop gsb;

    LogicalClass(GroceryShop gsb) {
        this.gsb = gsb;
    }

    public void addItem(int productNumber, double quantity) {
        switch (productNumber) {
            case 1:
                gsb.totalBill += quantity * 15;
                break;
            case 2:
                gsb.totalBill += quantity * 40;
                break;
            case 3:
                gsb.totalBill += quantity * 35;
                break;
            case 4:
                gsb.totalBill += quantity * 55;
                break;
            case 5:
                gsb.totalBill += quantity * 27;
                break;
            default:
                System.out.println("Invalid product number.");
                break;
        }
    }

    public void displayBill() {
        if (gsb.totalBill == 0) {
            System.out.println("No items added to the bill yet.");
            return;
        }

        gsb.discount = gsb.totalBill * 0.05;
        double billAfterDiscount = gsb.totalBill - gsb.discount;

        gsb.gst = billAfterDiscount * 0.03;

        gsb.grandTotal = billAfterDiscount;

        System.out.println("Total Bill: " + gsb.totalBill);
        System.out.println("Discount: " + gsb.discount);
        System.out.println("Bill After Discount: " + billAfterDiscount);
        System.out.println("GST: " + gsb.gst);
        System.out.println("Grand Total: " + gsb.grandTotal);
    }
}
