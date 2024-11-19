package verkiezingsapplicatie;
import java.util.ArrayList;

/**
 *
 * @author GCleophas
 */
public class Partij {
    public String partijNaam;
    private int partijStemmen;
    public ArrayList<Kandidaat> partijLeden;
    
    //Constructors
    public Partij(String partijNaam) {
        this.partijNaam = partijNaam;
        this.partijLeden = new ArrayList<>();
    }
    
    //Getters
    public String getPartijNaam() {
        return partijNaam;
    }
    
    public int getPartijStemmen() {
        return partijStemmen;
    }
    
    public ArrayList<Kandidaat> getPartijLeden() {
        return partijLeden;
    }
    
    @Override
    public String toString() {
        return partijNaam + " (Stemmen: " + partijStemmen + ")";
    }
    
    //Setters
    public void setPertijNaam(String partijNaam) {
        this.partijNaam = partijNaam;
    }
    
    public void kandidaatWordtLid(Kandidaat kandidaat) {
        partijLeden.add(kandidaat);
    }
    
    public void stemPartij() {
        partijStemmen++;
    }
}
