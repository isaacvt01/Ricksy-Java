package edu.craptocraft;

public class CrystalExpender implements GuestDispatcher{

    private int stock;
    private final double itemCost;

    public CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }

    @Override
    public void dispatch(CreditCard creditCard) {
      if (this.stock > 0 && creditCard.pay(itemCost)){
          this.stock--;
      }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("stock: " + this.stock + "\n")
                .append("cost: " + this.itemCost + "\n");

        return sb.toString();
    }

    public int stock() {
        return this.stock;
    }
}
