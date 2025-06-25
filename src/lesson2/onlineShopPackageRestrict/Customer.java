package lesson2.onlineShopPackageRestrict;

public class Customer {
    private String customerName;
    private ShoppingCart shoppingCart;
    public Customer(String customerName) {
        this.customerName = customerName;
        this.shoppingCart = new ShoppingCart();
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
}
