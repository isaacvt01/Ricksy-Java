package edu.craptocraft;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CrystalExpenderTest {
    static CrystalExpender crystal;
    @BeforeClass
    public static void inicializar(){
        crystal = new CrystalExpender(3, 100);
    }
    @Test
    public void constructorTest(){
        //El coste se testeará en el test de dispatch
        Assert.assertEquals(3, crystal.stock());
    }
    @Test
    public void dispatchTest(){
        CreditCard abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");
        crystal.dispatch(abradolph);
        //Comprobar que el stock se reduce en 1
        Assert.assertEquals(2, crystal.stock());
        //Comprobar si se cobra 100, se pone 2900 porque todos empiezan con un crédito de 3000
        Assert.assertEquals(2900, abradolph.credit(), 0);
    }

}
