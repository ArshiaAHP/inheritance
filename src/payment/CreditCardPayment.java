package payment;

public class CreditCardPayment implements PaymentStrategy {

    String cardNumber;
    String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName){
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println(this.getPaymentDetails() + " - amount: " + amount);
    }

    @Override
    public String getPaymentDetails() {
        String result = "Payment with card By: " + this.cardHolderName + " - Card Number: " + this.cardNumber;
        return result;
    }
}
