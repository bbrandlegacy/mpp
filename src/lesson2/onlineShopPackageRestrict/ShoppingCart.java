package lesson2.onlineShopPackageRestrict;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    ShoppingCart() {
        items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
}
