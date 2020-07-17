package FoodDelivery.paymentdetails;


public class Payment {

    @Id
    private String id = UUID.randomUUID().toString();

    @ManyToOne(targetEntity = CreditCard.class, cascade = CascadeType.ALL)
    private CreditCard creditCard;
    private String orderId;
    private double amount;  // in dollars
    private PaymentStatus paymentStatus;

    public Payment() {
    }

    @JsonCreator
    public Payment(@JsonProperty("orderId") String orderId,
                   @JsonProperty("creditCard") CreditCard creditCard,
                   @JsonProperty("amount") double amount) {
        this.orderId = orderId;
        this.creditCard = creditCard;
        this.amount = amount;
        this.paymentStatus = PaymentStatus.PENDING;
    }

}
