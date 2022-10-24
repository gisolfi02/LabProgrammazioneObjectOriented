import java.util.ArrayList;
import java.util.List;

public class Purse {

     final static Coin dollar = new Coin("Dollar",1);
     final static Coin quarter = new Coin("Quarter", 0.25);
     final static Coin dime = new Coin("Dime", 0.10);
     final static Coin nickel = new Coin("Nickel",0.05);
    final static Coin cent = new Coin("Cent", 0.01);

    private final List<Coin> coins;

    public Purse() {

        coins = new ArrayList<>();
    }

    public void add(Coin coin) {

        coins.add(coin);
    }

    public boolean find(Coin coin) {
        for(Coin c : coins) {
            if (c.equals(coin))
                return true;
        }
        return false;
    }

    public int count(Coin coin) {
        int total = 0;
        for (Coin c : coins){
            if (c.equals(coin))
                total++;
        }
        return total;
    }

    public Coin getMinimum() {
        if(coins.size()==0)
            return null;
        Coin min = coins.get(0);
        for (Coin c : coins) {
            if (c.getValue() < min.getValue())
                min = c;
        }
        return min;
    }

    public Coin getMaximum() {
        if(coins.size()==0)
            return null;
        Coin max = coins.get(0);
        for (Coin c : coins) {
            if (c.getValue() > max.getValue())
                max = c;
        }
        return max;
    }

    public double getTotal() {
        double somma = 0;
        for(Coin c : coins)
            somma += c.getValue();
        return somma;
    }

    public void remove(Coin coin) {
        coins.remove(coin);
    }

    public boolean hasCoin(Coin coin) {
        return coins.contains(coin);
    }

    @Override
    public String toString() {
        return "Purse[Dollar = " + count(dollar) +", Quarter = " + count(quarter) + ", Dime = " + count(dime) +", Nickel = " + count(nickel) + ", Cent = " + count(cent) +"]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purse purse = (Purse) o;
        return purse.count(dollar) == this.count(dollar)
                && purse.count(quarter) == this.count(quarter)
                && purse.count(dime) == this.count(dime)
                && purse.count(nickel) == this.count(nickel)
                && purse.count(cent) == this.count(cent);
    }
}