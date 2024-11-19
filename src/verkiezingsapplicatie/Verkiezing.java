package verkiezingsapplicatie;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author GCleophas
 */
public class Verkiezing {
    public ArrayList<Partij> partijen;
    private ArrayList<Stemmen> stemlijst;
    private Random random;
    
    public Verkiezing () {
        this.partijen = new ArrayList<>();
        this.stemlijst = new ArrayList<>();
        this.random = new Random();
    }
    
    //Getters
    public ArrayList<Partij> getPartijen() {
        return partijen;
    }
    
    public void getKieslijst() {
        System.out.println("Kieslijst:");
        for(int i = 0; i < partijen.size(); i++)
        {
            Partij partij = partijen.get(i);
            System.out.println(i + " " + partij.getPartijNaam());
            for (Kandidaat kandidaat : partij.getPartijLeden()) {
                System.out.println(" - " + kandidaat.getKandidaatNaam());
            }
            System.out.println("\n");
        }
    }
    
    public void getResultaten() {
        System.out.println("Resultaten:");
        for(int i = 0; i< partijen.size(); i++)
        {
            Partij partij = partijen.get(i);
            System.out.println(i + " " + partij.getPartijNaam());
            for(Kandidaat kandidaat : partij.getPartijLeden())
            {
                System.out.println(" - " + kandidaat.toString());
            }
            System.out.println("Totaal aantal stemmen: " + partij.getPartijStemmen() + "\n");
        }
    }
    
    public void getStemmen() {
        System.out.println("Overzicht van de stemmen:");
        for(int i = 0; i< stemlijst.size(); i++)
        {
           Stemmen stemmen = stemlijst.get(i);
           System.out.println(i + " " + stemmen.getPartijIndex() + " " + stemmen.getKandidaatIndex() + "\n");
        }
    }
    
    //Setters
    public void stemUitbrengen(int partijIndex, int kandidaatIndex) {
        Partij partij = partijen.get(partijIndex);
        Kandidaat kandidaat = partij.getPartijLeden().get(kandidaatIndex);
        
        partij.stemPartij();
        kandidaat.stemKandidaat();
        
        stemlijst.add(new Stemmen(partijIndex, kandidaatIndex));
    }
    
    public void stemRandom50x()
    {
        for (int i = 0; i< 50; i++)
        {
            int pIndex = random.nextInt(partijen.size());
            Partij partij = partijen.get(pIndex);
            int kIndex = random.nextInt(partij.getPartijLeden().size());
            Kandidaat kandidaat = partij.getPartijLeden().get(kIndex);
            
            partij.stemPartij();
            kandidaat.stemKandidaat();
            
            stemlijst.add(new Stemmen(pIndex, kIndex));
        }
    }
}
