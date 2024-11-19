package verkiezingsapplicatie;

/**
 *
 * @author GCleophas
 */
public class Stemmen {
    private int partijIndex;
    private int kandidaatIndex;
    
    //Constructor
    public Stemmen(int partijIndex, int kandidaatIndex) {
        this.partijIndex = partijIndex;
        this.kandidaatIndex = kandidaatIndex;
    }
    
    //Getters
    public int getPartijIndex() {
        return partijIndex;
    }
    
    public int getKandidaatIndex() {
        return kandidaatIndex;
    }
}
