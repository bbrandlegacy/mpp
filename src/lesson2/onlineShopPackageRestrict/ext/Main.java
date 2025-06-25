package lesson2.onlineShopPackageRestrict.ext;

import lesson2.onlineShopPackageRestrict.Customer;
import lesson2.onlineShopPackageRestrict.Item;
import lesson2.onlineShopPackageRestrict.ShoppingCart;

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
