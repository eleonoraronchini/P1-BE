package progetto1;

public class Registrazione extends elementoMultimediale implements Audio {
    public int volume;
    public int durata;

    public Registrazione(String titolo, int volume, int durata) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
    }

    @Override
    public void start() {
        play();
    }

    public int abbassaVolume() {
        if (volume>0) {
            volume--;
        }
        return volume;
    }

    @Override
    public int alzaVolume() {
        volume++;
        return volume;
    }


    public void play() {

        for (int i = 0; i<= durata; i++){
            System.out.println(titolo + "!".repeat(volume));   //repeat serve per ripetere qualcosa n. volte (variabile)
        }

    }

}

