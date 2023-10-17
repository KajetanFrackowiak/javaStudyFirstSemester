package Wyklad;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws CouldNotReadFileException {
        try {
            rzucamJawnyException(true);
        } catch (IOException e) {
            throw new CouldNotReadFileException("Problem z plikiem: ", e);
        } catch (ClassNotFoundException e) {
        }


        try {
            rzucamNiejawnyException();
        } catch (NullPointerException e) {
            System.out.println("Nie wołaj metod na nulla");
        }

    }

    public static int calculate(int a) {
        return a * a;
    }

    public static void rzucamJawnyException(boolean ktoryException) throws IOException, ClassNotFoundException {
        if (ktoryException) {
            throw new CouldNotReadFileException("To ja, twój jawny exception");
        } else {
            throw new ClassNotFoundException("To ja, twój zupełnie inny exception");
        }
    }

    public static void rzucamNiejawnyException() {
        Integer liczba = null;
        liczba.intValue();
    }
}
