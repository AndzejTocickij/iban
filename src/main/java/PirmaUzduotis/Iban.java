package PirmaUzduotis;

import org.apache.commons.validator.routines.IBANValidator;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class Iban {

    boolean isValid(String iban) {
        IBANValidator validator = new IBANValidator();
        return validator.isValid(iban);
    }

}
