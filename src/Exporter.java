import java.util.ArrayList;

public abstract class Exporter {
    private ArrayList<Artikel> artikelList;

    public Exporter(ArrayList<Artikel> artikel) {
        this.artikelList = artikel;
    }

    public ArrayList<Artikel> getArtikelList() {
        return artikelList;
    }

    public abstract void export();
}
