package FoodDelivery.restaurantinfo;

public class DeliveryInfo {

    private static final double DEFAULT_DELIVERY_DISTANCE = 20; 

    private double charge;
    private double maxDeliveryDistance; 
    private String averageDeliveryTime;

    public DeliveryInfo() {
    }

    public DeliveryInfo(double charge) {
        this.charge = charge;
    }

    public DeliveryInfo(double charge, double maxDeliveryDistance) {
        this.charge = charge;
        this.maxDeliveryDistance = maxDeliveryDistance;
    }

    public double getMaxDeliveryDistance() {
        return maxDeliveryDistance;
    }

    public void setMaxDeliveryDistance(double maxDeliveryDistance) {
        this.maxDeliveryDistance = maxDeliveryDistance;
    }
}
