package edu.craptocraft;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UfosPark implements GuestDispatcher {
    private double fee = 500d;
    private final Map<String, String> flota = new HashMap<String, String>();

    UfosPark() {};

    public void add(String ufosID){
        flota.putIfAbsent(ufosID, null);
    }

    @Override
    public void dispatch(CreditCard creditCard) {

        if(!flota.containsValue(creditCard.number())){
            Optional<Map.Entry<String, String>> ufo = flota.entrySet().stream()
                    .filter(entry -> entry.getValue() == null)
                    .findFirst();
            if(ufo.isPresent() && creditCard.pay(500.00)){
                this.flota.put(ufo.get().getKey(), creditCard.number() );
            }
        }

    }

    public String getUfoOf(String number) {
        Optional<Map.Entry<String, String>> ufo = flota.entrySet().stream()
                .filter(entry -> entry.getValue() == number)
                .findFirst();
        return ufo.isPresent()?ufo.get().getKey():"No tiene ovni";
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(flota.keySet());



        return sb.toString();
    }
}
