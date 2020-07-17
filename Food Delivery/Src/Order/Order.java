package FoodDelivery.orderdetails;

public class Order {

  
    private String id;

    private String userId;
    private String paymentId;
    private OrderStatus orderStatus;
    private List<Item> items = new ArrayList<>();
    private DeliveryInfo deliveryInfo;
    private double totalCost;
    private String note;
    
    private Date creationTime;
    
    private Date lastModifyTime;

    private Map<OrderStatus, Date> updateHistory = new HashMap<>();

    public Order() {
    }

    @JsonCreator
    public Order(@JsonProperty("items") List<Item> items,
                 @JsonProperty("deliveryInfo") DeliveryInfo deliveryInfo,
                 @JsonProperty("note") String note) {
        this.id = id;
        this.items = items;
        this.deliveryInfo = deliveryInfo;
        this.note = note;
        this.creationTime = new Date();
        this.totalCost = calculateTotalCost(this.items);
        this.orderStatus = OrderStatus.PENDING;
        this.updateHistory.put(this.orderStatus, this.creationTime);
    }

    private double calculateTotalCost(List<Item> items) {
        double cost = 0L;
        for(Item item : items) {
            cost += item.getPrice()*100;
        }
        return cost/100.0;
    }

}
