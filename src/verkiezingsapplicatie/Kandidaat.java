package verkiezingsapplicatie;

/**
 *
 * @author GCleophas
 */
public class Kandidaat {
    public String voorNaam;
    public String achterNaam;
    private int kandidaatStemmen;
    
    //Constructors
    public Kandidaat(String voorNaam, String achterNaam) {
        this.voorNaam = voorNaam;
        this.achterNaam = achterNaam;
    }
    
    //Getters
    public String getKandidaatNaam() {
        return voorNaam + " " + achterNaam;
    }
    
    public int getKandidaatStemmen() {
        return kandidaatStemmen;
    }
    
    @Override
    public String toString() {
        return voorNaam + " " + achterNaam + " (Stemmen: " + kandidaatStemmen + ")";
    }
    
    //Setters
    public void setVoorNaam(String voorNaam) {
        this.voorNaam = voorNaam;
    }
    
    public void setAchterNaam(String achterNaam) {
        this.achterNaam = achterNaam;
    }
    
    public void stemKandidaat() {
        kandidaatStemmen++;
    }
}