package it.unisa.railways;

import java.util.List;

public class ExpressTrain {
    private TrainStop stazionePartenza;
    private TrainStop stazioneArrivo;
    private List<TrainStop> fermate;
    private int posti;
    private int postiRistorante;
    private int km;

    public ExpressTrain(TrainStop stazionePartenza, TrainStop stazioneArrivo, List<TrainStop> fermate, int posti, int postiRistorante, int km){
        this.stazionePartenza = stazionePartenza;
        this.stazioneArrivo = stazioneArrivo;
        this.fermate = fermate;
        this.posti = posti;
        this.postiRistorante = postiRistorante;
        this.km = km;
    }

    public  int getTotalNumberOfStops(){
        return fermate.size()+2;
    }

    public double computeMaxRevenues(double prezzoXKm, double prezzoRistoranteXKm){
        return km*prezzoXKm*posti + prezzoRistoranteXKm*km*postiRistorante;
    }

}
