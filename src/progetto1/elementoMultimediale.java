package progetto1;

public abstract class elementoMultimediale {
    protected String titolo;

    public elementoMultimediale(String titolo){
        this.titolo = titolo;
    }

    //metodo che ritorna il titolo dell'elemento multimediale
    public String info(){
        return this.titolo;
    }

    //metodo da personalizzare che ritorna la visualizzazione o riproduzione dell'elemento multimediale
    public abstract void start();
    }


