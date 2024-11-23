package Velivoli;

public class AereoAMotore extends Aeromobile{
    private Integer numRotori;

    public AereoAMotore(String codice, Integer numRotori) {
        super(codice);
        this.numRotori = numRotori;

    }

    public Integer getNumRotori() {
        return numRotori;
    }

    @Override
    public String toString(){
        return super.toString() + " - Tipo: " + getClass() +
                " - Numero di rotori: " + getNumRotori();
    }


}
