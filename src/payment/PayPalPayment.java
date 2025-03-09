package payment;

public class PayPalPayment implements PaymentStrategy {
    String email;

    public PayPalPayment(String email){
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println(this.getPaymentDetails() + " - amount: " + amount);
    }

    @Override
    public String getPaymentDetails() {
        String result = "Payment with PayPal by: " + this.email;
        return result;
    }
}
