package progetto1;

//classe
public class Immagine extends elementoMultimediale implements Luminosita {

    //aggiungo elementi aggiuntivi rispetto a quelli presenti nella superclasse

    public int luminosita;

    //inizializzo la classe con le sue caratteristiche,
    // comprendendo quelle della superclasse

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    @Override
    public void start() {
        show();
    }

    @Override
    public int aumentaLuminosita() {
        luminosita++;
        return luminosita;

    }

    @Override
    public int diminuisciLuminosita() {
        if (luminosita>0){
            luminosita--;
        }
        return luminosita;
    }

    public void show(){
        System.out.println(titolo + "*".repeat(luminosita));

    };
}
