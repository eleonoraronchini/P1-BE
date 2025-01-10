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
    public void abbassaVolume() {
        if (volume>0){
            volume--;
        }
    }

    @Override
    public void alzaVolume() {
        volume ++;
    }

    public void play() {
        for (int i =0; i<durata; i++) {
            System.out.println(titolo + "!".repeat(volume) + "*".repeat(luminosita));
        }

    }

    @Override
    public void aumentaLuminosita() {
        luminosita++;

    }

    @Override
    public void diminuisciLuminosita() {
        if (luminosita>0){
            luminosita--;
        }

    }
}
