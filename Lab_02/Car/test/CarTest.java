import org.junit.Assert;
import org.junit.Test;

public class CarTest {
    @Test
    public void TestCar(){
        Car car = new Car(2);
        car.addGas(50);
        car.drive(10);
        Assert.assertEquals(30.0,car.getGas(),0);
    }
}
