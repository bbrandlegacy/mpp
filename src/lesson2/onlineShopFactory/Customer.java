package lesson2.onlineShopFactory;

public class Customer {
    private String customerName;
    private ShoppingCart shoppingCart;

    public Customer(String customerName) {
        this.customerName = customerName;
        ShoppingCart.createShoppingCart(this);
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        if(this.shoppingCart != null){
            this.shoppingCart = shoppingCart;
        }
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
}
