package edu.craptocraft;

import java.util.ArrayList;
import java.util.List;

public class Receptivo {
    List<GuestDispatcher> dispatchers = new ArrayList<>();

    public Receptivo() {}
    public void registra(GuestDispatcher dispatcher){
        dispatchers.add(dispatcher);
    }
    public  void dispatch(CreditCard creditCard){
        dispatchers.stream()
                .forEach(d -> d.dispatch(creditCard));
    }
}
