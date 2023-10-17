package Lab10.Task2;

import java.io.File;

public class DirectoryAnalyzer {
        public static void main(String[] args) {
                String baseDirPath = "C:\\Users\\Kajetan\\Desktop\\Lab8\\src\\Lab10\\Task2\\__MACOSX\\basedir";

                File baseDir = new File(baseDirPath);
                if (!baseDir.isDirectory()) {
                        System.err.println("Invalid base directory path: " + baseDirPath);
                        return;
                }

                DirectoryScanner directoryScanner = new DirectoryScanner();
                File directoryWithMaxFiles = directoryScanner.findMostFiles(baseDir);
                if (directoryWithMaxFiles == null) {
                        System.out.println("No directories found within the base directory");
                        return;
                }

                int maxFileCount = directoryScanner.countFiles(directoryWithMaxFiles);

                System.out.println("Directory with the most files: " + directoryWithMaxFiles);
                System.out.println("File count: " + maxFileCount);
        }
}