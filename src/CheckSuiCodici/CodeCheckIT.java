package CheckSuiCodici;

import Eccezioni.CodiceNonConsentitoException;
import Interfacce.CodeChecker;

public class CodeCheckIT implements CodeChecker {
    @Override
    public boolean check(String codice) throws CodiceNonConsentitoException{
        if(!(codice.matches("[IT]{2}[a-zA-Z]{2}\\d{3}"))){
            throw new CodiceNonConsentitoException("Codice non valido");

        }

        return false;

    }
}
