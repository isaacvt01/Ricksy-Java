package edu.craptocraft;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ReceptivoTest {
    static CrystalExpender crystalExpender;
    static UfosPark ufosPark;
    static Receptivo receptivo;
    @BeforeClass
    public static void inicializar(){
        receptivo = new Receptivo();
        crystalExpender = new CrystalExpender(3, 100);
        ufosPark = new UfosPark();
        ufosPark.add("ovni1");

    }
    @Test
    public void registraTest(){
        Assert.assertTrue(receptivo.getDispatchers().isEmpty());
        receptivo.registra(crystalExpender);
        receptivo.registra(ufosPark);
        Assert.assertNotNull(receptivo.getDispatchers());

    }
    @Test
    public void dispatchTest(){
        CreditCard abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");
        receptivo.dispatch(abradolph);
        //Comprobar que el stock se reduce en 1
        Assert.assertEquals(2, crystalExpender.stock());
        //Comprobar si se cobra 100 + 500 del ovni, se pone 2400 porque todos empiezan con un crédito de 3000
        Assert.assertEquals(2400, abradolph.credit(), 0);

    }
}
