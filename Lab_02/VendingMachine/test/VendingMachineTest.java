import org.junit.Assert;
import org.junit.Test;

public class VendingMachineTest {
    @Test
    public void TestAddCan(){
        VendingMachine newMachine = new VendingMachine(10);
        newMachine.addCans(20);
        Assert.assertEquals(30,newMachine.getNumberOfCans(),0);
    }

    @Test
    public void TestTakeCanAndTokens(){
        VendingMachine newMachine = new VendingMachine(10);
        newMachine.takeCan();
        Assert.assertEquals(9,newMachine.getNumberOfCans(),0);
        Assert.assertEquals(1,newMachine.getNumberOfTokens(),0);
        newMachine.takeTokens();
        Assert.assertEquals(0,newMachine.getNumberOfTokens(),0);
    }
}