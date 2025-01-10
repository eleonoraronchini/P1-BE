package progetto1;

public class Video extends elementoMultimediale implements Luminosita, Audio{
    public int volume;
    public int durata;
    public int luminosita;

    public Video(String titolo, int volume, int durata, int luminosita) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
        this.luminosita = luminosita;
    }

    @Override
    public void start() {
        play();
    }

    @Override
    public int abbassaVolume() {
        if (volume>0){
            volume--;
        }
        return volume;
    }

    @Override
    public int alzaVolume() {
        volume ++;
        return volume;
    }

    public void play() {
        for (int i =0; i<durata; i++) {
            System.out.println(titolo + "!".repeat(volume) + "*".repeat(luminosita));
        }

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
        } return luminosita;

    }
}
