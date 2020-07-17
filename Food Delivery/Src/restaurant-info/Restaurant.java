package FoodDelivery.restaurantinfo;


import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    
    private String id;

    
    private String restaurantName;

    private List<Item> items = new ArrayList<>();

   
    private Point location;
    private Address address;
    private String description;
    private DeliveryInfo deliveryInfo;
    private String phoneNumber;
    private String image; 

    
    public Restaurant() {
    }

    @JsonCreator
    public Restaurant(@JsonProperty("restaurantName") String restaurantName,
                      @JsonProperty("items") List<Item> items) {
        this.restaurantName = restaurantName;
        this.items = items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
