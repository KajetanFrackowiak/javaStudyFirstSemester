package Wyklad;

import java.io.IOException;

public class CouldNotReadFileException extends IOException {
    public CouldNotReadFileException(String message) {
        super("Problem z pliczkiem, wiadomosc to: " + message);
    }
    public CouldNotReadFileException(String message, Throwable throwable) {
        super("Problem z pliczkiem, wiadomosc to: " + message + throwable);
    }
}
