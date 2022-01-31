package rpg_lab;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.Random;

import static org.junit.Assert.assertEquals;


public class HeroTest {

    @Test
    public void testHeroGainsXpByKillingTargets() {

        Weapon weapon = Mockito.mock(Weapon.class);

        Hero hero = new Hero("Test_Hero", weapon);

        Target target = Mockito.mock(Target.class);

        Mockito.when(target.isDead()).thenReturn(true);
        Mockito.when(target.giveExperience()).thenReturn(10);

        hero.attack(target);

        assertEquals(10, hero.getExperience());

    }

    @Test
    public void testItemDropShouldDropCorrectly() {
        Weapon weapon = Mockito.mock(Weapon.class);
        Hero hero = new Hero("Test_Hero", weapon);
        Target target = Mockito.mock(Target.class);

        Random random = Mockito.mock(Random.class);



        Mockito.when(random.nextInt(Mockito.anyInt())).thenReturn(2);

        Weapon weapon1 = Mockito.mock(Weapon.class);
        Weapon weapon2 = Mockito.mock(Weapon.class);
        Weapon weapon3 = Mockito.mock(Weapon.class);

        Mockito.when(weapon3.getAttack()).thenReturn(100);

        Mockito.when(target.dropWeapon(random)).thenReturn(weapon3);
    }

}