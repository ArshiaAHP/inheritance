package payment;

import java.util.ArrayList;

public class PremiumCustomer extends Customer{

    public PremiumCustomer(String name){
        super(name);
    }

    @Override
    public void displayCustomerInfo() {
        System.out.println("Premium Customer: " + this.name);
    }
}
