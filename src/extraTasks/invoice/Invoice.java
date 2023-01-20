package extraTasks.invoice;

/**
 * Author: Home PC
 * Date: 19/01/2023
 * Time: 20:55
 */
public class Invoice {
    private final String invoiceNumber;
    private int cost;
    private boolean status;
    private String paidBy;

    public Invoice(String invoiceNumber, int cost, boolean status, String paidBy) {
        this.invoiceNumber = invoiceNumber;
        this.cost = cost;
        this.status = status;
        this.paidBy = paidBy;
    }

    public Invoice(String invoiceNumber, int cost, boolean status) {
        this.invoiceNumber = invoiceNumber;
        this.cost = cost;
        this.status = status;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(String paidBy) {
        this.paidBy = paidBy;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceNumber='" + invoiceNumber + '\'' +
                ", cost=" + cost +
                ", status=" + status +
                ", paidBy='" + paidBy + '\'' +
                '}';
    }
}
