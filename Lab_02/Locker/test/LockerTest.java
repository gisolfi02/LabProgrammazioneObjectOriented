import org.junit.Assert;
import org.junit.Test;

public class LockerTest {
    @Test
    public void testLocker(){
        Locker locker = new Locker();
        locker.newComb("1234");
        locker.lock();
        locker.unlock("1234");
        Assert.assertEquals(true,locker.isOpen());
        locker.lock();
        locker.unlock("2356");
        Assert.assertEquals(false,locker.isOpen());
    }
}
