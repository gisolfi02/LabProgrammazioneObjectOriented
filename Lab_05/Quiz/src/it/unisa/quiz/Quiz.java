package it.unisa.quiz;

public class Quiz implements Measurable {

    private double result;

    public Quiz(double result){
        this.result = result;
    }
    @Override
    public double getMeasure() {
        return result;
    }
}
