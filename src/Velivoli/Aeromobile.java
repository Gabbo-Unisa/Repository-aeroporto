package Velivoli;

public abstract class Aeromobile {
    private static String codice;
    private static Integer numeroSequenziale;

    public Aeromobile(String codice, Integer numeroSequenziale) {
        this.codice = codice;
        this.numeroSequenziale = numeroSequenziale;

    }

    public Aeromobile(String codice) {
        this.codice = codice;
    }

    public String getCodice() {
        return codice;
    }

    public Integer getNumeroSequenziale() {
        return numeroSequenziale;
    }

    @Override
    public String toString(){
        return "Aeromobile n° " + getNumeroSequenziale() +"-"+ "Codice: " + getCodice();

    }

}
