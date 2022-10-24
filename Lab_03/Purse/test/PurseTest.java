import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.AnnotatedArrayType;

public class PurseTest {

  @Test
  public void findTest() {
    Purse p = new Purse();
    p.add(Purse.dollar);
    Assert.assertTrue(p.find(Purse.dollar));
    Assert.assertFalse(p.find(Purse.dime));
  }

  @Test
  public void countTest() {
    Purse p = new Purse();
    p.add(Purse.dollar);
    p.add(Purse.dollar);
    Assert.assertEquals(2,p.count(Purse.dollar));
  }

  @Test
  public void minMaxTest() {
    Purse p = new Purse();
    p.add(Purse.dollar);
    p.add(Purse.dime);
    p.add(Purse.cent);
    Assert.assertEquals(Purse.cent, p.getMinimum());
    Assert.assertEquals(Purse.dollar, p.getMaximum());
  }

  @Test
  public void getTotalTest() {
    Purse p = new Purse();
    p.add(Purse.dollar);
    p.add(Purse.dime);
    p.add(Purse.quarter);
    p.add(Purse.nickel);
    Assert.assertEquals(1.40, p.getTotal(), 0.1);
  }

  @Test
  public void addRemoveTest() {
    Purse p = new Purse();
    p.add(Purse.dollar);
    Assert.assertEquals(1,p.count(Purse.dollar));
    p.remove(Purse.dollar);
    Assert.assertEquals(0,p.count(Purse.dollar));
  }

  @Test
  public void hasCoinTest() {
    Purse p = new Purse();
    Assert.assertFalse(p.hasCoin(Purse.dollar));
    p.add(Purse.dollar);
    Assert.assertTrue(p.hasCoin(Purse.dollar));
  }

  @Test
  public void toStringTest() {
    Purse p = new Purse();
    p.add(Purse.dollar);
    p.add(Purse.dollar);
    p.add(Purse.quarter);
    p.add(Purse.dime);
    p.add(Purse.nickel);
    p.add(Purse.cent);
    Assert.assertEquals("Purse[Dollar = 2, Quarter = 1, Dime = 1, Nickel = 1, Cent = 1]", p.toString());
  }

  @Test
  public void equalsTest() {
    Purse p1 = new Purse();
    p1.add(Purse.dollar);
    p1.add(Purse.dollar);
    p1.add(Purse.quarter);
    p1.add(Purse.dime);
    p1.add(Purse.nickel);
    p1.add(Purse.cent);

    Assert.assertEquals(p1, p1);
    Assert.assertNotEquals(null, p1);
    Assert.assertNotEquals(p1, new Object());

    Purse p2 = new Purse();
    p2.add(Purse.dollar);
    p2.add(Purse.dollar);
    p2.add(Purse.quarter);
    p2.add(Purse.dime);
    p2.add(Purse.nickel);
    p2.add(Purse.cent);
    Assert.assertEquals(p1, p2);

    Purse p3 = new Purse();
    p3.add(Purse.dollar);
    Assert.assertNotEquals(p1, p3);
  }
}