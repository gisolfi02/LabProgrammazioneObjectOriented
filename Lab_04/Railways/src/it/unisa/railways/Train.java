package it.unisa.railways;

import java.util.List;

public class Train {
    private TrainStop stazionePartenza;
    private TrainStop stazioneArrivo;
    private List<TrainStop> fermate;
    private int posti;
    private int km;

    public Train(TrainStop stazionePartenza, TrainStop stazioneArrivo, List<TrainStop> fermate, int posti, int km){
        this.stazionePartenza = stazionePartenza;
        this.stazioneArrivo = stazioneArrivo;
        this.fermate = fermate;
        this.posti = posti;
        this.km = km;
    }

    public  int getTotalNumberOfStops(){

        return fermate.size()+2;
    }

    public double computeMaxRevenues(double prezzoXkm){

        return km*prezzoXkm*posti;
    }
}