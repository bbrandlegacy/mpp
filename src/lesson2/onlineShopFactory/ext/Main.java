package lesson2.onlineShopFactory.ext;

import lesson2.onlineShopFactory.Customer;
import lesson2.onlineShopFactory.Item;
import lesson2.onlineShopFactory.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Luke");
        ShoppingCart shoppingCart = customer.getShoppingCart();

        shoppingCart.addItem(new Item( "Apple"));
        shoppingCart.addItem(new Item("Pear") );
        shoppingCart.addItem(new Item("Orange") );
        shoppingCart.addItem(new Item("Water") );



        System.out.println(shoppingCart.getItems());
    }
}