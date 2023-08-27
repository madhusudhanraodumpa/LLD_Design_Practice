package facade;

public class Operator {
    OrderDelivering orderDelivering;
    Payment payment;
    PlaceOrder placeOrder;
    public Operator(){
        this.orderDelivering=new OrderDelivering();
        this.payment=new Payment();
        this.placeOrder=new PlaceOrder();
    }
    public void completedOrder(){
        placeOrder.orderStatus();
        payment.paymentStatus();
        orderDelivering.deliveryStatus();
    }
}
