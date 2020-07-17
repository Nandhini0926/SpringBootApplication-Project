package FoodDelivery.restaurantinfo;

public class address {

    private String address, city, state;
    private Integer zipcode;

    public address() {
    }

    public address(String state, String city, String address, Integer zipcode) {
        this.state = state;
        this.city = city;
        this.address = address;
        this.zipcode = zipcode;
    }

}
