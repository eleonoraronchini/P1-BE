package progetto1;

public class Main {
    public static void main(String[] args) {

        elementoMultimediale [] player = new elementoMultimediale[5];
        Video v1 = new Video("Nirvana-Smells like teen spirit", 3,5,7);
        Immagine im1 = new Immagine("Primavera", 5);
        Registrazione r1 = new Registrazione("Lezione Back-End",9,5);
        Video v2 = new Video("Nirvana-Nevermind",6,4,8);
        Immagine im2 = new Immagine("Inverno", 9);

        player[1] = v1;
        player[2] = v2;
        player[3] = im1;
        player [4] = im2;
        player [5] = r1;



    }
}
