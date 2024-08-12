import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Restaurant {
    List<Order> orders = new ArrayList<Order>();
    List<MenuItem> menu = new ArrayList<MenuItem>();

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public Order getOrderById(int orderId) throws NoSuchElementException {
        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                return order;
            }
        }
        throw new NoSuchElementException("Данного заказа нет в списке");
    }

    public void completeOrder(int orderId) throws IllegalArgumentException {
        for (Order order : orders) {
            if (order.getOrderId() == orderId && !order.isCompleted()) {
                order.completedOrder();
            }
        }
        throw new IllegalArgumentException("Данный заказ не найден или уже завершен");
    }

    @Override
    public String toString() {
        String str = "";

        for (MenuItem menuItem : menu) {
            str += menuItem.toString();
        }

        return str;
    }
}
