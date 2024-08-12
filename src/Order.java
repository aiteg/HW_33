import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private String customerName;
    private List<MenuItem> items = new ArrayList<MenuItem>();
    private boolean isCompleted;

    public Order(int orderId, String customerName, List<MenuItem> items, boolean isCompleted) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = items;
        this.isCompleted = isCompleted;
    }

    public Order() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public double calculateTotal() {
        double totalCost = 0.0;
        for (MenuItem item : items) {
            totalCost += item.getPrice();
        }
        return totalCost;
    }

    public void completedOrder() {
        isCompleted = true;
    }

    @Override
    public String toString() {
        return "OrderId: " + orderId +
                "\nCustomerName: " + customerName + '\'' +
                "\nItems: " + items +
                "\nIsCompleted: " + isCompleted;
    }
}
