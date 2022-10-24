package it.unisa.quiz;

import java.util.ArrayList;

public class DataSet {

    private double sum;
    private Measurable minimum;
    private Measurable maximum;
    private int count;
    public DataSet() {
        sum = 0;
        minimum = null;
        maximum = null;
        count = 0;
    }

    public double getAverage() {
        if(count == 0)
            return 0;
        return sum/count;
    }

    public Measurable getMaximum() {
        return maximum;
    }

    public Measurable getMinimum() {
        return minimum;
    }

    public void add(Measurable x) {
        sum += x.getMeasure();
        if(count == 0 || x.getMeasure()>maximum.getMeasure())
            maximum = x;
        if(count == 0 || x.getMeasure()<minimum.getMeasure())
            minimum = x;
        count++;
    }
}