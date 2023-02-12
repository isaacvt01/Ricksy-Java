package edu.craptocraft;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class RickMenuDispatcherTest {
    static RickMenuDispatcher rickMenu;
    static CreditCard abradolph;
    @BeforeClass
    public static void inicializar(){
        rickMenu = new RickMenuDispatcher();
        abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");
    }
    @Test
    public void dispatchTest(){
        rickMenu.dispatch(abradolph);
        Assert.assertEquals("Abradolph Lincler", rickMenu.getClients().get(0));
        Assert.assertEquals(99, rickMenu.getStock());
        Assert.assertEquals(2990, abradolph.credit(), 0);
    }
}
