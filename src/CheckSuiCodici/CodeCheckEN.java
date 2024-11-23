package CheckSuiCodici;

import Eccezioni.CodiceNonConsentitoException;
import Interfacce.CodeChecker;

public class CodeCheckEN implements CodeChecker {

    @Override
    public boolean check(String codice) throws CodiceNonConsentitoException {
        if(!(codice.matches("[EN]{2}\\d{2}[a-zA-Z]{2}"))){
            throw new CodiceNonConsentitoException("Codice non valido");

        }

        System.out.println("Code allowed.\n");
        return true;

    }

}
