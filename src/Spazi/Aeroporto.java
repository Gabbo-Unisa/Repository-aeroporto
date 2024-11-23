package Spazi;

import Interfacce.CodeChecker;
import Velivoli.*;

import java.util.Set;
import java.util.TreeSet;

public class Aeroporto {
    private CodeChecker checker;
    Set<Aeromobile> aerei= new TreeSet<>();

    public Aeroporto(CodeChecker checker){
        this.checker = checker;
    }

    public boolean inserisci(Aeromobile a){
        return false;
    }

    public Aeromobile cerca(String codice){

    }

    public Aeromobile rimuovi(String codice){

    }

    public int elementi(){

    }

    public void salvaDOS(String nomefile){

    }

    public static Aeroporto leggiDIS(String nomefile){

    }

    public void salvaOBJ(String nomefile){

    }

    public static Aeroporto leggiOBJ(String nomefile){

    }





}
