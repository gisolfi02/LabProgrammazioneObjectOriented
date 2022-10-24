import org.junit.Assert;
import org.junit.Test;

public class InfectedTest {

    @Test
    public void TestInfected(){
        Infected infected = new Infected("COVID", 12);
        Assert.assertEquals("COVID", infected.getDisease());
        Assert.assertEquals(12, infected.getNumberOfInfected());
    }
    @Test
    public void TestAddInfected(){
        Infected infected = new Infected("COVID");
        infected.addInfected(14);
        infected.updateInfectedByRt(2.2);
        Assert.assertEquals(30,infected.getNumberOfInfected(),0.8);
    }
}
