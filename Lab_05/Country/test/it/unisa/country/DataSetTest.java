package it.unisa.country;

import org.junit.Assert;
import org.junit.Test;

public class DataSetTest {
    @Test
    public void testMinimum() {
        Country c1 = new Country("Italia", 70000);
        Country c2 = new Country("USA", 200000);
        Country c3 = new Country("Burundi", 27000);
        DataSet d = new DataSet();
        d.add(c1);
        d.add(c2);
        d.add(c3);
        Assert.assertEquals("Burundi" + 27000.0, d.getMinimum().getName() + d.getMinimum().getSurfaceArea());
    }

    @Test
    public void testMaximum() {
        Country c1 = new Country("Italia", 70000);
        Country c2 = new Country("USA", 200000);
        Country c3 = new Country("Burundi", 27000);
        DataSet d = new DataSet();
        d.add(c1);
        d.add(c2);
        d.add(c3);
        Assert.assertEquals("USA" + 200000.0, d.getMaximum().getName() + d.getMaximum().getSurfaceArea());
    }
}