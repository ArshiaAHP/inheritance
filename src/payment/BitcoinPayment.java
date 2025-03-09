package payment;

public class BitcoinPayment implements PaymentStrategy{

    String walletAddress;

    public BitcoinPayment(String walletAddress){
        this.walletAddress = walletAddress;
    }


    @Override
    public void pay(double amount) {
        System.out.println(this.getPaymentDetails() + " - amount: " + amount);
    }

    @Override
    public String getPaymentDetails() {
        String result = "Payment with Bitcoin by: " + walletAddress;
        return result;
    }
}
