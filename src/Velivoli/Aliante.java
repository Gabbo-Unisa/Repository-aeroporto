package Velivoli;

public class Aliante extends Aeromobile{
    private Double efficienza;

    public Aliante(String codice, Double efficienza) {
        super(codice);
        this.efficienza = efficienza;
    }

    public Double getEfficienza() {
        return efficienza;
    }

    @Override
    public String toString(){
        return super.toString() + " - Tipo: " + getClass() +
                " - Efficienza: " + getEfficienza();
    }


}
