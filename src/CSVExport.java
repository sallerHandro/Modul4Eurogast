import java.util.ArrayList;

public class CSVExport extends Exporter{

    public CSVExport(ArrayList<Artikel> artikelList) {
        super(artikelList);
    }

    @Override
    public void export() {
        System.out.println("Nummer;Bezeichnung;Einkaufspreis,Ablaufdatum;Kategorienummer");
        for(Artikel artikel : getArtikelList()){
            System.out.println(artikel.getNummer() + ";" + artikel.getBezeichnung() + ";" + artikel.getEinkaufspreis()
            + ";" + artikel.getAblaufdatum() + ";" + artikel.getKategorienummer());
        }
    }
}
