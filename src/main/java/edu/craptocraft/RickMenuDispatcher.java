package edu.craptocraft;

import java.util.ArrayList;
import java.util.List;

public class RickMenuDispatcher implements GuestDispatcher{
    private int stock = 100;
    private final double itemCost = 10.00;

    List<String> clients = new ArrayList<>();

    public RickMenuDispatcher() {}

    @Override
    public void dispatch(CreditCard creditCard) {
        if (this.stock > 0 && creditCard.pay(itemCost)){
            this.stock--;
            this.clients.add(creditCard.cardOwner());
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("stock: " + this.stock + "\n");
        sb.append(this.clients);
        return sb.toString();
    }
}
