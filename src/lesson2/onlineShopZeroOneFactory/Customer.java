package lesson2.onlineShopZeroOneFactory;

public class Customer {
    private String customerName;
    private ShoppingCart shoppingCart;

    public Customer(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        if(shoppingCart != null) {
            this.shoppingCart = shoppingCart;
        }
    }
}
