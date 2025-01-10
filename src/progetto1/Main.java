package progetto1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        elementoMultimediale [] player = new elementoMultimediale[5];
        Video v1 = new Video("Nirvana-Smells like teen spirit", 3,5,7);
        Immagine im1 = new Immagine("Primavera", 5);
        Registrazione r1 = new Registrazione("Lezione Back-End",9,5);
        Video v2 = new Video("Nirvana-Nevermind",6,4,8);
        Immagine im2 = new Immagine("Inverno", 9);

        player[0] = v1;
        player[1] = v2;
        player[2] = im1;
        player [3] = im2;
        player [4] = r1;

        //prova comandi alza e abbassa volume

        System.out.println(v2.abbassaVolume());
        System.out.println(r1.alzaVolume());

        //prova comandi alza e abbassa luminosita
        System.out.println(v1.aumentaLuminosita());
        System.out.println(im2.diminuisciLuminosita());


       int i;

        Scanner scanner = new Scanner(System.in);

        while (true){
        System.out.println("Seleziona l'elemento (1-5) per riprodurre, premi 0 per uscire");
        i = scanner.nextInt();

        if (i == 0){
            break;
        } if (i == 1){
                v1.start();
        } if (i == 2){
            v2.start();
        } if (i == 3){
            im1.start();
        } if (i == 4){
            im2.start();
        } if (i == 5){
            r1.start();
        } if (i > 5){
            System.out.println("Il numero selezionato non corrisponde a nessun contenuto multimediale");
        }
    }
}}
