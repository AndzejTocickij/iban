package PirmaUzduotis;

import org.apache.commons.validator.routines.IBANValidator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test the iban validator here.


        while (true) {
            System.out.println("Please input IBAN (without spaces between characters): ");
            IBANValidator validator = new IBANValidator();
            Scanner reader = new Scanner(System.in);
            String ibanNumber = reader.next(); // input the iban to check if it is correct

            boolean isValid = validator.isValid(ibanNumber);

            if (isValid) {
                System.out.println("Success ! The IBAN is correct, your IBAN is: " + ibanNumber);
                break;
            } else {
                System.out.println("Not correct please try again.");
            }
        }
    }
}
