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
    }
}
