import payment.*;


public class Main {
    public static void main(String[] args) {

        Customer ali = new PremiumCustomer("Ali");
        Customer majid = new RegularCustomer("Majid");
        Customer hamid = new PremiumCustomer("Hamid");

        PayPalPayment aliPayPal = new PayPalPayment("ali@yahoo.com");
        BitcoinPayment majidBitcoin = new BitcoinPayment("1234B33");
        CreditCardPayment hamidCard = new CreditCardPayment("6362 1411 0967 3322", "Hamid");

        ali.displayCustomerInfo();
        majid.displayCustomerInfo();
        hamid.displayCustomerInfo();
        System.out.println("===="); //for better reading


        ali.makePayment(aliPayPal, 200);
        ali.makePayment(aliPayPal, 350);

        System.out.println("====");


        majid.makePayment(majidBitcoin, 7000);
        majid.makePayment(majidBitcoin, 4000);

        System.out.println("====");


        hamid.makePayment(hamidCard, 60);
        hamid.makePayment(hamidCard, 20);

        System.out.println("====");


        ali.showPaymentHistory();
        System.out.println("====");
        majid.showPaymentHistory();
        System.out.println("====");
        hamid.showPaymentHistory();




    }
}