package edu.craptocraft;

public class CreditCard {
    private final String owner;
    private final String number;
    private double credit = 3000d;


    public CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("owner: ").append(this.owner + "\n")
                .append("number: ").append(this.number + "\n")
                .append("credit: ").append(this.credit + "EZI" + "\n");
        return sb.toString();
    }

    public String cardOwner(){
        return this.owner;
    }
    public String number(){
        return this.number;
    }
    public boolean pay(double price){
        if (price<=this.credit){
            this.credit -= price;
            return true;
        }else{
            return false;
        }
    }
    public double credit(){
        return this.credit;
    }
}
