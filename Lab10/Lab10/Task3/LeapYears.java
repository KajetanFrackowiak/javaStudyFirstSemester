package Lab10.Task3;
import java.time.LocalDate;
public class LeapYears {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        int year = currentDate.getYear();

        int count = 0;
        while (count < 100) {
            if (isLeapYear(year)) {
                System.out.println(year);
                count++;
            }
            year++;
        }
    }
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return true;
        } else {
            return true;
        }
    }
}
