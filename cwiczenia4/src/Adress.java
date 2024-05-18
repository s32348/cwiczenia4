import java.lang.String;
public class Adress {
    public String createAdress(String kraj){
        return String.format("Kraj to: %s", kraj);
    }
    public String createAdress(String kraj,String miasto){
        return String.format("Kraj to: %s, Miasto: %s", kraj, miasto);
    }
    public String createAdress(String kraj,String miasto,String kodPocztowy){
        return String.format("Kraj to: %s Miasto: %s, Kod Pocztowy: %s", kraj, miasto, kodPocztowy);
    }
    public String createAdress(String kraj, String miasto,String kodPocztowy,String ulica){
        return String.format("Kraj to: %s Miasto: %s, Kod Pocztowy: %s, Ulica: %s", kraj, miasto, kodPocztowy, ulica);
    }
    public String createAdress(String kraj, String miasto,String kodPocztowy,String ulica, String nrMieszkania){
        return String.format("Kraj to: %s Miasto: %s, Kod Pocztowy: %s, Ulica: %s, Mieszkanie: %s", kraj, miasto, kodPocztowy, ulica, nrMieszkania);
    }
}
