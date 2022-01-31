package rpg_lab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AxeTest {

    private Axe axe;
    private Dummy dummy;

    @Before
    public void setUp(){
        this.axe = new Axe(10,10);
        this.dummy = new Dummy(1000,10);
    }

    @Test
    public void testAxeCanLoosesAllDurabilityAfterAttack(){
        for (int i = 0; i < 10; i++) {
            axe.attack(dummy);
        }

        assertEquals(0,axe.getDurabilityPoints());

    }


    @Test(expected = IllegalStateException.class)
    public void testAttackWithBrokenAxe(){
        Axe axe = new Axe(10,0);
        axe.attack(dummy);
    }

}