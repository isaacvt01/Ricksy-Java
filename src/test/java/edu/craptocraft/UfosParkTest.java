package edu.craptocraft;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class UfosParkTest {
    static UfosPark ufosPark;
    @BeforeClass
    public static void inicializar(){
        ufosPark = new UfosPark();

    }

    // Da de alta en la flota de ovnis 2 UFOS.
    @Test
    public void crearUfos()   {
        String[] ufosID = { "unx", "dox" };
        for (String ovni : ufosID) {
            ufosPark.add(ovni);
        }
        Assert.assertNotNull(ufosPark);
    }
    @Test
    public void getUfoOfTest(){
        ufosPark.add("unx");
        // En este test también se prueba el método dispatch
        CreditCard abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");
        ufosPark.dispatch(abradolph);
        Assert.assertEquals("unx", ufosPark.getUfoOf(abradolph.number()));
        Assert.assertEquals(2500, abradolph.credit(), 0);
    }

}
