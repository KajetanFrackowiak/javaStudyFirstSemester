package Lab10.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileProcessor {
    private final String trace;

    public FileProcessor(String trace) {
        this.trace = trace;
    }

    public void processFile() {

        try {
            File file = new File(trace);
            Scanner scanner = new Scanner(file);

            int lineNumber = 0;
            int sum = 0;

            while (scanner.hasNext()) {
                lineNumber++;
                String line = scanner.nextLine();
                if (lineNumber % 2 == 0){
                    sum++;
                }
            }
            scanner.close();

            System.out.println("Sum of every other line: " + sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}