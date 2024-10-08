import java.util.ArrayList;

public class JSONExport extends Exporter{

    public JSONExport(ArrayList<Artikel> artikel) {
        super(artikel);
    }

    @Override
    public void export() {
        System.out.println("[");
        for (Artikel artikel : getArtikelList()){
            System.out.println(" {");
            System.out.println("  ''Nummer'': " + artikel.getNummer());
            System.out.println("  ''Bezeichnung'': " + artikel.getBezeichnung());
            System.out.println("  ''Einkaufspreis'': " + artikel.getEinkaufspreis());
            System.out.println("  ''Ablaufdatum'': " + artikel.getAblaufdatum());
            System.out.println("  ''Kategorienummer'': " + artikel.getKategorienummer());
            System.out.println(" }");
        }
        System.out.println("]");
    }
}
