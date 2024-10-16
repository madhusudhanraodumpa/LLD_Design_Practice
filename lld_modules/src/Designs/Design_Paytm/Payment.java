package Designs.Design_Paytm;

import java.util.Date;
import java.util.List;

public class Payment {
    private String Id;
    private Customer sender;
    private Customer reciever;
    private double amount;
    private Date timeStamp;
    private PaymentStatus paymentStatus;
    private PaymentMode paymentMode;
    private List<Transaction> transactionList;

    private void checkStatus(){}
    private void addTransaction(){}
    private void removeTransaction(){}
    private void startPayment(){}
}
