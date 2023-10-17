package Lab10.Task4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateInSpecifiedFormat {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write date format. For Example (dd-MM-yyyy): ");
        String format = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        String formattedDate = now.format(formatter);

        System.out.println(formattedDate);
    }
}
