package Designs.Design_Paytm;

import java.util.Date;

public class Transaction {
    private String Id;
    private Date transactionTime;
    private Payment payment;
    private TransactionStatus transactionStatus;
    private TransactionMode transactionMode;

    private void sendMoney(){}//implement this method different startgey like CC,DC and UPI
}
