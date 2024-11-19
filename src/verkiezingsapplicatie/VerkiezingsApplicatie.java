package verkiezingsapplicatie;

/**
 *
 * @author GCleophas
 */
public class VerkiezingsApplicatie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Verkiezing verkiezing2024 = new Verkiezing();
        
        Partij BVNL = new Partij("BVNL");
        BVNL.kandidaatWordtLid(new Kandidaat("Peter","van Haga"));
        BVNL.kandidaatWordtLid(new Kandidaat("agnes","vanAalst"));
        BVNL.kandidaatWordtLid(new Kandidaat("hendick","Dercksen"));
        verkiezing2024.partijen.add(BVNL);
        
        Partij NSC = new Partij("NSC");
        NSC.kandidaatWordtLid(new Kandidaat("Hans","Gotink"));
        NSC.kandidaatWordtLid(new Kandidaat("Saskia","vdMeulen"));
        NSC.kandidaatWordtLid(new Kandidaat("Eric","vMalenstein"));
        verkiezing2024.partijen.add(NSC);
        
        Partij Piraten = new Partij("Piraten Partij");
        Piraten.kandidaatWordtLid(new Kandidaat("Henk","Pontier"));
        Piraten.kandidaatWordtLid(new Kandidaat("Sarah","Sadloe"));
        Piraten.kandidaatWordtLid(new Kandidaat("Jos","vRijn"));
        verkiezing2024.partijen.add(Piraten);
        
        verkiezing2024.getKieslijst();
        verkiezing2024.stemRandom50x();
        verkiezing2024.stemUitbrengen(1, 1);
        verkiezing2024.getResultaten();
    }
    
}
