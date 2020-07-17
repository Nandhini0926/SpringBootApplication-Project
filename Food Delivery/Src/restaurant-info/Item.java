package FoodDelivery.restaurantinfo;

public class Item {

    private String itemId = new ObjectId().toString();
    private String itemName;
    private double price;  
    private String category;
    private boolean isFavorites = false; 
    private boolean isActive = true;
   

    public Item() {
    }

    public Item(String name, double price, String category) {
        this.itemName = name;
        this.price = price;
        this.category = category;
    }

}
