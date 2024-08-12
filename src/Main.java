import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        MenuItem menuItem1 = new MenuItem("Шавуха", 200.0);
        MenuItem menuItem2 = new MenuItem("Манты", 400.0);
        MenuItem menuItem3 = new MenuItem("Шашлык", 800.5);
        MenuItem menuItem4 = new MenuItem("Бургер", 190.0);

        List<MenuItem> menuItems1 = new ArrayList<MenuItem>();
        menuItems1.add(menuItem1);
        menuItems1.add(menuItem2);

        List<MenuItem> menuItems2 = new ArrayList<MenuItem>();
        menuItems2.add(menuItem3);
        menuItems2.add(menuItem4);

        Order order1 = new Order(1, "Ivan", menuItems1, false);
        Order order2 = new Order(2, "Sasha", menuItems2, false);

        Restaurant restaurant = new Restaurant();
        restaurant.addMenuItem(menuItem1);
        restaurant.addMenuItem(menuItem2);
        restaurant.addMenuItem(menuItem3);
        restaurant.addMenuItem(menuItem4);
        restaurant.placeOrder(order1);
        restaurant.placeOrder(order2);

        try {
            System.out.println(order1.calculateTotal());
            System.out.println(order2.calculateTotal());
            restaurant.placeOrder(order1);
            restaurant.placeOrder(order2);
            restaurant.addMenuItem(new MenuItem("Плов", 250.0));
            System.out.println(restaurant.getOrderById(1).toString());
            restaurant.completeOrder(1);
            restaurant.getOrderById(100);
            restaurant.completeOrder(100);
        } catch (NoSuchElementException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}