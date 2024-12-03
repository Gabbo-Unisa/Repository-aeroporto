package Spazi;

import Interfacce.CodeChecker;
import Velivoli.Aeromobile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Aeroporto {
    private CodeChecker checker;
    Set<Aeromobile> aerei = new HashSet<>();

    public Aeroporto(CodeChecker checker){
        this.checker = checker;
    }

    public boolean inserisci(Aeromobile a){
        aerei.add(a);
        if(aerei.contains(a))   return true;
        return false;
    }

    public Aeromobile cerca(String codice){
        for(Aeromobile app : aerei){
            if(app.getCodice().equals(codice))  return app;
        }
        return null;
    }

    public Aeromobile rimuovi(String codice){
        Aeromobile app;
        for(Aeromobile aereo : aerei){
            if(aereo.getCodice().equals(codice)){
                app = aereo;
                aerei.remove(aereo);
                return app;
            }
        }
        return null;
    }

    public int elementi(){
        int i=1;
        for(Aeromobile app : aerei){
            i++;
        }

        return i;
    }

    public void salvaDOS(String nomefile){

    }

//    public static Aeroporto leggiDIS(String nomefile){
//
//    }

    public void salvaOBJ(String nomefile){
        Scanner scanner = null;
        try {
            scanner = new Scanner(Double.parseDouble(System.out);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Non possibile Creare il file quì.");
        } finally {
            scanner.close();
        }

    }

//    public static Aeroporto leggiOBJ(String nomefile){
//
//    }





}
