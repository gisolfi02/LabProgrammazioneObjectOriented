package it.unisa.SMS;

import java.util.GregorianCalendar;

public class SMS {
  private final String sender;
  private final GregorianCalendar data;
  //private final int id;
  private final String testo;

  public SMS(String sender, GregorianCalendar data, String testo){
      this.sender = sender;
      this.data = data;
      //this.id = id;
      this.testo = testo;
  }

  public String getSender(){
      return sender;
  }
  public GregorianCalendar getDate(){
      return data;
  }
}