package CheckSuiCodici;

import Eccezioni.CodiceNonConsentitoException;
import Interfacce.CodeChecker;
import Velivoli.Aeromobile;

public class CodeCheckIT implements CodeChecker {

    public CodeCheckIT() {
    }

    @Override
    public boolean check(String codice) throws CodiceNonConsentitoException{
        if(!(codice.matches("[IT]{2}[a-zA-Z]{2}\\d{3}"))){
            throw new CodiceNonConsentitoException("Codice non valido");

        }

        System.out.println("Codice consentito\n");
        return true;

    }
}
