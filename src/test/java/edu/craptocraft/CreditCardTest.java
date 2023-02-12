package edu.craptocraft;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CreditCardTest {
    static CreditCard abradolph;
    @BeforeClass
    public static void inicializar(){
        abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");
    }
    @Test
    public void constructorTest(){
        Assert.assertEquals("Abradolph Lincler", abradolph.cardOwner() );
        Assert.assertEquals(3000, abradolph.credit(), 0);
        Assert.assertEquals("4916119711304546", abradolph.number());
    }

    @Test
    public void payTest(){
        Assert.assertFalse(abradolph.pay(5000));
        Assert.assertTrue(abradolph.pay(1000));
        Assert.assertFalse(abradolph.pay(3000));
        Assert.assertEquals(2000, abradolph.credit(), 0);
    }
}
