package payment;

import java.util.ArrayList;

public abstract class Customer {
    String name;
    ArrayList<String> paymentHistory;

    public Customer(String name){
        this.name = name;
        this.paymentHistory = new ArrayList<>();
    }

    public abstract void displayCustomerInfo();

    public void makePayment(PaymentStrategy paymentStrategy, double amount){
        paymentStrategy.pay(amount);
        this.paymentHistory.add(paymentStrategy.getPaymentDetails() + " - amount: " + amount);
    }
    public void showPaymentHistory(){
        for(String i : this.paymentHistory){
            System.out.println(i);
        }
    }

}
