package AntraUzduotis;
import org.apache.commons.validator.routines.IBANValidator;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File input = new File("D:\\test\\src\\com\\company\\forTheTest.txt"); // input file with IBAN numbers to check, inside (source file).
            File output = new File("D:\\test\\src\\com\\company\\output.txt"); // Creating empty file, which later will be added with IBAN and if it is correct or not.
            FileWriter myWriter = new FileWriter(output); // Object which makes writing in the file with an argument of the new, empty file object output.
            IBANValidator validator = new IBANValidator(); // Object, which is testing the IBAN if it is correct or not.
            System.out.println("The file has been read successfully. :) ");

            Scanner reader = new Scanner(input); // Scanner object which takes as an argument the source file.
            while (reader.hasNextLine() ) { // checks whole source file, until it has next row/line.
                String data = reader.nextLine(); // data variable stores values of each line scanned by reader of object Scanner.
                boolean isValid = validator.isValid(data); // validator checks if the data variable stored values are correct IBANS or false.
                myWriter.write(data + "; " + isValid + "\n" ); // Writing into empty fales the iban and it's validation result.
                System.out.println(data + "; " + isValid); // Printing out the values to the console.
            }
            myWriter.close();
        } catch (Exception e) {
            System.out.println("The file has not been read successfully. :( ");
            e.printStackTrace();
        }
    }
}
