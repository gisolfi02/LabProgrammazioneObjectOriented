import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarSeller {
    private final List<Car> cars;

    public CarSeller() {

        this.cars = new ArrayList<>();
    }

    public void readCars(File f) throws FileNotFoundException {
        Scanner input = new Scanner(f);
        while (input.hasNextLine()) {
            String marca = input.nextLine();
            String modello = input.nextLine();
            int immatricolazione = Integer.parseInt(input.nextLine());
            double prezzo = Double.parseDouble(input.nextLine());
            Car car = new Car(marca, modello, immatricolazione, prezzo);
            cars.add(car);
        }
    }

    public List<Car> findCarByMarcaAModello(String marca, String modello){
        List<Car> car = new ArrayList<>();
        for (Car c : cars)
            if(c.getModel().equals(modello) && c.getBrand().equals(marca))
                car.add(c);
        return car;
    }

    public List<Car> findCarByMarcaAndModelloAndImmatricolazione(String marca, String modello, int immatricolazione ){
        List<Car> car = new ArrayList<>();
        for (Car c : cars)
            if(c.getBrand().equals(marca) && c.getModel().equals(modello) && c.getManufacturingYear()<immatricolazione)
                car.add(c);
        return car;
    }

    public List<Car> findCarByMarcaAndModelloAndPrezzo(String marca, String modello, int immatricolazioe, double prezzoMin, double prezzoMax){
        List<Car> car = new ArrayList<>();
        for (Car c : cars)
            if(c.getBrand().equals(marca) && c.getModel().equals(modello) && c.getManufacturingYear()<immatricolazioe && c.getPrice()>=prezzoMin && c.getPrice()<=prezzoMax)
                car.add(c);
        return car;
    }
}