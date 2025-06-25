package lesson2.onlineShopZeroOneFactory.ext;


import lesson2.onlineShopZeroOneFactory.Item;
import lesson2.onlineShopZeroOneFactory.Customer;
import lesson2.onlineShopZeroOneFactory.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Luke");
        ShoppingCart shoppingCart = ShoppingCart.createShoppingCart(customer);

        shoppingCart.addItem(new Item("Apple"));
        shoppingCart.addItem(new Item("Pear"));
        shoppingCart.addItem(new Item("Orange"));
        shoppingCart.addItem(new Item("Water"));

        System.out.println(shoppingCart.getItems());
    }
}
